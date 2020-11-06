package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Laptop laptop = context.getBean(Laptop.class);
    	
    	
    	laptop.display();
    	
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        
//        Laptop laptop = (Laptop)context.getBean("laptop");
//        
//        Processor processor = (Processor)context.getBean("processor");
//        
//        HardDrive hardDrive = (HardDrive)context.getBean("hardDrive");
//        
//        laptop.setHardDrive(hardDrive);
//        laptop.setProcessor(processor);
//        laptop.display();
        
        
    }
}
