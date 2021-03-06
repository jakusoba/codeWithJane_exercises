package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		System.out.println("1. " + remainingNumberOfBirds);

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println("2. " + numberOfExtraBirds);

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int totalnumberOfRaccoons =  3;
		int numberRacconsPlayingInTheWoods = 2; 
		int numberRacconsLeft = totalnumberOfRaccoons -  numberRacconsPlayingInTheWoods;
		System.out.println("3. " + numberRacconsLeft);
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int numberFlowersLeft = numberOfFlowers - numberOfBees;
		System.out.println("4. " + numberFlowersLeft );
		

        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int firstPigeon = 1;
		int secondPigeon = 1;
		int totalNumberOfPigeons = firstPigeon + secondPigeon;
		System.out.println("5. " +  totalNumberOfPigeons);
		
		

        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int numberOfFirstSetOwls = 3;
		int numberOfSecondSetOwls = 2;
		int totalnumberOfOwls = numberOfFirstSetOwls + numberOfSecondSetOwls;
		System.out.println("6. " +  totalnumberOfOwls );

        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int numberOfBeaversWorkingOntheirHome = 2;
		int numberOfBeaversWhowentSwimming = 1;
		int numberOfBeaversStillWorkingOnTheirHome = numberOfBeaversWorkingOntheirHome - numberOfBeaversWhowentSwimming;
		System.out.println("7. " +  numberOfBeaversStillWorkingOnTheirHome );
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int numberOftoucansSittingOnATreeLimb = 2;
		int numberOftoucansJoining = 1;
		int totalnumberOfToucans =  numberOftoucansSittingOnATreeLimb + numberOftoucansJoining ;
		System.out.println("8. " + totalnumberOfToucans   );
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int numberOfSquirrels = 4;
		int numberOfNuts = 2;
		int squirrelsLeft = numberOfSquirrels - numberOfNuts;
		System.out.println("9. " +  squirrelsLeft );
		
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		int quarterInCents  = 25;
		int dimeInCents = 10;
		int twoNickelInCents  = 10;
		int totalNumberOfMoney = quarterInCents  + dimeInCents + twoNickelInCents;
		System.out.println("10. " + totalNumberOfMoney );
		
		

        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int numOfMuffinsBakedByMrsBrierClass = 18;
		int numOfMuffinsBakedByMrsMacAdamClass = 20;
		int numOfMuffinsBakedByMrsFlanneryClass = 17;
		int totalNumOfMuffins = numOfMuffinsBakedByMrsBrierClass +  numOfMuffinsBakedByMrsMacAdamClass +  numOfMuffinsBakedByMrsFlanneryClass;
		System.out.println("11. " + totalNumOfMuffins );
		

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		int priceOfYoyo = 24;
		int priceOfWhistle = 14;
		int priceOfBothToysInCents = priceOfYoyo + priceOfWhistle; 
		System.out.println("12. " + priceOfBothToysInCents);
		
		

        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int numOfLargeMarshMallows = 10;
		int numOfMiniMarshMallows = 10;
		int totalNumOfMarshMallows = numOfLargeMarshMallows + numOfMiniMarshMallows;
		System.out.println("13. " + totalNumOfMarshMallows);
		

        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int heightOfSnowAtMrsHiltHouse = 29;
		int heightOfSnowAtBrecknockElementarySchool = 17;
		int heightOfSnowLeftATMrsHiltHouse  = heightOfSnowAtMrsHiltHouse - heightOfSnowAtBrecknockElementarySchool;
		System.out.println("14. " + heightOfSnowLeftATMrsHiltHouse);
		

        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int initialAmountInDollars = 10;
		int amountOfDollarsSpentOnToyTruck = 3;
		int amountOfDollarsSpentOnPencilCase = 2;
		int amountOfDollarsLeft = initialAmountInDollars - (amountOfDollarsSpentOnToyTruck + amountOfDollarsSpentOnPencilCase);
		System.out.println("15. " + amountOfDollarsLeft );

        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int initialAmountOfMarbles = 16;
		int numOfMarblesLost = 7;
		int numOfMarblesLeft =  initialAmountOfMarbles - numOfMarblesLost;
		System.out.println("16. " + numOfMarblesLeft );

        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int currentNumOfSeashells = 19;
		int requiredNumOfSeashells = 25;
		int numOfSeashellsLeft = requiredNumOfSeashells - currentNumOfSeashells;
		System.out.println("17. " + numOfSeashellsLeft );
		

        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalnumOfBallons = 17;
		int numOfRedBallons = 8;
		int numOfGreenBallons = totalnumOfBallons - numOfRedBallons;
		System.out.println("18. " + numOfGreenBallons );
		

        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		
		int currentNumOfBooks = 38;
		int additionalNumofBooks = 10;
		int totalNumOfBooks = currentNumOfBooks + additionalNumofBooks ;
		System.out.println("19. " + numOfGreenBallons);
		
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int numOfBees = 6;
		int numOfLegsPerBees = 8;
		int totalNumOfLegs = numOfBees * numOfLegsPerBees;
		System.out.println("20. " + totalNumOfLegs);
		

        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		 int CostOfCream = 99;
	     int numOfCreams = 2;
	     int totalCostOfCreams = CostOfCream * numOfCreams;
	     System.out.println("21. " + totalCostOfCreams);

        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		 int RocksNeeded = 125;
	     int currentRocks = 64;
	     int rocksLeft = RocksNeeded - currentRocks;
	     System.out.println("22. " + rocksLeft);

        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		  int startMarbles = 38;
	      int lostMarbles = 15;
	      int leftMarbles = startMarbles - lostMarbles;
	      System.out.println("23. " + leftMarbles);
	      

        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int distanceTotal = 78;
        int distanceTraveled = 32;
        int distanceLeft = distanceTotal - distanceTraveled;
        System.out.println("24. " + distanceLeft);
        

        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		 int snowSatMorn = 90;
	     int snowSunNoon = 45;
	     int totaltimeOnSnow = snowSatMorn + snowSunNoon;
	     System.out.println("25. " + totaltimeOnSnow);
        
	     /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
	    int dogNum = 6;
        double dogCost = 0.50;
        double totalDogCost = dogCost * dogNum;
        System.out.println("26. " + totalDogCost );
        

        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		  int currentAmtOfMoney = 50;
	      int PencilCost = 7;
	      int pencilsSheCanBuy = currentAmtOfMoney / PencilCost; 
	      System.out.println("27. " + pencilsSheCanBuy  );
	      

        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalButterflies = 33;
        int orangeButterFlies = 20;
        int redButterFlies = totalButterflies  - orangeButterFlies;
        System.out.println("28. " +  redButterFlies  );
        

        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		 int paid = 1;
	     double cost = .54;
	     double change = paid - cost;
	     System.out.println("29. " +  change    );
	     

        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		 int currentNumOftrees = 13;
	     int treesPlanted = 12;
	     int treesTotal = currentNumOftrees + treesPlanted;
	     System.out.println("30. " +  treesTotal    );
	     
	     
	     

        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		  int hoursInDay = 24;
	      int numDays = 2;
	      int hoursLeftToSeeGM = hoursInDay * numDays;
	      System.out.println("31. " +    hoursLeftToSeeGM );
	     
	      

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int cousins = 4;
        int gumPerCousin = 5;
        int gumTotal = cousins * gumPerCousin;
        System.out.println("32. " +    gumTotal  );
        
		

        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        
        */
		int danMoney = 3;
        int CostOfCandy = 1;
        int danMoneyLeft = danMoney - CostOfCandy;
        System.out.println("33. " +    danMoneyLeft  );
        

        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boats = 5;
        int peoplePerBoat = 3;
        int totalPeople = boats * peoplePerBoat;
        System.out.println("34. " +   totalPeople  );

        
        

        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int initialLegos = 380;
        int lostLegos = 57;
        int currentLegos = initialLegos - lostLegos;
        System.out.println("35. " +   currentLegos );

        

        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		  int currentMufs = 35;
	      int DesiredMufs = 83;
	      int MufsToBake =  currentMufs - DesiredMufs ;
	      System.out.println("36. " +   MufsToBake);

        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayons = 1400;
        int lucyCrayons = 290;
        int willyCrayonsMoreThanLucys = willyCrayons - lucyCrayons;
        System.out.println("37. " +   willyCrayonsMoreThanLucys);
        
        /*

        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		 int stickPerPage = 10;
	     int numPages = 22;
	     int totalSticks = stickPerPage * numPages;
	     System.out.println("38. " +   totalSticks);
	     

        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int cupcakes = 96;
        int children = 8;
        int cupcakePerChild = cupcakes / children;
        System.out.println("39. " +   cupcakePerChild);
        

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int cookies = 47;
        int cookiesPerJar = 6;
        int cookiesNotInJar = cookies % cookiesPerJar;
        System.out.println("40. " +   cookiesNotInJar );
        

        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int croissants = 59;
        int neighbours = 8;
        int breadNotGivenToNeighbours = croissants % neighbours;
        System.out.println("41. " + breadNotGivenToNeighbours );
        
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesPerTray = 12;
        int totalCookiesWanted = 276;
        int numTraysToBake = totalCookiesWanted / cookiesPerTray;
        System.out.println("42. " + numTraysToBake);
        
        
		

        /*
        43. Marian???s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		 int pretzelNum = 480;
	     int oneServing = 12;
	     int servingsNumPrepared = pretzelNum / oneServing;
	     System.out.println("43. " + servingsNumPrepared);
			
	     

        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCakeNum = 53;
        int lemonCakeLeft = 2;
        int lemonCakesPerBox = 3;
        int lemonCakeBoxesGiven = (lemonCakeNum - lemonCakeLeft) / lemonCakesPerBox;
        System.out.println("44. " + lemonCakeBoxesGiven);
		

        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */

        int carrotSticksNum = 74;
        int people = 12;
        int carrotSticksPerPerson = carrotSticksNum % people;
        System.out.println("45. " + carrotSticksPerPerson );
		
        

        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
       
        */
		int totalNumOfTeddyBears = 98;
		int numOfTeddyBearPerShelf = 7;
		int numOfShelvesUsed = totalNumOfTeddyBears - numOfTeddyBearPerShelf ;
		System.out.println("46. " + numOfShelvesUsed );
		

        /*
        47. Susie???s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int maxNumOfPicturesPerAlbum = 20;
		int numOfPictures = 480;
		int totalNumOfAlbumsNeeded = numOfPictures / maxNumOfPicturesPerAlbum;
		System.out.println("47. " + totalNumOfAlbumsNeeded );
		

        /*
        48. Joe, Susie???s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int numOfTradingCards = 94;
		int maxNumOfCardsInABox = 8;
		int numOfFilledBoxes = numOfTradingCards / maxNumOfCardsInABox;
		int numOfCardsInUnfilledBox = numOfTradingCards % maxNumOfCardsInABox;
		System.out.println("48. " + numOfFilledBoxes  + ", " + numOfCardsInUnfilledBox);
		

        /*
        49. Susie???s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int numOfBooks = 210;
		int numOfShelves = 10;
		int numOfBooksPerShelf = numOfBooks / numOfShelves;
		System.out.println("49. " + numOfBooksPerShelf);

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double numOfCroissantsBaked = 17;
		double numOfGuests = 7;
		double numOfCroissantPerGuest = numOfCroissantsBaked / numOfGuests;
		System.out.println("50. " + numOfCroissantPerGuest );
		

        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


	}

}
