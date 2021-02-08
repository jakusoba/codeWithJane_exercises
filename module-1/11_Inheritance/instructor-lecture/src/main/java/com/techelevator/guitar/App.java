package com.techelevator.guitar;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
	
		
		//superclass - umberOfStrings, String material, String brand
				
		Guitar bass = new BassGuitar(4, "wood", "fender");	
		//bass.setBrand("Fender");
		
		Guitar electric = new ElectricGuitar(6, "plastic", "prs");
		//electric.setBrand("PRS");
		
		Guitar acoustic = new AcousticGuitar(12, "real wood", "gibson");
	    //	acoustic.setBrand("Gibson");	
		((AcousticGuitar) acoustic).strum();
		
		AcousticGuitar accoustic2 = new AcousticGuitar(6, "more wood", "TE Special");
		accoustic2.strum();   // inside the child class
		accoustic2.play();    // inherited
		
		
		
        List<Guitar> guitars = new ArrayList<Guitar>();
        guitars.add(bass);
        guitars.add(electric);
        guitars.add(acoustic);
        guitars.add(accoustic2);
        
        for (Guitar aGuitar : guitars) {
        	
        	System.out.println(aGuitar.getBrand());
        	
        	if (aGuitar instanceof AcousticGuitar) {    // try to avoid but can do it
        		//do acoustic stuff
        		((AcousticGuitar) aGuitar).strum();
        	}
        	else {
        		aGuitar.play();
        	}
      
        }
		
		
	}

}
