package com.kbb.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VolvoS60StylesInscriptionPage {
	
	
private WebDriver driver;
	
	public VolvoS60StylesInscriptionPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[.='Price with standard options']")
	public WebElement standardPrice;
	
	
	@FindBy(xpath="//a[@title='Click to close.']")
	public WebElement closeFeedback;
	
	@FindBy(xpath = "(//span[@class='btn-circle-plus'])[4]" ) // 4
	public WebElement packagesButton;
	
	@FindBy(id="GetMyPrice")
	public WebElement seeFairPrice;
	
	@FindBy(id="addedOptions")
	public WebElement selectedOptionsPrice;
	
	
	@FindBy(xpath="//input[@name='cbxOptionId8056137']")
	public WebElement blindSpot;
	
	@FindBy(xpath="//input[@name='cbxOptionId8056116']")
	public WebElement techPackage;
	
	@FindBy(xpath="//input[@name='cbxOptionId8056630']")
	public WebElement climatePackage;
	
	@FindBy(xpath="//input[@name='cbxOptionId8056110']")
	public WebElement conveniencePackage;
	
	
	

	//span[@class='mod-title'][contains(text(),'Packages')] tamaras

	public void chooseStandard() {
		standardPrice.click();
		
//		if(closeFeedback.isDisplayed()) {
//			closeFeedback.click();
//			standardPrice.click();
//		} else {
 //	
//}
}
	
	
	public void checkClearAlert() {  //we need to look this method
		
		try {
			if(closeFeedback.isDisplayed()) 
			closeFeedback.click();
		
		}catch (NoAlertPresentException e) {
			e.printStackTrace();
			System.out.println("pop up isnot present");
		}
		
	}
	
	public void choosePackages() {
		WebElement element = packagesButton;
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		jse.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", element);
		

	}
	
	public void chooseBlindspot(){
		WebElement element = blindSpot;
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		jse.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", element);
		
	}
	
	public void chooseTechPack() {
		WebElement element = techPackage;
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		jse.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", element);
	}
	
	
	public void seeFairPriceChoose() {
		
		WebElement element = seeFairPrice;
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		jse.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", element);
		
	}
}
