package com.kbb.pages;

import org.openqa.selenium.JavascriptExecutor;
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
		int price=Integer.parseInt(element.getText().substring(1).replace(",", ""));
		return price;
	}
	
	public void choose2017() { //we need to look at this one to handle POP UP MESSAGE!
		
		try {
			if(noThanksbutton.isDisplayed() || popUpTitle.getText().contains("Your Opinion Counts!")) ;
				noThanksbutton.click();
		
		}catch (NoAlertPresentException e) {
			e.printStackTrace();
			noThanksbutton.click();
			System.out.println("pop up isnot present");
		}
	}	
		
	//	noThanksbutton.click();
		
	public void choose2017Last() {
		WebElement element = year2017;
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		jse.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", element);
		
	}
		
		
	}
	


