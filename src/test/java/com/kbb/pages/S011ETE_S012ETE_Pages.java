package com.kbb.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S011ETE_S012ETE_Pages {
	
private WebDriver driver;
	
	public S011ETE_S012ETE_Pages(WebDriver driver) {
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
	
	@FindBy(xpath="//a[contains(text(),'Select 2017')]")
	public WebElement select2017button;
	
	@FindBy(xpath="//a[@data-selected-vehicle-styles='XL']")
	public WebElement selectXLbutton;
	
	@FindBy(xpath="//input[@value='421652']")
	public WebElement fourWheelDrive;
	
	@FindBy(xpath="//span[contains(text(),'Colors and Interiors')]")
	public WebElement colorsInteriors;
	
	@FindBy(id="rdOptionId7524903")
	public WebElement metalicColor;
	
	@FindBy(id="rdErrorFor7524712")
	public WebElement darkEarthGreyColor;
	
	@FindBy(linkText="Submit")
	public WebElement submitButton;
	
	@FindBy(id="GetMyPrice")
	public WebElement seeFairPrice;
	
	@FindBy(xpath="//h1[@class='color-a']//span[contains(text(),'2017 Ford F150 Regular Cab')]")
	public WebElement choosenCar;
	
	@FindBy(xpath="//span[contains(text(),'Pricing')]")
	public WebElement pricing;
	
	@FindBy(id="configuredPrice")
	public WebElement price;
	
	@FindBy(id="RangeBox")
	public WebElement ranges;
	
	@FindBy(id="invoiceBox")
	public WebElement invoives;
	
	@FindBy(id="msrpBox")
	public WebElement msrp;
	
	//TEST CASE 12
	
	@FindBy(id="startMyResearchBtn")
	public WebElement next;
	
	@FindBy(id="selectedZipCode")
	public WebElement zip;
	
	@FindBy(id="enterzipsubmit")
	public WebElement savebutton;
	
	@FindBy(xpath="//a[@data-selected-vehicle-styles='Premium Plus Sedan 4D']")
	public WebElement chooseSedan4D;
	
	@FindBy(id="mileage")
	public WebElement mileageInput;
	
	@FindBy(xpath="(//span[@class='btn-circle-plus'])[2]")
	public WebElement packages;
	
	@FindBy(id="cbxOptionId6038490")
	public WebElement coldWeather;
	
	@FindBy(linkText="Choose price type")
	public WebElement choosePricebutton;
	
	@FindBy(linkText="Get used car price")
	public WebElement chooseUsedPrice;
	
	
	
	public void chooseButton(WebElement element) {
		//WebElement element = select2017button;
		JavascriptExecutor jse = (JavascriptExecutor)driver; 
		jse.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", element);
	}
	

	public void clickButton(WebElement element) {
		element.click();
	}
	
	
	public void sendZip() { 
		zip.sendKeys("22206");
		savebutton.click();
	}
	
	
	
	

}
