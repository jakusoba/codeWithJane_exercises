package com.techelevator.fly;

import java.util.ArrayList;
import java.util.List;

public class FlyingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bird bird = new Bird();
		bird.fly();


		Drone drone = new Drone();
		drone.fly();


		
		Flyable bigBird = new Bird();		
		Flyable bigDrone = new Drone();
		
		List<Flyable> thingsThatFly = new ArrayList<Flyable>();
		thingsThatFly.add(bigBird);
		thingsThatFly.add(bigDrone);
		thingsThatFly.add(bird);
		thingsThatFly.add(drone);
		
		
		for (Flyable fly : thingsThatFly) {
			
			fly.fly();
		}
		
		
		
		
	//	List<String> list = new StevesList();
		
		
		
		bigDrone.fly();
		bigBird.fly();
		
		
		

	}

}
