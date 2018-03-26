package com.kbb.tests.search;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.kbb.pages.HomePage;
import com.kbb.pages.PriceYourNextCarPage;
import com.kbb.pages.SO13ETE_SO14ETE_Pages;
import com.kbb.pages.VolvoS60SelectPage;
import com.kbb.utilities.TestBaseClass;

public class S013ETE_S014ETE extends TestBaseClass {

	@Test
	public void testS013ETE() {

		SO13ETE_SO14ETE_Pages test13_14 = new SO13ETE_SO14ETE_Pages(driver);

		HomePage homepage = new HomePage(driver);
		String header = "Car Shopping Made Easy";
		assertEquals(header.replaceAll("\\s+", ""), homepage.pageTitle.getText().replaceAll("\\s+", ""));

		homepage.hoverOver();

		assertEquals("Car Values", homepage.carValues.getText());

		PriceYourNextCarPage priceyournextcar = new PriceYourNextCarPage(driver); // STEP 4

		assertEquals("Price Your Next Car", priceyournextcar.pageTitle.getText());
		assertEquals("Select a Vehicle", priceyournextcar.sectionTitle.getText());
		assertEquals("Or Browse New Vehicles by", priceyournextcar.lastTitle.getText());
		assertEquals("New Cars & New Car Prices | Kelley Blue Book", driver.getTitle());

		assertTrue(priceyournextcar.carCondition.isEnabled());
		priceyournextcar.selectCarCondition();

		priceyournextcar.clickButtons(priceyournextcar.vanButton); // STEP 5

		VolvoS60SelectPage selectpage = new VolvoS60SelectPage(driver);
		selectpage.zipCode.sendKeys("22206");
		selectpage.saveZip.click();
		assertTrue(driver.getTitle().contains("Used Van/Minivan Category | Kelley Blue Book"));

		test13_14.clickButton(test13_14.ChryslerButton); // STEP 6
		test13_14.feedbackPopUp(test13_14.noThanks);

		assertTrue(driver.getTitle().contains("Used Chrysler Van/Minivans | Kelley Blue Book")); // STEP 7
		test13_14.chooseButton(test13_14.chryslerTownCountry);

		assertTrue(test13_14.selectYearHeader.isDisplayed()); // STEP 8
		test13_14.chooseButton(test13_14.selectYear2017);
		test13_14.clickButton(test13_14.select2017);

		test13_14.clickButton(test13_14.chooseThisStyle); // STEP 9
		test13_14.feedbackPopUp(test13_14.noThanks);

		test13_14.chooseButton(test13_14.choosePriceType); // STEP 10
		test13_14.feedbackPopUp(test13_14.noThanks);

		test13_14.clickButton(test13_14.buyFromDealer); // STEP 11
		test13_14.feedbackPopUp(test13_14.noThanks);

		test13_14.chooseButton(test13_14.getUsedCarPrice); // STEP 12
		test13_14.feedbackPopUp(test13_14.noThanks);

		assertTrue(driver.getTitle()
				.contains("2007 Chrysler Town & Country Minivan 4D Used Car Prices | Kelley Blue Book"));
		assertTrue(test13_14.priceHeaderChrysler.getText().contains("Used 2007 Chrysler Town & Country Minivan 4D")); // STEP
																														// 13

	}

	@Test
	public void testS014ETE() {

		SO13ETE_SO14ETE_Pages test13_14 = new SO13ETE_SO14ETE_Pages(driver);

		HomePage homepage = new HomePage(driver);
		String header = "Car Shopping Made Easy";
		assertEquals(header.replaceAll("\\s+", ""), homepage.pageTitle.getText().replaceAll("\\s+", ""));

		homepage.hoverOver();
		assertEquals("Car Values", homepage.carValues.getText()); // STEP 4

		PriceYourNextCarPage priceyournextcar = new PriceYourNextCarPage(driver);
		assertEquals("Price Your Next Car", priceyournextcar.pageTitle.getText());
		assertEquals("Select a Vehicle", priceyournextcar.sectionTitle.getText());
		assertEquals("Or Browse New Vehicles by", priceyournextcar.lastTitle.getText());
		assertEquals("New Cars & New Car Prices | Kelley Blue Book", driver.getTitle());

		assertTrue(priceyournextcar.carCondition.isEnabled());
		priceyournextcar.selectCarConditionDynamic("Certified Pre-Owned");

		assertTrue(priceyournextcar.yearDropdown.isEnabled()); // STEP 5
		priceyournextcar.selectYear("2013");

		assertTrue(priceyournextcar.makeCar.isEnabled()); // STEP 6
		priceyournextcar.selectCarDynamic("Honda");
		test13_14.feedbackPopUp(test13_14.noThanks);

		priceyournextcar.selectModelDynamic("Civic"); // STEP 7-8
		test13_14.feedbackPopUp(test13_14.noThanks);

		// ENTER your ZIP code Pop up
		VolvoS60SelectPage selectpage = new VolvoS60SelectPage(driver);
		selectpage.zipCode.sendKeys("22206");
		selectpage.saveZip.click();

		test13_14.sedanButton.click(); // STEP 9
		test13_14.feedbackPopUp(test13_14.noThanks);

		test13_14.selectButton.sendKeys(Keys.ENTER); // STEP 10

		test13_14.mileage.clear(); // STEP 11
		test13_14.mileage.sendKeys("5555");

		test13_14.powerTrainButton.click(); // STEP 12

		test13_14.clickButton(test13_14.radioButtonHyb); // STEP 13
		test13_14.feedbackPopUp(test13_14.noThanks);

		test13_14.chooseButton(test13_14.choosePriceType); // STEP 14
		test13_14.feedbackPopUp(test13_14.noThanks);

		test13_14.chooseButton(test13_14.getUsedCarPrice2); // STEP 15
		test13_14.feedbackPopUp(test13_14.noThanks);

		assertTrue(driver.getTitle().contains("2013 Honda Civic Hybrid Sedan 4D Used Car Prices | Kelley Blue Book"));
		assertTrue(test13_14.priceHeaderHonda.getText().contains("Used 2013 Honda Civic Hybrid Sedan 4D")); // STEP 16

	}

}
