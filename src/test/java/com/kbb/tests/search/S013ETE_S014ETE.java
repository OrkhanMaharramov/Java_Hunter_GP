package com.kbb.tests.search;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.kbb.pages.HomePage;
import com.kbb.pages.PriceYourNextCarPage;
import com.kbb.pages.SO13ETE_SO14ETE_Pages;
import com.kbb.pages.VolvoS60SelectPage;
import com.kbb.utilities.TestBaseClass;

public class S013ETE_S014ETE extends TestBaseClass {

	@Test
	public void testS013ETE() {

		HomePage homepage = new HomePage(driver);

		// STEP 1: ’Car Shopping Made Easy’ header on the page is displayed

		String header = "Car Shopping Made Easy";
		assertEquals(header.replaceAll("\\s+", ""), homepage.pageTitle.getText().replaceAll("\\s+", ""));

		// STEP2-3: Hover over to ’Car Values’ tab on top of the page, and click on ’New
		// & Used Car
		homepage.hoverOver();
		assertEquals("Car Values", homepage.carValues.getText());

		// STEP4 Select ’New’ below ’Select a Vehicle’and click ’Used’ from dropdown
		// menu
		PriceYourNextCarPage priceyournextcar = new PriceYourNextCarPage(driver);

		// OPTIONAL VARIBALES VERIFICATION:
		assertEquals("Price Your Next Car", priceyournextcar.pageTitle.getText());
		assertEquals("Select a Vehicle", priceyournextcar.sectionTitle.getText());
		assertEquals("Or Browse New Vehicles by", priceyournextcar.lastTitle.getText());
		assertEquals("New Cars & New Car Prices | Kelley Blue Book", driver.getTitle());

		assertTrue(priceyournextcar.carCondition.isEnabled());
		priceyournextcar.selectCarCondition();

		// STEP5: Click ’Van/Minivan’ from ’Browse New Vehicles By category

		priceyournextcar.clickButtons(priceyournextcar.vanButton);

		// ENTER your ZIP code Pop up
		VolvoS60SelectPage selectpage = new VolvoS60SelectPage(driver);
		selectpage.zipCode.sendKeys("22206");
		selectpage.saveZip.click();

		// assertTrue(driver.getTitle().contains("Vans/Minivans"));

		// STEP6: Click ’Chrysler’ from ’Select a Make’ list

		SO13ETE_SO14ETE_Pages test13_14 = new SO13ETE_SO14ETE_Pages(driver);
		// assertTrue(driver.getTitle().contains("Used Vans/Minivan Category"));

		test13_14.clickButton(test13_14.ChryslerButton);
		
		
		//POP UP WINDOW FEEDBACK
		test13_14.clickButton(test13_14.noThanksPopUp);
		

		// STEP7: Click ’Chrysler Town & Country'from ’Select a Model’ list
		// assertTrue(driver.getTitle().contains("Used Chrysler Vans/Minivans"));

		test13_14.clickButton(test13_14.chryslerTownCountry);

		// STEP8: Click ’Select 2007’ from ’Select a Year’ list:
		/*
		 * assertTrue(driver.getTitle().
		 * contains("Used Chrysler Town & Country Vans/Minivan"))assertTrue(test13_14.
		 * selectYearHeader.isDisplayed());
		 */

		test13_14.chooseButton(test13_14.selectYear2017);
		test13_14.clickButton(test13_14.select2017);

		// STEP9: Click ’Choose this style’ next to ’Minivan 4D’ style

		test13_14.clickButton(test13_14.chooseThisStyle);

		// STEP10: Click ’Choose price type’
		test13_14.chooseButton(test13_14.choosePriceType);

		// STEP11: Click ’Buy from a Dealer’ radio button in ’Select a Price Type’ list
		test13_14.clickButton(test13_14.buyFromDealer);

		// STEP12: Click ’Get used car price’
		test13_14.chooseButton(test13_14.getUsedCarPrice);

		// STEP13: Verify selected car is displayed "Used 2007 Chrysler Town & Country
		// Minivan 4D"
	//	assertTrue(driver.getTitle().contains("Used 2007 Chrysler Town & Country Minivan 4D"));

		// STEP14: Verify pricing details are displayed

		// a) ’Fair Market Range’

		assertTrue(test13_14.fairMarketRange.isDisplayed());

		// b) ’Fair Purchase Price’
		assertTrue(test13_14.fairPurchasePriceAndMonthlyPayment.isDisplayed());

		// c) ’Typic Listing Price’ is displayed
		assertTrue(test13_14.typicalListingPrice.isDisplayed());

	}

}
