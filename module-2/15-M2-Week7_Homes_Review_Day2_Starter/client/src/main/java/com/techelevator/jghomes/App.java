package com.techelevator.jghomes;

import java.math.BigDecimal;
import java.util.Scanner;

import com.techelevator.jghomes.models.Address;
import com.techelevator.jghomes.models.AuthenticatedUser;
import com.techelevator.jghomes.models.Home;
import com.techelevator.jghomes.models.UserCredentials;
import com.techelevator.jghomes.services.AuthenticationService;
import com.techelevator.jghomes.services.AuthenticationServiceException;
import com.techelevator.jghomes.services.HomeService;
import com.techelevator.view.ConsoleService;

public class App {

	private static final String API_BASE_URL = "http://localhost:8080/";

	private static final String MENU_OPTION_EXIT = "Exit";
	private static final String LOGIN_MENU_OPTION_REGISTER = "Register";
	private static final String LOGIN_MENU_OPTION_LOGIN = "Login";
	private static final String[] LOGIN_MENU_OPTIONS = { LOGIN_MENU_OPTION_REGISTER, LOGIN_MENU_OPTION_LOGIN,
			MENU_OPTION_EXIT };

	private static final String MAIN_MENU_OPTION_LIST_ALL_HOMES = "List all homes";
	private static final String MAIN_MENU_OPTION_GET_HOME_BY_ID = "Retrieve home by MLS identifier";
	private static final String MAIN_MENU_OPTION_ADD_HOME = "Add a home";
	private static final String MAIN_MENU_OPTION_DELETE_HOME = "Delete a home";

