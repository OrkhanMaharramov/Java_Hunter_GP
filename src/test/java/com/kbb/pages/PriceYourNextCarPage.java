package com.kbb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PriceYourNextCarPage {
	
private WebDriver driver;
	
	public PriceYourNextCarPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[@class='title-one']")
	public WebElement pageTitle;
	
	@FindBy(xpath="//p[@class='section-title']")
	public WebElement sectionTitle;
	
	@FindBy(xpath="//h2[@class='title-two js-tnt-control']")
	public WebElement lastTitle;
	
	@FindBy(linkText="Truck")
	public WebElement truckButton;
	
	
	
	@FindBy(id="makeDropdown0")
	public WebElement makeCar;
	
	@FindBy(id="modelDropdown0")
	public WebElement makeModel;
	
	@FindBy(id="startMyResearchBtn")
	public WebElement nextButton;
	
	
	
	
	public void selectCar() {
		WebElement element=makeCar;
		Select select=new Select(element);
		select.selectByVisibleText("Volvo");
		
	}
	
	public void selectModel() {
		WebElement element=makeModel;
		Select select=new Select(element);
		select.selectByVisibleText("S60");
		nextButton.click();
		
	}
	
	public void clickButtons(WebElement element) {
		element.click();
	}
	

}
