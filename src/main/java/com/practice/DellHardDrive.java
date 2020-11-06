package com.practice;

import org.springframework.stereotype.Component;

@Component
public class DellHardDrive implements HardDrive {

	public void displayHardDriveName() {
		System.out.println("Hey this is Dell");
	}
}
