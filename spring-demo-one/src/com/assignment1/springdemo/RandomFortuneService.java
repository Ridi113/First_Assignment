package com.assignment1.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = { 
			"Eat, sleep, code.",
			"Read, practice.",
			"Sing and dance. :P "
	};
	
	// create a random number generator
	private Random myRandom = new Random();
		
	@Override
	public String getFortune() 
	{
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}


