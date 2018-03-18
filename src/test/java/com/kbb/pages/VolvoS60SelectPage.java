package com.kbb.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VolvoS60SelectPage {
	
private WebDriver driver;
	
	public VolvoS60SelectPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//	
//	@FindBy(xpath="//h1[@class='title white with-sub']")
//	public WebElement getNewCarHeader;
	
	
	@FindBy(xpath="(//a[@class='btn-main-cta noyear'])[1]")
	public WebElement selectButton;
	
	@FindBy(id="selectedZipCode")
	public WebElement zipCode;
	
	@FindBy(id="enterzipsubmit")
	public WebElement saveZip;



	public void selectNext() { //there is zipcode popup message
		//if you dont write zipcode and save it, it wont go further
	//	if(zipCode.isDisplayed()) {
			zipCode.sendKeys("22206");
			saveZip.click();
			selectButton.click();
		
//		}else {
//			selectButton.click();
//	}
}
}