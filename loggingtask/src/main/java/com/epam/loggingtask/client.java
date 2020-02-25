package com.epam.loggingtask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class client {
	private static final Logger LOGGER=LogManager.getLogger(client.class);

	public void constructioncost(int choice, int totalarea) {
		
		switch(choice) {
		case 1:Standard(totalarea);
		      break;
		case 2:AboveStandard(totalarea);
		      break;
		case 3:HighlyStandard(totalarea);
		      break;
		case 4:FullyAutomated(totalarea);
              break;
		}
	}
    private void Standard(int totalarea) {
    
    	LOGGER.info("total construction cost is:"+ 1200*totalarea);
		
	}

	private void AboveStandard(int totalarea) {
		
		LOGGER.info("total construction cost is:"+ 1500*totalarea);
		 
	}

	private void HighlyStandard(int totalarea) {
		
		LOGGER.info("total construction cost is:"+ 1800*totalarea);
		
	}

	private void FullyAutomated(int totalarea) {
		
		LOGGER.info("total construction cost is:"+ 2500*totalarea);
		
	}

}