	private static final String MAIN_MENU_OPTION_LOGIN = "Login as different user";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_LIST_ALL_HOMES,
			MAIN_MENU_OPTION_GET_HOME_BY_ID, MAIN_MENU_OPTION_ADD_HOME, MAIN_MENU_OPTION_DELETE_HOME,
			MAIN_MENU_OPTION_LOGIN, MENU_OPTION_EXIT };

	// I have all the user info you may need after you login .. ;-)
	private AuthenticatedUser currentUser;

	// user interface - console service
	private ConsoleService console;

	// client services
	private AuthenticationService authenticationService;
	private HomeService homeService;
	
	private Scanner scanner;

	public static void main(String[] args) {
		App app = new App(new ConsoleService(System.in, System.out), new AuthenticationService(API_BASE_URL),
				new HomeService(API_BASE_URL));
		app.run();
	}

	public App(ConsoleService console, AuthenticationService authenticationService, HomeService homeService) {
		this.console = console;
		this.authenticationService = authenticationService;
		this.homeService = homeService;
		scanner = new Scanner(System.in);
	}

	public void run() {
		System.out.println("*********************");
		System.out.println("* Welcome to JG Homes! *");
		System.out.println("*********************");

		registerAndLogin();
		mainMenu();
	}

	private void mainMenu() {
		while (true) {
			String choice = (String) console.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			if (MAIN_MENU_OPTION_LIST_ALL_HOMES.equals(choice)) {
				listAllHomes();
			} else if (MAIN_MENU_OPTION_GET_HOME_BY_ID.equals(choice)) {
				getHomeByMLSID();
			} else if (MAIN_MENU_OPTION_ADD_HOME.equals(choice)) {
				addHome();
			} else if (MAIN_MENU_OPTION_DELETE_HOME.equals(choice)) {
				deleteHome();
			} else if (MAIN_MENU_OPTION_LOGIN.equals(choice)) {
				login();
			} else {
				// the only other option on the main menu is to exit
				exitProgram();
			}
		}
	}

	private void listAllHomes() {
		Home[] homes = homeService.retrieveListOfHomes();
		printListOfHomes(homes);

	}

	private void getHomeByMLSID() {
		Home home = homeService.retrieveHomesByMLSID(getMLSNumberFromUser());
		printHome(home);
	}

	private void addHome() {
		homeService.addHome(getHomeInfo());
	}

	private void deleteHome() {
		homeService.deleteHome(promptUserForMLSNumberToDelete());
	}

	private void exitProgram() {
		System.exit(0);
	}

	private void registerAndLogin() {
		while (!isAuthenticated()) {
			String choice = (String) console.getChoiceFromOptions(LOGIN_MENU_OPTIONS);
			if (LOGIN_MENU_OPTION_LOGIN.equals(choice)) {
				login();
			} else if (LOGIN_MENU_OPTION_REGISTER.equals(choice)) {
				register();
			} else {
				// the only other option on the login menu is to exit
				exitProgram();
			}
		}
	}

	/*
	 * Current user is not null IF they have been authenticated.
	 */
	private boolean isAuthenticated() {
		return currentUser != null;
	}

	private void register() {
		System.out.println("Please register a new user account");
		boolean isRegistered = false;
		while (!isRegistered) // will keep looping until user is registered
		{
			UserCredentials credentials = collectUserCredentials();
			try {
				authenticationService.register(credentials);
				isRegistered = true;
				System.out.println("Registration successful. You can now login.");
			} catch (AuthenticationServiceException e) {
				System.out.println("REGISTRATION ERROR: " + e.getMessage());
				System.out.println("Please attempt to register again.");
			}
		}
	}

	private void login() {
		System.out.println("Please log in");
		currentUser = null;
		while (currentUser == null) // will keep looping until user is logged in
		{
			UserCredentials credentials = collectUserCredentials();
			try {
				currentUser = authenticationService.login(credentials);
				
				//we need to grab the AUTH TOKEN from current user and set it on the student service
				//so the student service has the token for it's requests. (We only need the token on
				//service methods that are protected by a login. In this example code, all the service 
				//methods require login.  
				homeService.setAUTH_TOKEN(currentUser.getToken());				
				
				
				
			} catch (AuthenticationServiceException e) {
				System.out.println("LOGIN ERROR: " + e.getMessage());
				System.out.println("Please attempt to login again.");
			}
		}
	}

	private UserCredentials collectUserCredentials() {
		String username = console.getUserInput("Username");
		String password = console.getUserInput("Password");
		return new UserCredentials(username, password);
	}

	private String getMLSNumberFromUser() {

		System.out.println("\nPlease enter a valid MLS number");
		return scanner.nextLine();

	}

	private String promptUserForMLSNumberToDelete() {

		System.out.println("\nPlease enter a MLS number for the home you wish to delete:");
		return scanner.nextLine();

	}

	private void printListOfHomes(Home[] homes) {

		System.out.println("\n*********** Listing Results ************\n");

		if (homes.length == 0) {
			System.out.println("No Results Found!");
			return;
		}

		for (Home home : homes) {

			printHome(home);

		}

	}

	private void printHome(Home home) {

		if (home == null) {
			System.out.println("No results found... Please try again.");
			return;
		}

		System.out.println("MLS Number: " + home.getMlsNumber());

		if (home.getAddress() != null) {
			System.out.println(
					"Street Address: " + " " + home.getAddress().getAddressLine() + " " + home.getAddress().getCity()
							+ " " + home.getAddress().getState() + " " + home.getAddress().getZipCode() + "\n");
		}

		System.out.println(String.format("%-25s %s", "Bedrooms: ", home.getNumberOfBedrooms()));
		System.out.println(String.format("%-25s %s", "Bathrooms: ", home.getNumberOfBathrooms()));
		System.out.println(String.format("%-25s %s", "Description: ", home.getShortDescription()));
		System.out.println(String.format("%-25s $%s", "Price: ", String.format("%.2f", home.getPrice())));

		System.out.println("\n*********** *** *** ***  ************\n");

	}

	private Home getHomeInfo() {

		Home home = new Home();

		System.out.println("Enter the MLS Number this house is being listed under");
		String mls = scanner.nextLine();
		home.setMlsNumber(mls);

		// call private method below to get the address from user
		Address address = getAddressInfo();
		home.setAddress(address);

		System.out.println("Enter the number of Bedrooms: ");
		String numberOfBedrooms = scanner.nextLine();
		home.setNumberOfBedrooms(Double.parseDouble(numberOfBedrooms));

		System.out.println("Enter the number of Bathrooms: ");
		String numberOfBathrooms = scanner.nextLine();
		home.setNumberOfBathrooms(Double.parseDouble(numberOfBathrooms));

		System.out.println("Enter a short description of the property: ");
		home.setShortDescription(scanner.nextLine());

		System.out.println("What is the listing price of this property?");
		String priceAsString = scanner.nextLine();
		// home.setPrice(Double.parseDouble(priceAsString));
		home.setPrice(new BigDecimal(priceAsString));

		return home;

	}

	private void printMessage(String message) {
		System.out.println(message);
	}

	private Address getAddressInfo() {
		Address address = new Address();

		System.out.println("\nEnter address Line 1: ");
		address.setAddressLine(scanner.nextLine());

		System.out.println("\nEnter the city name: ");
		address.setCity(scanner.nextLine());

		System.out.println("\nEnter the state: ");
		address.setState(scanner.nextLine());

		System.out.println("\nEnter the zip code: ");
		String zip = scanner.nextLine();
		address.setZipCode(Integer.parseInt(zip));

		return address;
	}

}
