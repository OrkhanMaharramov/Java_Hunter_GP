package com.kbb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareCarsPage {

		private WebDriver driver;

		public CompareCarsPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
		
		@FindBy(xpath="(//h3[@class='section-title with-sub'])[2]")
		public WebElement selectVehicletitle;
		
		@FindBy(xpath="//h3[@class='section-title with-module']")
		public WebElement orSelectFromtitle;
		
		@FindBy(xpath="//h2[@class='mod-title']")
		public WebElement compareMostResearchedTitle;
		
		@FindBy(xpath="(//h3[@class='section-title with-sub'])[1]")
		public WebElement selectedCarsTitle;
	
}
