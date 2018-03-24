package com.kbb.tests.search;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.kbb.pages.HomePage;
import com.kbb.pages.PriceYourNextCarPage;
import com.kbb.pages.muhammadPages.homePage;
import com.kbb.utilities.TestBaseClass;

public class S009FN_S010FN extends TestBaseClass {

	
	homePage page = new homePage();
	
	@Test
	public void test09() {
		assertEquals(page.pageTitle.getText(), "Car Shopping\nMade Easy");
		
		Actions action = new Actions(driver);
		action.moveToElement(page.hoverOver).perform();
		
		assertEquals(page.data1.getText(), "New & Used Car Prices");
		assertEquals(page.data2.getText(), "Trade-in & Private Party Values");
		assertEquals(page.data3.getText(), "Instant Cash Offer");
		
		page.data1.click();
		
		assertTrue(page.newAndUsedCarPageDispalyed.isDisplayed());
		
		assertTrue(page.newPageElement1.isDisplayed());
		assertTrue(page.newPageElement2.isDisplayed());
		assertTrue(page.newPageElement3.isDisplayed());
		
		page.newBox.click();
		page.certifiedPreowned.click();
		
		page.yearBox.click();
		page.pick2018.click();
		
		page.makeBox.click();
		page.pickFord.click();
		
		page.modelBox.click();
		page.pickFusion.click();
		
		page.nextButton.click();
		
		page.zipcodeBox.sendKeys("22030");
		page.clickSave.click();
		
		assertEquals(page.getYourUsedCarPriceDisplayed.getText(), "Get Your Used Car Price");
		//assertEquals(page.yourSelectedCarIsDisplayed.getText(), "Titanium Sedan 4D");
		
		page.clickChooseThisStyle.click();
		
		page.getYourUsedCarPriceDisplayed.isDisplayed();
		page.carNameIsDisplayed.isDisplayed();
		page.carStyleIsDisplayed.isDisplayed();
		page.carMileageIsDisplayed.isDisplayed();
		
		page.carMileageIsDisplayed.clear();
		page.carMileageIsDisplayed.sendKeys("0000");
		//assertTrue(page.carMileageIsDisplayed2.isDisplayed());
		
		page.clickChoosePriceType.click();
		assertTrue(page.enterValidMileage.isDisplayed());
	}

}
