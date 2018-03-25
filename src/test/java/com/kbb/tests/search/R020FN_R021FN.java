

package com.kbb.tests.search;

import static org.testng.Assert.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.kbb.pages.muhammadPages.homePage;
import com.kbb.utilities.TestBaseClass;

public class R020FN_R021FN extends TestBaseClass {

	homePage page2 = new homePage();

	@Test
	public void testR020FN() throws InterruptedException {

		assertEquals(page2.pageTitle.getText(), "Car Shopping\nMade Easy");

		Actions action = new Actions(driver);
		action.moveToElement(page2.hoverOverToResearch).perform();

		for (WebElement el : page2.researchData) {
			assertTrue(el.isDisplayed());
		}

		page2.compareCars.click();

		page2.zipcodeBox.sendKeys("20007");
		page2.clickSave.click();

		assertTrue(page2.compareCarsIsDisplayed.isDisplayed());
		assertTrue(page2.selectVehicleIsDisplayed.isDisplayed());
		assertTrue(page2.selectFromIsDisplayed.isDisplayed());
		assertTrue(page2.selectedCarsIsDisplayed.isDisplayed());
		assertTrue(page2.mostResearchedIsDisplayed.isDisplayed());

		page2.selectMakeOfCar.click();
		page2.selectModelOfCar.click();
		page2.selectYearOfCar.click();
		page2.clickAdd.click();
		System.out.println(page2.selectedCarAdded.getText());
		assertTrue(page2.selectedCarAdded.getText().trim().contains("New: 2018 Acura ILX"));

		// repeating the above steps based on the instruction of the test case
		page2.selectMakeOfCar.click();
		page2.selectModelOfCar.click();
		page2.selectYearOfCar.click();
		page2.clickAdd.click();
		
		Thread.sleep(2000);
		page2.clickCompare.click();
		
		// WE FOUND A DEFECT (there is no point of comparing same cars)
		

	}

	@Test
	public void testR021FN() throws InterruptedException {

		assertEquals(page2.pageTitle.getText(), "Car Shopping\nMade Easy");

		Actions action = new Actions(driver);
		action.moveToElement(page2.hoverOverToResearch).perform();

		for (WebElement el : page2.researchData) {
			assertTrue(el.isDisplayed());
		}

		page2.compareCars.click();

		page2.zipcodeBox.sendKeys("20007");
		page2.clickSave.click();

		assertTrue(page2.compareCarsIsDisplayed.isDisplayed());
		assertTrue(page2.selectVehicleIsDisplayed.isDisplayed());
		assertTrue(page2.selectFromIsDisplayed.isDisplayed());
		assertTrue(page2.selectedCarsIsDisplayed.isDisplayed());
		assertTrue(page2.mostResearchedIsDisplayed.isDisplayed());
		
		// car chosen by test case providers
		page2.selectMakeOfCar.click();
		page2.selectModelOfCar.click();
		page2.selectYearOfCar.click();
		page2.clickAdd.click();

		// my car 1
		Thread.sleep(2000);
		page2.selectMakeOfCar1.click();
		page2.selectModelOfCar1.click();
		page2.selectYearOfCar1.click();
		page2.clickAdd1.click();

		// my car 2
		Thread.sleep(2000);
		page2.selectMakeOfCar2.click();
		page2.selectModelOfCar2.click();
		page2.selectYearOfCar2.click();
		page2.clickAdd2.click();

		// my car 3
		Thread.sleep(2000);
		page2.selectMakeOfCar3.click();
		page2.selectModelOfCar3.click();
		page2.selectYearOfCar3.click();
		page2.clickAdd3.click();

		// my car 4
		Thread.sleep(2000);
		page2.selectMakeOfCar4.click();
		page2.selectModelOfCar4.click();
		page2.selectYearOfCar4.click();
		page2.clickAdd4.click();
		
		Alert alert= driver.switchTo().alert();
		alert.accept();
	}

}
