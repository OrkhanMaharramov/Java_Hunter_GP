package com.kbb.tests.search;


import org.testng.annotations.Test;
import com.kbb.pages.HomePage;
import com.kbb.utilities.TestBaseClass;


public class SearchTest extends TestBaseClass {
	@Test (priority=1)
	public void testCaseS001S() {
		HomePage homepage=new HomePage(driver);
	homepage.hoverOver();

	}
}
