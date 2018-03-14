package com.kbb.utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseClass {
	protected WebDriver driver;
	@Parameters("browser")
	@BeforeClass (alwaysRun=true)
	public void setUp() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

			driver.get(Configuration.getProperty("url"));
	}
	
	@AfterClass  (alwaysRun=true)
	public void tearDown() {
		Driver.quit();
	}
}
