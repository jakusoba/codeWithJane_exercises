package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTests {
	AnimalGroupName animalGroupName = new AnimalGroupName();
	
	@Test
	public void animalGroupNameTests() {
		Assert.assertEquals("Checking for animalGroupName: ", "Tower", animalGroupName.getHerd("Giraffe"));
		Assert.assertEquals("Checking for animalGroupName: ", "Pride", animalGroupName.getHerd("lion"));
		Assert.assertEquals("Checking for animalGroupName: ", "Murder", animalGroupName.getHerd("crow"));
		Assert.assertEquals("Checking for animalGroupName: ", "unknown", animalGroupName.getHerd(""));
		Assert.assertEquals("Checking for animalGroupName: ", "unknown", animalGroupName.getHerd("fish"));
		Assert.assertEquals("Checking for animalGroupName: ", "Herd", animalGroupName.getHerd("Deer"));
		Assert.assertEquals("Checking for animalGroupName: ", "Float", animalGroupName.getHerd("CROCODILE"));
		Assert.assertEquals("Checking for animalGroupName: ", "Pack", animalGroupName.getHerd("dog"));
		Assert.assertEquals("Checking for animalGroupName: ", "Kit", animalGroupName.getHerd("Pigeon"));
		Assert.assertEquals("Checking for animalGroupName: ", "Pat", animalGroupName.getHerd("Flamingo"));
		
		
	}

}
