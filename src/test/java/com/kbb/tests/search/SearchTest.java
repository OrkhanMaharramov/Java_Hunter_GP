package com.kbb.tests.search;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.kbb.pages.HomePage;
import com.kbb.utilities.TestBaseClass;


public class SearchTest extends TestBaseClass {
	//@Test (priority=1)
	public void testCaseS001S() {
		HomePage homepage=new HomePage(driver);
	    homepage.hoverOver();

	}
	
	//@Test (priority=2)
	public void testCaseS002FP() {
		HomePage homepage=new HomePage(driver);
		homepage.hoverOver();
		homepage.selectVehicle(1);
		homepage.selectVehicle(2);
	}
	
	@Test (priority=3)
	public void testCaseS003FP() {
		HomePage homepage=new HomePage(driver);
		homepage.hoverOver();
		homepage.selectMake(6);
		homepage.getAllModel();
		String []Bmw= {"2 Series", "3 Series","4 Series", "5 Series","6 Series", "7 Series", "i3", "i8", "M2","M3","M4","M6","X1","X2","X3","X4","X5","X5 M","X6","X6 M"};
		String []Ferrari= {"488 GTB","488 Spider","California","F12berlinetta","GTC4Lusso"};
		String []Jaguar= {"E-PACE","F-PACE","F-TYPE","XE","XF","XJ"};
		List<String> bmw=Arrays.asList(Bmw);
		List<String> ferrari=Arrays.asList(Ferrari);
		List<String> jaguar=Arrays.asList(Jaguar);
		assertEquals(bmw, homepage.getAllModel());
		homepage.selectMake(12);
		homepage.getAllModel();
		assertEquals(ferrari, homepage.getAllModel());
		homepage.selectMake(21);
		homepage.getAllModel();
		assertEquals(jaguar, homepage.getAllModel());
		
		System.out.println(homepage.getAllModel());
	}
	
	
}
