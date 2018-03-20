package com.kbb.tests.search;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.kbb.pages.HomePage;
import com.kbb.pages.S011ETE_S012ETE_Pages;
import com.kbb.pages.VolvoS60PricingPage;
import com.kbb.pages.PriceYourNextCarPage;
import com.kbb.pages.VolvoS60SelectPage;
import com.kbb.utilities.TestBaseClass;

public class S011ETE_S012ETE extends TestBaseClass{
	
	@Test
	public void testS011ETE() {
		HomePage homepage=new HomePage(driver);
		
		String header="Car Shopping Made Easy";
		assertEquals(header.replaceAll("\\s+",""), homepage.pageTitle.getText().replaceAll("\\s+","")); //step1
		
		homepage.hoverOver();
		
		PriceYourNextCarPage priceyournextcar=new PriceYourNextCarPage(driver);
		assertTrue(priceyournextcar.pageTitle.isDisplayed());
	    assertTrue(priceyournextcar.sectionTitle.isDisplayed());
		assertTrue(priceyournextcar.lastTitle.isDisplayed());
		
		priceyournextcar.clickButtons(priceyournextcar.truckButton); //STEP 4
		
		VolvoS60SelectPage selectpage=new VolvoS60SelectPage(driver);
		selectpage.zipCode.sendKeys("22206");
		selectpage.saveZip.click();
		
		assertTrue(driver.getTitle().contains("Trucks")); //step4 assertion
		
	//	(//ul[@class='contentlist make-list no-bull left']//a[@data-omn-partner='ford'])[1]
		S011ETE_S012ETE_Pages test11_12=new S011ETE_S012ETE_Pages(driver);
		
		test11_12.clickButton(test11_12.fordButton); //STEP 5
		assertTrue(driver.getTitle().contains("Ford Pickup Models")); //step 5 assertion
		assertTrue(test11_12.fordTrucksHeader.isDisplayed());
		
		//LEARN HOW TO HANDLE
	//	test11_12.clickButton(test11_12.noThanksPopUp); //it  is opening sometimes
		 
		test11_12.clickButton(test11_12.F150button); //STEP 6
		
		test11_12.clickButton(test11_12.F150regularSelectButton); //STEP 7
		assertTrue(driver.getTitle().contains("Ford F150 Regular Cab")); //step 7 assertion
		assertTrue(test11_12.selectYearHeader.isDisplayed());	//step 7 assertion
		
		test11_12.chooseButton(test11_12.select2017button); //Step 8
		assertTrue(driver.getTitle().contains("2017 Ford F150 Regular Cab Styles")); //Step 8 Assertion
		
		test11_12.chooseButton(test11_12.selectXLbutton); //Step 9
		assertTrue(driver.getTitle().contains("2017 Ford F150 Regular Cab XL Options")); //Step 9 Assertion
		
		test11_12.chooseButton(test11_12.fourWheelDrive);//Step 10
		
		test11_12.chooseButton(test11_12.colorsInteriors); //Step 11
		test11_12.chooseButton(test11_12.metalicColor); //Step 12
		test11_12.chooseButton(test11_12.darkEarthGreyColor); //Step 13
		test11_12.chooseButton(test11_12.submitButton); //Step 14
		test11_12.chooseButton(test11_12.seeFairPrice); //Step 15
		
		System.out.println(test11_12.choosenCar.getText()+" "+test11_12.pricing.getText());
		assertTrue(test11_12.choosenCar.isDisplayed()); //Step 16
		assertTrue(test11_12.pricing.isDisplayed()); //Step 16
		
		VolvoS60PricingPage pricing=new VolvoS60PricingPage(driver); 
		System.out.println(pricing.verifyPrice(test11_12.price)); //Step 17
		assertTrue(0<pricing.verifyPrice(test11_12.price));
		
	//	assertTrue(test11_12.ranges.isDisplayed());    
	//	assertTrue(test11_12.invoives.isDisplayed());
	//	assertTrue(test11_12.msrp.isDisplayed());
		
	}
	  
	  
	  
	
	
	

}
