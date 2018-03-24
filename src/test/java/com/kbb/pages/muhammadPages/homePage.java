package com.kbb.pages.muhammadPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kbb.utilities.Driver;



public class homePage {

	private WebDriver driver;

	public homePage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1//span[@class='title-one']")
	public WebElement pageTitle;
	
	@FindBy (xpath="//a[@id='navToCarValues']")
	public WebElement hoverOver;
	
	@FindBy(xpath="//a[@id='navToCarValuesnavToNewUsedCarPrices']")
	public WebElement data1;
	
	@FindBy(xpath="//a[@id='navToCarValuesnavToTradeinPrivatePartyValues']")
	public WebElement data2;
	
	@FindBy(xpath="//a[@id='navToCarValuesnavToInstantCashOffer']")
	public WebElement data3;
	
	@FindBy (xpath="//span[text()='Price Your Next  Car']")
	public WebElement newAndUsedCarPageDispalyed;
	
	@FindBy(xpath="//h1[@class='title-one']")
	public WebElement newPageElement1;
	
	@FindBy(xpath="//p[@class='section-title']")
	public WebElement newPageElement2;
	
	@FindBy(xpath="//h2[@class='title-two js-tnt-control']")
	public WebElement newPageElement3;
	
	@FindBy(xpath="//select[@id='intentDropdown0']")
	public WebElement newBox;
	
	@FindBy(xpath="//select//option[@value='buy-cpo']")
	public WebElement certifiedPreowned;
	
	@FindBy(xpath="//select[@id='yearDropdown0']")
	public WebElement yearBox;
	
	@FindBy(xpath="//select//option[@value='2018']")
	public WebElement pick2018;
	
	@FindBy(xpath="//select[@id='makeDropdown0']")
	public WebElement makeBox;
	
	@FindBy(xpath="//select//option[@value='Ford']")
	public WebElement pickFord;
	
	@FindBy(xpath="//select[@id='modelDropdown0']")
	public WebElement modelBox;
	
	@FindBy(xpath="//select//option[@value='Fusion']")
	public WebElement pickFusion;
	
	@FindBy(xpath="//div[@class='form-group used-submit']")
	public WebElement nextButton;
	
	@FindBy(xpath="//input[@id='selectedZipCode']")
	public WebElement zipcodeBox;
	
	@FindBy(xpath="//a[@id='enterzipsubmit']")
	public WebElement clickSave;
	
	@FindBy(xpath="//h1[@class='title white with-sub']")
	public WebElement getYourUsedCarPriceDisplayed;
						 
	@FindBy(xpath="//div[contains(text(), 'Titanium Sedan 4D')]")
	public WebElement yourSelectedCarIsDisplayed;
	
	@FindBy(xpath="//div[contains(text(), 'Titanium Sedan 4D')]/../a")
	public WebElement clickChooseThisStyle;
	
	@FindBy(xpath="//h2[@class='section-title white with-sub']")
	public WebElement carNameIsDisplayed;
	
	@FindBy(xpath="//div[@class='section-subtitle white with-module']")
	public WebElement carStyleIsDisplayed;
	
	@FindBy(xpath="//input[@value='6790']")
	public WebElement carMileageIsDisplayed;
	
	@FindBy(id="mileage")
	public WebElement carMileageIsDisplayed2;
	
	@FindBy(id="GetMyPrice")
	public WebElement clickChoosePriceType;
	
	@FindBy(id="mileage-error")
	public WebElement enterValidMileage;
	
	public void scrollDown(WebElement element) {
		JavascriptExecutor jsExecuter = (JavascriptExecutor) driver;
		jsExecuter.executeScript("arguments[0].scrollIntoView(true)", element);
		jsExecuter.executeScript("arguments[0].click();", element);
	}
	
	
	
}
