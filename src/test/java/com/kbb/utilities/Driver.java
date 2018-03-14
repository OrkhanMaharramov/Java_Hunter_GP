package com.kbb.utilities;

import org.openqa.selenium.WebDriver;

public class Driver {
	private static WebDriver driver;

	public static WebDriver getDriver() {
	
		return driver;
	}



	public static void quit() {
		if(driver !=null) {
			driver.quit();
			driver=null;
		}
	}
}
