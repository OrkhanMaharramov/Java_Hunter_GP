package com.kbb.pages;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VolvoS60PricingPage {
	
private WebDriver driver;
	
	public VolvoS60PricingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//table//tr//td)[12]")
	public WebElement finalPrices;
	
	@FindBy(id="addedOptions")
	public WebElement selectedOptionPrice;
	
	@FindBy(id="yeartoggle_2017")
	public WebElement year2017;
	
	
	@FindBy(xpath="//a[@class='decline js-survey-close']")
	public WebElement noThanksbutton;
	
	@FindBy(xpath="//div[@class='title']")
	public WebElement popUpTitle;
	
	public int verifyPrice(WebElement element) {
		int price=Integer.parseInt(element.getText().replaceAll(",", "").substring(1));
		return price;
	}
	
	public void choose2017() {
		
		try {
			if(noThanksbutton.isDisplayed() || popUpTitle.getText().contains("Your Opinion Counts!")) ;
				noThanksbutton.click();
		
		}catch (NoAlertPresentException e) {
			e.printStackTrace();
			noThanksbutton.click();
			System.out.println("pop up isnot present");
		}
		
		
	//	noThanksbutton.click();
		
		
	}
	

}
