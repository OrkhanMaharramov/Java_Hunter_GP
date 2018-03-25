package com.kbb.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBaseClass {

	protected WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void setUp() {
		driver = Driver.getDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(Configuration.getProperty("url"));
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
	//	Driver.closeDriver();
	}
	
	//WHEN WE RUN OUR TEST CASES WE NEED TO COMMAND IT OUT
	//OTHERWISE JUST FIRST TEST CASE WILL PASS
	
//	@BeforeMethod(alwaysRun = true)
//	public void setUpMethod() {
//		driver = Driver.getDriver();
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		driver.get(Configuration.getProperty("url"));
//	}
//	
//	
//	@AfterMethod(alwaysRun=true)
//	public void tear() {
//		Driver.closeDriver();
//	
//	}

}
