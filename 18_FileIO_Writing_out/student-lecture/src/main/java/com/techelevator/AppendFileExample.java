package com.techelevator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendFileExample {

	public static void main(String[] args) {
		// This is an example of how you can append to the end of an existing file 
		// instead of creating a new file each time. We have to wrap
		
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("outputFileAppended.txt", true)))) {
		    out.println("the text");
		}catch (IOException e) {
		    System.err.println(e);
		}
		

	}

}
