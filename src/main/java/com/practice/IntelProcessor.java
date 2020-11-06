package com.practice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class IntelProcessor implements Processor {

	public void displayProcessor() {
		System.out.println("Welcome to Intel");
	}

}
