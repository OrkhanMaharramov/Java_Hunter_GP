package com.kbb.tests.search;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.kbb.pages.HomePage;
import com.kbb.pages.PriceYourNextCarPage;
import com.kbb.pages.VolvoS60PricingPage;
import com.kbb.pages.VolvoS60SelectPage;
import com.kbb.pages.VolvoS60StylesInscriptionPage;
import com.kbb.pages.VolvoS60StylesPage;
import com.kbb.utilities.TestBaseClass;

public class SearchTestsNew extends TestBaseClass{
	
		@Test
		public void testCaseS002FP() {
			HomePage homepage=new HomePage(driver);
			homepage.hoverOver();
			homepage.selectVehicle(1);
			homepage.selectVehicle(2);
		}
		
		@Test //(priority=3)
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
		
		@Test
		public void testCaseS004FP() {
			
			HomePage homepage=new HomePage(driver);
			
			String header="Car Shopping Made Easy";
			assertEquals(header.replaceAll("\\s+",""), homepage.pageTitle.getText().replaceAll("\\s+","")); //step1
			
			homepage.hoverOver();
			assertEquals("Car Values",homepage.carValues.getText()); //step2
			
			
			PriceYourNextCarPage priceyournextcar=new PriceYourNextCarPage(driver);
		
		//	assertEquals("Price Your Next Car", priceyournextcar.pageTitle.getText()); //step3
		//	assertEquals("Select a Vehicle", priceyournextcar.sectionTitle.getText()); //step3
		//	assertEquals("Or Browse New Vehicles by", priceyournextcar.lastTitle.getText()); //step3
		//	assertEquals("New Cars & New Car Prices | Kelley Blue Book", driver.getTitle()); //step3

			
			assertTrue(priceyournextcar.makeCar.isEnabled()); //step4
			assertTrue(priceyournextcar.nextButton.isEnabled()); //step5
			
			priceyournextcar.selectCar();
			
			priceyournextcar.selectModel();
		//	assertEquals("Volvo S60 | Kelley Blue Book", driver.getTitle()); //step 6
			
			
			VolvoS60SelectPage volvoS60=new VolvoS60SelectPage(driver);
			
			
			volvoS60.selectNext();
			assertEquals("2018 Volvo S60 Styles and Equipment, New Cars | Kelley Blue Book", driver.getTitle()); //step7
			//need to compare list and elements
		//	assertEquals("Get Your New Car Price", volvoS60.getNewCarHeader.getText());
			
			
			
			VolvoS60StylesPage volvoS60styles=new VolvoS60StylesPage(driver);
			volvoS60styles.chooseT5(); 
			
			
			VolvoS60StylesInscriptionPage inscription=new VolvoS60StylesInscriptionPage(driver);
		
			assertEquals("2018 Volvo S60 T5 Inscription Options | Kelley Blue Book",driver.getTitle()); //step8
			inscription.chooseStandard();
			
			assertEquals("2018 Volvo S60 T5 Inscription New Car Prices | Kelley Blue Book", driver.getTitle()); //Step9
			
			VolvoS60PricingPage prices=new VolvoS60PricingPage(driver);
			assertEquals(0, prices.verifyPrice(prices.finalPrices));
			
		}
		
