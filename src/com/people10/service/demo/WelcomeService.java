package com.people10.service.demo;

import java.util.List;
import java.util.ArrayList;

public class WelcomeService {
	
	public List<String> getWelcomeMessage(String name) {
		List<String> myWelcomeMessage = new ArrayList<>();
		
		//Adding data
		myWelcomeMessage.add("Hello! ");
		myWelcomeMessage.add(name);
		myWelcomeMessage.add(", welcome to my first web thing");	
		
		return myWelcomeMessage;
	}
}
