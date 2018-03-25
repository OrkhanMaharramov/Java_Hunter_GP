package com.kbb.pages.muhammadPages;

import java.util.List;

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
	
	// test cases s009fn
	
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
	
	// test cases s010fn some xpath were used from above s009fn
	
	@FindBy(xpath="//select[@id='makeDropdown0']//option[@value='McLaren']")
	public WebElement selectCar;
	
	@FindBy(id="38575")
	public WebElement selectModel;
	
	@FindBy(id="startMyResearchBtn")
	public WebElement clickNextTest2;
	
	
	// test cases s020fn
	
	@FindBy(xpath="//a[@id='navToResearchTools']")
	public WebElement hoverOverToResearch;
	
	@FindBy(xpath="//ul[@class='nav-list-secondary two-column']//li")
	public List<WebElement> researchData;
	
	@FindBy(xpath="//a[@id='navToResearchToolsnavToCompareCars']")
	public WebElement compareCars;
	
	@FindBy(xpath="//h1[@class='title white with-module']")
	public WebElement compareCarsIsDisplayed;
	
	@FindBy(xpath="//h1[@class='title white with-module']")
	public WebElement selectVehicleIsDisplayed;
	
	@FindBy(xpath="//h3[@class='section-title with-module']")
	public WebElement selectFromIsDisplayed;
		 
	@FindBy(xpath="//div[@class='contentRight']//h3[@class='section-title with-sub']")
	public WebElement selectedCarsIsDisplayed;
	
	@FindBy(xpath="//h2[@class='mod-title']")
	public WebElement mostResearchedIsDisplayed;
	
	@FindBy(xpath="//option[@value='Acura']")
	public WebElement selectMakeOfCar;	
	
	@FindBy(xpath="//option[@value='ILX']")
	public WebElement selectModelOfCar;	

	@FindBy(xpath="//select[@id='noresultsyear']//option[@value='2018']")
	public WebElement selectYearOfCar;	
	
	@FindBy(xpath="//a[@class='addButtonStyleBlue btn-secondary-cta']")
	public WebElement clickAdd;
	
	@FindBy(xpath="//*[.='New: 2018 Acura ILX']")
	public WebElement selectedCarAdded;
	
	@FindBy(xpath="//a[@class='compareButtonStyleBlue mb5 btn-main-cta right']")
	public WebElement clickCompare;
	
	
	// sr021fn
	
	// my 1 car
	@FindBy(xpath="//option[@value='Ford']")
	public WebElement selectMakeOfCar1;	
	
	@FindBy(xpath="//option[@value='Fusion']")
	public WebElement selectModelOfCar1;	

	@FindBy(xpath="//select[@id='noresultsyear']//option[@value='2018']")
	public WebElement selectYearOfCar1;	
	
	@FindBy(xpath="//a[@class='addButtonStyleBlue btn-secondary-cta']")
	public WebElement clickAdd1;
	
	
	// my car 2
	@FindBy(xpath="//option[@value='BMW']")
	public WebElement selectMakeOfCar2;	
	
	@FindBy(xpath="//option[@value='M4']")
	public WebElement selectModelOfCar2;	

	@FindBy(xpath="//select[@id='noresultsyear']//option[@value='2018']")
	public WebElement selectYearOfCar2;	
	
	@FindBy(xpath="//a[@class='addButtonStyleBlue btn-secondary-cta']")
	public WebElement clickAdd2;
	
	// my car 3
	@FindBy(xpath="//option[@value='Audi']")
	public WebElement selectMakeOfCar3;	
	
	@FindBy(xpath="//option[@value='R8']")
	public WebElement selectModelOfCar3;	

	@FindBy(xpath="//select[@id='noresultsyear']//option[@value='2018']")
	public WebElement selectYearOfCar3;	
	
	@FindBy(xpath="//a[@class='addButtonStyleBlue btn-secondary-cta']")
	public WebElement clickAdd3;
	
	// my car 4
	@FindBy(xpath = "//option[@value='Ford']")
	public WebElement selectMakeOfCar4;

	@FindBy(xpath = "//option[@value='Mustang']")
	public WebElement selectModelOfCar4;

	@FindBy(xpath = "//select[@id='noresultsyear']//option[@value='2018']")
	public WebElement selectYearOfCar4;

	@FindBy(xpath = "//a[@class='addButtonStyleBlue btn-secondary-cta']")
	public WebElement clickAdd4;
	
	
	
	}

