package com.techelevator.exceptions;

public class JavaGreenException extends Exception {
	
	private int whatDayOfWeek;
	
	public JavaGreenException(String msg, int whatDayOfWeek) {
		super(msg);
		this.whatDayOfWeek = whatDayOfWeek;
	}

	public int getWhatDayOfWeek() {
		return whatDayOfWeek;
	}
	
	

}
