package com.kbb.tests.search;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.kbb.pages.CompareCarsPage;
import com.kbb.pages.HomePage;
import com.kbb.pages.PriceYourNextCarPage;
import com.kbb.utilities.TestBaseClass;

public class SmokeTests extends TestBaseClass{
	
	@Test (priority=1)
	public void testCaseS001S() {
		HomePage homepage=new HomePage(driver);
	    homepage.hoverOver();
	    
	    PriceYourNextCarPage priceyournextcar=new PriceYourNextCarPage(driver);
	    assertTrue(priceyournextcar.pageTitle.isDisplayed());
	    assertTrue(priceyournextcar.sectionTitle.isDisplayed());
	    assertTrue(priceyournextcar.lastTitle.isDisplayed());
	    

	}
	
	@Test (priority=2)
	public void testCaseR017S() {
		HomePage homepage=new HomePage(driver);
		String header="Car Shopping Made Easy";
	//	assertEquals(header.replaceAll("\\s+",""), homepage.pageTitle.getText().replaceAll("\\s+","")); //step1
		
		homepage.hoverOverResearch();
		
		CompareCarsPage compareCars=new CompareCarsPage(driver);
		assertTrue(compareCars.selectVehicletitle.isDisplayed());
		assertTrue(compareCars.compareMostResearchedTitle.isDisplayed());
		assertTrue(compareCars.orSelectFromtitle.isDisplayed());
		assertTrue(compareCars.selectedCarsTitle.isDisplayed());
		
		
	}
	
	

}
