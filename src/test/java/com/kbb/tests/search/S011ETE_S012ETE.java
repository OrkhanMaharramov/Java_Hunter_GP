package com.kbb.tests.search;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.kbb.pages.HomePage;
import com.kbb.pages.OzgenTestsPages11_12;
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
		OzgenTestsPages11_12 test11_12=new OzgenTestsPages11_12(driver);
		
		test11_12.clickButton(test11_12.fordButton); //STEP 5
		assertTrue(driver.getTitle().contains("Ford Pickup Models")); //step 5 assertion
		assertTrue(test11_12.fordTrucksHeader.isDisplayed());
		
		//LEARN HOW TO HANDLE
	//	test11_12.clickButton(test11_12.noThanksPopUp); //it  is opening sometimes
		 
		test11_12.clickButton(test11_12.F150button); //STEP 6
		
		test11_12.clickButton(test11_12.F150regularSelectButton); //STEP 7
		assertTrue(driver.getTitle().contains("Ford F150 Regular Cab")); //step 7 assertion
		assertTrue(test11_12.selectYearHeader.isDisplayed());	//step 7 assertion
		
		test11_12.clickButton(test11_12.select2017button); //STEP 8
		
		
		
	}
	  
	  
	  
	
	
	

}
