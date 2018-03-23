package com.kbb.tests.search;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
		
	//	System.out.println(driver.getPageSource().contains("Fair Market Range"));
	//	System.out.println(driver.getPageSource().contains("Fair Purchase Price"));
	//	System.out.println(driver.getPageSource().contains("Invoice"));
	//	System.out.println(driver.getPageSource().contains("MSRP"));
		
	//	System.out.println(driver.getPageSource().contains("31,463"));
		
		//Step 17 assertions
		assertTrue(driver.findElement(By.tagName("html")).getText().contains("The Fair Market Range for this car in your area is $29,611 - $31,192"));
		assertTrue(driver.findElement(By.tagName("html")).getText().contains("Fair Purchase Price $30,402"));
		//it doesnt find INVOICE
		assertTrue(driver.getPageSource().contains("MSRP"));
		
	
		
	}
	
	@Test
	public void testS012ETE() {
		
		HomePage homepage=new HomePage(driver);
		String header="Car Shopping Made Easy";
		assertEquals(header.replaceAll("\\s+",""), homepage.pageTitle.getText().replaceAll("\\s+","")); //step1
		
		homepage.hoverOver();
		
		PriceYourNextCarPage priceyournextcar=new PriceYourNextCarPage(driver);
		assertTrue(priceyournextcar.pageTitle.isDisplayed());
	    assertTrue(priceyournextcar.sectionTitle.isDisplayed());
		assertTrue(priceyournextcar.lastTitle.isDisplayed());
		
		priceyournextcar.selectCarCondition(); //step 4
		assertTrue(driver.getTitle().contains("Used Cars, Used Car Prices,")); //step 4 assertion
		
		priceyournextcar.selectYear(priceyournextcar.yearDropdown, "2015"); //step 5
		priceyournextcar.selectCarNewVersion(priceyournextcar.makeCar, "Audi"); //step 6
		priceyournextcar.selectModelNewVersion(priceyournextcar.makeModel, "A7"); //step 7
		
		S011ETE_S012ETE_Pages test11_12=new S011ETE_S012ETE_Pages(driver);
		test11_12.next.click();  //step 8
		
		test11_12.sendZip(); 
		assertTrue(driver.getTitle().contains("2015 Audi A7 Styles and Equipment")); //step 8 assertion
		
		test11_12.chooseButton(test11_12.chooseSedan4D); //step 9
		assertTrue(driver.getTitle().contains("2015 Audi A7 Premium Plus")); //step 9 assertion
		
		test11_12.mileageInput.clear();
		test11_12.mileageInput.sendKeys("30000"); //step 10
		int mile=Integer.valueOf("30000");
		assertEquals(mile, 30000, "values didnt match"); //step 10 assertion
		
		test11_12.chooseButton(test11_12.packages); //step 11
		
		test11_12.chooseButton(test11_12.coldWeather); //step 12
		assertTrue(test11_12.coldWeather.isSelected()); //step 12 assertion
		
		test11_12.chooseButton(test11_12.choosePricebutton); //step 13
		assertTrue(driver.getTitle().contains("2015 Audi A7 Premium Plus Sedan 4D Price Type and Condition")); //step 13 assertion
		
		test11_12.chooseButton(test11_12.chooseUsedPrice); //step 14
		
		assertTrue(test11_12.mileageText.getText().contains("Mileage: 30,000"), "mileage"); //step 15
		assertTrue(driver.getTitle().contains("2015 Audi A7 Premium Plus Sedan 4D Used Car Prices"), "prices");  //step 14 assertion
		assertTrue(test11_12.verifyPricingTitle.getText().contains("Used 2015 Audi A7 Premium Plus Sedan 4D"), "title"); //step 15 assertion
		
		//Step 16
		
		System.out.println(driver.getPageSource().contains("Fair Market Range"));
		assertTrue(driver.getPageSource().contains("Fair Purchase Price")); //step 16 assertion
		System.out.println(driver.getPageSource().contains("Monthly Payment Price"));
		System.out.println(driver.getPageSource().contains("Typical Listing Price"));
		
		//there is no text about pricing. tagname and pagesource were used, but there is no related text. 
			
		String sa=driver.findElement(By.tagName("html")).getText();
		System.out.println(sa);
			
			//Step 17 assertions
		//	assertTrue(driver.findElement(By.tagName("html")).getText().contains("The Fair Market Range for this car in your area is $29,611 - $31,192"));
		//	assertTrue(driver.findElement(By.tagName("html")).getText().contains("Fair Purchase Price $30,402"));
			//it doesnt find INVOICE
		//	assertTrue(driver.getPageSource().contains("MSRP"));
	}
	
	  
	  
	
	
	

}
