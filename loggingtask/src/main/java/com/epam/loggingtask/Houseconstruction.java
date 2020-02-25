package com.epam.loggingtask;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Houseconstruction {
private static final Logger LOGGER=LogManager.getLogger(Houseconstruction.class);
private static Scanner scannerobject;
	public static void main(String[] args) {
	
		scannerobject = new Scanner(System.in);
		
		
		 LOGGER.info("Enter your choice:\n1:Standard Materials\n2:AboveStandard Materials\n3:HighlyStandard Materials\n4:FullyAutomated");
		int choice=scannerobject.nextInt();		                         
		
		 LOGGER.info("enter total area of house in square feet");
		int totalarea=scannerobject.nextInt();
		
client clientobject=new client();		
		
      clientobject.constructioncost(choice,totalarea);
              
  }

}

