package com.kbb.utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBaseClass {

	protected WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void setUp() {
		driver = Driver.getDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(Configuration.getProperty("url"));
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		//Driver.closeDriver();
	}

}
