package com.techelevator;

public class SquareWall extends RectangleWall {
	private int sideLength;

	public SquareWall(String name, String color, int sideLength) {
		super(name, color);
		this.sideLength = sideLength;
		
	}
	
	
	//name (sideLengthxsideLength) square
	
	@Override
	public String toString() {
		return "TEST (" + sideLength + "x"+ sideLength + ") " + "square";
	}
	
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return sideLength * sideLength;
	}
	

}
