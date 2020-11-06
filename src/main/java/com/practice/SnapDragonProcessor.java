package com.practice;

import org.springframework.stereotype.Component;

@Component
public class SnapDragonProcessor implements Processor {

	public void displayProcessor() {
		System.out.println("Welcome to snapdragon");
	}

}
