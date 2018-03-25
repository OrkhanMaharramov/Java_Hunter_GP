package com.kbb.tests.search;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

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
		assertEquals(new homePage().yourSelectedCarIsDisplayed.getText(), "Titanium Sedan 4D");
		
		page.clickChooseThisStyle.click();
		
		assertTrue(page.getYourUsedCarPriceDisplayed.isDisplayed());
		assertTrue(page.carNameIsDisplayed.isDisplayed());
		assertTrue(page.carStyleIsDisplayed.isDisplayed());
		assertTrue(page.carMileageIsDisplayed.isDisplayed());
		
		page.carMileageIsDisplayed.clear();
		page.carMileageIsDisplayed.sendKeys("0000");
		assertEquals(page.carMileageIsDisplayed2.getAttribute("value"),"0000");
		
		page.scrollDown(page.clickChoosePriceType);
						
		assertTrue(new homePage().enterValidMileage.isDisplayed());
	
	}
	
	
	@Test
	public void testS010FN() throws InterruptedException {
		
		assertEquals(page.pageTitle.getText(), "Car Shopping\nMade Easy");
		
		Actions action = new Actions(driver);
		action.moveToElement(page.hoverOver).perform();
		
		assertEquals(page.data1.getText(), "New & Used Car Prices");
		assertEquals(page.data2.getText(), "Trade-in & Private Party Values");
		assertEquals(page.data3.getText(), "Instant Cash Offer");
		
		page.data1.click();
		
		page.makeBox.click();
		page.selectCar.click();
		page.modelBox.click();
		page.selectModel.click();
		page.clickNextTest2.click();
		page.zipcodeBox.sendKeys("22031");
		page.clickSave.click();
		
		// rest of the test case is written wrongly so could go beyond the steps above
		
		
	}

}
