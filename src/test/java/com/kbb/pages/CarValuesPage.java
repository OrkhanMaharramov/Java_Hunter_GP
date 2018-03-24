package com.kbb.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CarValuesPage {
private WebDriver driver;
	
	public CarValuesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Sedan")
	public WebElement sedan;
	
	@FindBy(id="selectedZipCode")
	public WebElement enterZip;
	
	@FindBy(id="enterzipsubmit")
	public WebElement saveButton;
	
	public void handleZipSection() {
	if(enterZip.isDisplayed()) {
		enterZip.sendKeys("32323");
		saveButton.click();
	}
	}
	
	@FindBy(xpath="//a[.='Toyota']")
	public WebElement toyota;
	
	@FindBy(linkText="Toyota Camry")
	public WebElement toyotaCamry;
	
	@FindBy(linkText="Select 2014")
	public WebElement select2014;
	
	public void scrollDown(WebElement element) {
		JavascriptExecutor jsExecuter = (JavascriptExecutor) driver;
		jsExecuter.executeScript("arguments[0].scrollIntoView(true)", element);
		jsExecuter.executeScript("arguments[0].click();", element);
	}
	
	@FindBy(xpath="(//a[@class='right btn-main-cta'])[3]")
	public WebElement chooseThisStyleBtn;
	
	@FindBy(id="mileage")
	public WebElement mileage;
	
	@FindBy(linkText="No, thanks")
	public WebElement noThanks;
	
	public void tryCatch(WebElement element) {
	try {
		element.click();
	} catch (Exception e) {
		
	}
	
	}
	
	@FindBy(linkText="Choose price type")
	public WebElement choosePriceTypeBtn;
	
	@FindBy(linkText="Get used car price")
	public WebElement getUsedCarPriceBtn;
	
	@FindBy(xpath="//h1")
	public WebElement selectedCarText;
	
	@FindBy(xpath="//h3")
	public WebElement buyFrom;
	
	@FindBy(css="g#RangeBox")
	public WebElement rangeBox;
	
	@FindBy(css="g#listingPriceBox")
	public WebElement listingPriceBox;
	
	@FindBy(css="#RangeBox > text:nth-child(6)")
	public WebElement fairMarketRange;
	
	@FindBy(xpath="//*[.='Fair Purchase Price (CPO)']")
	public WebElement fairPurchasePrice;
	
	@FindBy(xpath="//*[.=' ($278/month)*']")
	public WebElement monthlyPaymentPrice;
	
	@FindBy(xpath="//*[@id='listingPriceBox']")
	public WebElement typicalListingPrice;
	
	
	@FindBy(linkText="Volvo")
	public WebElement volvo;
	
	@FindBy(linkText="Select")
	public WebElement selectS60;
	
}
