package com.kbb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OzgenTestsPages11_12 {
	
private WebDriver driver;
	
	public OzgenTestsPages11_12(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//ul[@class='contentlist make-list no-bull left']//a[@data-omn-partner='ford'])[1]")
	public WebElement fordButton;
	
	@FindBy(linkText="No, thanks")
	public WebElement noThanksPopUp;
	
	@FindBy(xpath="//h1[@class='title white no-margin with-badge']")
	public WebElement fordTrucksHeader;
	
	@FindBy(xpath="//span[contains(text(),'Ford F150')]")
	public WebElement F150button;
	
	@FindBy(xpath="//div[@class='right']//a[@href='/ford/f150-regular-cab/?vehicleclass=newcar&intent=buy-new&category=pickup']")
	public WebElement F150regularSelectButton;
	
	@FindBy(xpath="//h2[contains(text(),'Select a Year')]")
	public WebElement selectYearHeader;
	
	@FindBy(linkText="Select 2017")
	public WebElement select2017button;
	
	public void clickButton(WebElement element) {
		element.click();
	}
	

}
