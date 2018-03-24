package com.kbb.tests.search;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.kbb.pages.CarValuesPage;
import com.kbb.pages.HomePage;
import com.kbb.utilities.TestBaseClass;

public class SearchTest_2_Phase extends TestBaseClass {

	// @Test
	public void testCaseS015ETE() throws InterruptedException {
		HomePage homepage = new HomePage(driver);
		CarValuesPage carValuesPage = new CarValuesPage(driver);
		homepage.hoverOver();
		homepage.selectVehicle(1);
		carValuesPage.sedan.click();
		carValuesPage.handleZipSection();
		carValuesPage.toyota.click();
		carValuesPage.scrollDown(carValuesPage.toyotaCamry);
		carValuesPage.tryCatch(carValuesPage.noThanks);
		carValuesPage.scrollDown(carValuesPage.select2014);
		carValuesPage.chooseThisStyleBtn.click();
		carValuesPage.mileage.sendKeys("54000");
		carValuesPage.tryCatch(carValuesPage.noThanks);
		carValuesPage.choosePriceTypeBtn.click();
		carValuesPage.tryCatch(carValuesPage.noThanks);
		carValuesPage.getUsedCarPriceBtn.click();
		assertTrue(carValuesPage.selectedCarText.isDisplayed());
		JavascriptExecutor jsExecuter = (JavascriptExecutor) driver;
		jsExecuter.executeScript("arguments[0].scrollIntoView(true)", carValuesPage.buyFrom);

	}

	@Test
	public void testCaseS016ETE() throws InterruptedException {
		HomePage homepage = new HomePage(driver);
		CarValuesPage carValuesPage = new CarValuesPage(driver);

		homepage.hoverOver();
		homepage.selectMakeByText("Volvo");
		Thread.sleep(2000);
		homepage.selectModel("S60");
		Thread.sleep(2000);
		homepage.nextButton.click();
		carValuesPage.handleZipSection();
		assertEquals(driver.getTitle(), "Volvo S60 | Kelley Blue Book");
		String first = driver.getTitle();
		driver.get("http://www.kbb.com");
		homepage.hoverOver();
		carValuesPage.sedan.click();
		assertEquals(driver.getTitle(), "Sedan Category | Kelley Blue Book");
		carValuesPage.volvo.click();
		assertEquals(driver.getTitle(), "Volvo Sedan Models | Kelley Blue Book");
		carValuesPage.selectS60.click();
		assertEquals(driver.getTitle(), "Volvo S60 | Kelley Blue Book");
		String second = driver.getTitle();

		assertEquals(first, second);

	}

}
