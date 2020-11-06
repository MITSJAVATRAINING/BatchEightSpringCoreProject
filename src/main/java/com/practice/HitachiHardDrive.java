package com.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HitachiHardDrive implements HardDrive {

	@Value("500")
	int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void displayHardDriveName() {
		System.out.println("hey this is Hitachi of size " + size);
	}

}
