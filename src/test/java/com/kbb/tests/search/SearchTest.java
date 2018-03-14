package com.kbb.tests.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.kbb.pages.HomePage;
import com.kbb.utilities.TestBaseClass;


public class SearchTest extends TestBaseClass {
	@Test (priority=1)
	public void searchTest() {
		HomePage homepage=new HomePage(driver);
		homepage.hoverOver();
//		WebDriverWait wait =new WebDriverWait(driver, 2);
//		wait.until(ExpectedConditions.visibilityOf(homepage.newAndUsedCar));
	}
}
