package com.epam.loggingtask;


import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class simpleinterestandcompoundinterest {
	private static final Logger LOGGER=LogManager.getLogger(simpleinterestandcompoundinterest.class);
	private static Scanner scannerobject;
	public static void main(String args[])
	{
 
scannerobject = new Scanner(System.in);
 
	      LOGGER.info("enter principal amount:");
	      double principalamount=scannerobject.nextDouble();
	      
	      LOGGER.info("enter interest rate:");
	      double interestrate=scannerobject.nextDouble();
	      
	      LOGGER.info("enter no of years:");
	      double noofyears=scannerobject.nextDouble();
	 
	cleancode classobject=new cleancode();
	      
	      double simpleinterest=classobject.simpleinterest(principalamount,interestrate,noofyears);
	      
	      double compoundinterest=classobject.compoundinterest(principalamount,interestrate,noofyears);
	 
	LOGGER.info("simpleinterest is:"+simpleinterest);
	LOGGER.info("compoundinterest is:"+compoundinterest);
	}
	}


