package com.kbb.tests.search;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.kbb.pages.HomePage;
import com.kbb.pages.PriceYourNextCarPage;
import com.kbb.utilities.TestBaseClass;

public class OzgenSearchTests extends TestBaseClass{
	
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
		
		
		
	}
	  
	  
	  
	
	
	

}