		@Test 
		public void testCaseS005FP () {
			
			HomePage homepage=new HomePage(driver);
			
			String header="Car Shopping Made Easy";
			assertEquals(header.replaceAll("\\s+",""), homepage.pageTitle.getText().replaceAll("\\s+","")); //step1
			
			homepage.hoverOver();
			assertEquals("Car Values",homepage.carValues.getText()); //step2
			
			
			PriceYourNextCarPage priceyournextcar=new PriceYourNextCarPage(driver);
			
			assertTrue(priceyournextcar.makeCar.isEnabled()); //step4
			assertTrue(priceyournextcar.nextButton.isEnabled()); //step5
			
			priceyournextcar.selectCar();
			
			priceyournextcar.selectModel();
		//	assertEquals("Volvo S60 | Kelley Blue Book", driver.getTitle()); //step 6
			
			
			VolvoS60SelectPage volvoS60=new VolvoS60SelectPage(driver);
			
			
			volvoS60.selectNext();
			assertEquals("2018 Volvo S60 Styles and Equipment, New Cars | Kelley Blue Book", driver.getTitle()); //step7
			
			VolvoS60StylesPage volvoS60styles=new VolvoS60StylesPage(driver);
			volvoS60styles.chooseT5(); 
			
			VolvoS60StylesInscriptionPage inscription=new VolvoS60StylesInscriptionPage(driver);
			inscription.choosePackages();
			

			inscription.chooseBlindspot();
			inscription.chooseTechPack();
			
			assertTrue(inscription.blindSpot.isDisplayed());
			assertTrue(inscription.climatePackage.isDisplayed());
			assertTrue(inscription.conveniencePackage.isDisplayed());
			assertTrue(inscription.techPackage.isDisplayed());
			
			inscription.seeFairPriceChoose();
			
			VolvoS60PricingPage prices=new VolvoS60PricingPage(driver);
			System.out.println(prices.selectedOptionPrice.getText());
			assertTrue(prices.verifyPrice(prices.selectedOptionPrice)>0);
			
		
		}
		
		@Test
		public void testCaseS006FP() {
			
			HomePage homepage=new HomePage(driver);
			
			String header="Car Shopping Made Easy";
			assertEquals(header.replaceAll("\\s+",""), homepage.pageTitle.getText().replaceAll("\\s+","")); //step1
			
			homepage.hoverOver();
			assertEquals("Car Values",homepage.carValues.getText()); //step2
			
			
			PriceYourNextCarPage priceyournextcar=new PriceYourNextCarPage(driver);
		
		//	assertEquals("Price Your Next Car", priceyournextcar.pageTitle.getText()); //step3
		//	assertEquals("Select a Vehicle", priceyournextcar.sectionTitle.getText()); //step3
		//	assertEquals("Or Browse New Vehicles by", priceyournextcar.lastTitle.getText()); //step3
		//	assertEquals("New Cars & New Car Prices | Kelley Blue Book", driver.getTitle()); //step3

			
			assertTrue(priceyournextcar.makeCar.isEnabled()); //step4
			assertTrue(priceyournextcar.nextButton.isEnabled()); //step5
			
			priceyournextcar.selectCar();
			
			priceyournextcar.selectModel();
		//	assertEquals("Volvo S60 | Kelley Blue Book", driver.getTitle()); //step 6
			
			
			VolvoS60SelectPage volvoS60=new VolvoS60SelectPage(driver);
			
			
			volvoS60.selectNext();
			assertEquals("2018 Volvo S60 Styles and Equipment, New Cars | Kelley Blue Book", driver.getTitle()); //step7
			//need to compare list and elements
		//	assertEquals("Get Your New Car Price", volvoS60.getNewCarHeader.getText());
			
		
			VolvoS60StylesPage volvoS60styles=new VolvoS60StylesPage(driver);
			volvoS60styles.chooseT5(); 
			
			
			VolvoS60StylesInscriptionPage inscription=new VolvoS60StylesInscriptionPage(driver);
		
			assertEquals("2018 Volvo S60 T5 Inscription Options | Kelley Blue Book",driver.getTitle()); //step8
			inscription.chooseStandard();
			
			assertEquals("2018 Volvo S60 T5 Inscription New Car Prices | Kelley Blue Book", driver.getTitle()); //Step9
			
			VolvoS60PricingPage prices=new VolvoS60PricingPage(driver);
			assertEquals(0, prices.verifyPrice(prices.finalPrices));
			prices.choose2017Last();
			
		}
		
		
		
		
		
		
	}



