package com.kbb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PriceYourNextCarPage {

	private WebDriver driver;

	public PriceYourNextCarPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[@class='title-one']")
	public WebElement pageTitle;

	@FindBy(xpath = "//p[@class='section-title']")
	public WebElement sectionTitle;

	@FindBy(xpath = "//h2[@class='title-two js-tnt-control']")
	public WebElement lastTitle;

	@FindBy(linkText = "Truck")
	public WebElement truckButton;
	
	@FindBy(linkText = "Van/Minivan")
	public WebElement vanButton;

	@FindBy(id = "makeDropdown0")
	public WebElement makeCar;

	@FindBy(id = "modelDropdown0")
	public WebElement makeModel;

	@FindBy(id = "startMyResearchBtn")
	public WebElement nextButton;
	
	@FindBy(id = "intentDropdown0")
	public WebElement carCondition;
	
	@FindBy(id="yearDropdown0")
	public WebElement yearDropdown;

	public void selectCar() {
		WebElement element = makeCar;
		Select select = new Select(element);
		select.selectByVisibleText("Volvo");

	}
	
	
	public void selectCarDynamic(String m) {
		WebElement element = makeCar;
		Select select = new Select(element);
		select.selectByVisibleText(m);

	}
	
	public void selectYear(String y) {
		WebElement element = yearDropdown;
		Select select = new Select(element);
		select.selectByVisibleText(y);

	}
	

	public void selectModel() {
		WebElement element = makeModel;
		Select select = new Select(element);
		select.selectByVisibleText("S60");
		nextButton.click();

	}
	
	public void selectModelDynamic(String m) {
		WebElement element = makeModel;
		Select select = new Select(element);
		select.selectByVisibleText(m);
		nextButton.click();

	}
	
	
	
	public void selectCarCondition() {
		WebElement element=carCondition;
		Select select = new Select (element);
		select.selectByVisibleText("Used");
	}
	
	public void selectCarConditionDynamic(String s) {
		WebElement element=carCondition;
		Select select = new Select (element);
		select.selectByVisibleText(s);
	}
	
	
	
	
	public void selectYear(WebElement element, String arg) {
		Select select = new Select (element);
		select.selectByVisibleText(arg);
	}

	public void clickButtons(WebElement element) {
		element.click();
	}
	
	//Talk with Tamara and change methods
	public void selectCarNewVersion(WebElement element, String arg) {
		Select select = new Select(element);
		select.selectByVisibleText(arg);
	}
	
	public void selectModelNewVersion(WebElement element, String arg) {
		Select select = new Select(element);
		select.selectByVisibleText(arg);
		

	}

}
