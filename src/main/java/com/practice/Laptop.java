package com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	/**
	 * Types of Autowiring
	 * 
	 * 1.	Default Autowiring
	 * 2. 	Autowiring byName
	 * 3. 	Autowiring by setter method. 
	 * 4. 	Autowiring by constructor.
	 * 
	 * **/

	
	HardDrive hardDrive;
	Processor processor;
	
	public Laptop(@Autowired
			@Qualifier("hitachiHardDrive") HardDrive hardDrive, @Autowired
			@Qualifier("snapDragonProcessor") Processor processor) {
		this.hardDrive = hardDrive;
		this.processor = processor;
	}

	public HardDrive getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(HardDrive hardDrive) {
		this.hardDrive = hardDrive;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	
	public void display() {
		System.out.println("Laptop created ......");
		hardDrive.displayHardDriveName();
		processor.displayProcessor();
	}

}
