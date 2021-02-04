package com.techelevator.homes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class NewHomeReport {
	
	
	private PrintWriter writer;
	
	public NewHomeReport(String fileName) {
		try {
			writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
		} 
		catch (IOException e) {				
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void writeRecord(Home newHome) {
		String text = String.format("%-25s %-25s ", newHome.getMlsNumber(), newHome.getShortDescription());
		writer.println(text);
		writer.flush();
	}
	
	public void closeFile() {
		writer.flush();
		writer.close();
	}
	
	
	
	

}
