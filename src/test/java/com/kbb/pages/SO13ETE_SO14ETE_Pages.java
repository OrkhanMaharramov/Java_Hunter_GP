package com.kbb.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SO13ETE_SO14ETE_Pages {

	private WebDriver driver;

	public SO13ETE_SO14ETE_Pages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//ul[@class='contentlist make-list no-bull left']//a[@data-omn-partner='nx'])[3]")
	public WebElement ChryslerButton;

	@FindBy(xpath = "(//div[@class='mod-content expanded-content UsedCar no-accordion']//a[@class='stop-propagation stop-propagation-small'])[4]")
	public WebElement chryslerTownCountry;

	@FindBy(xpath = "//div[@class='years-area']//a[@href='#y-2007']")
	public WebElement selectYear2017;

	@FindBy(xpath = "//h2[contains(text(),'Select a Year')] ")
	public WebElement selectYearHeader;
	
	@FindBy(xpath="//a[contains(text(),'Select 2007')]")
	public WebElement select2017;
	
	@FindBy(xpath="(//a[@class='right btn-main-cta'])[1]")
	public WebElement chooseThisStyle;
	
	@FindBy(id="GetMyPrice")
	public WebElement choosePriceType;
	
	@FindBy(xpath = "//input[@id='Price-type-retail']")
	public WebElement buyFromDealer;
	
	@FindBy(xpath="(//a[contains(text(), 'Get used car price')])[1]")
	public WebElement getUsedCarPrice;
	
	@FindBy(xpath="//div[@class='header-title-wrapper']")
	public WebElement titleUsed2017;
	
	@FindBy(css="[text-anchor][data-reactid='55']")
	public WebElement fairMarketRange;
	
	@FindBy(css="[text-anchor][data-reactid='50']")
	public WebElement fairPurchasePriceAndMonthlyPayment;
	
	@FindBy(css="[text-anchor][data-reactid='61']")
	public WebElement typicalListingPrice;
	
	@FindBy(linkText="No, thanks")
	public WebElement noThanksPopUp;

	public void chooseButton(WebElement element) {
		// WebElement element = selectYear2017;
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", element);
	}

	public void clickButton(WebElement element) {
		element.click();
	}
	
	public int verifyPrice(WebElement element) {
		int price=Integer.parseInt(element.getText().replaceAll(",", "").substring(1));
		return price;
	}

}