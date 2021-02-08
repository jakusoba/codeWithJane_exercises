package com.techelevator;

public class RectangleWall extends Wall {
	private int length;
	private int height;

	public RectangleWall(String name, String color, int length, int height) {
		super(name, color);
		this.length = length;
		this.height = height;
		// TODO Auto-generated constructor stub
	}

	public RectangleWall(String name, String color) {
		super(name, color);
		
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return length * height;
	}

	public int getLength() {
		return length;
	}

	public int getHeight() {
		return height;
	}

	
	
	@Override
	public String toString() {
		return "TEST (" + length + "x"+ height + ") " + "rectangle";
	}
	
	
	
	

	//name (lengthxheight) rectangle
	
	
	

}
