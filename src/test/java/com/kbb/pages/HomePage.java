package com.kbb.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/car-values/']")
	public WebElement carValues;

	@FindBy(linkText="New & Used Car Prices")
	public WebElement newAndUsedCar;
	

public void hoverOver() {
	WebElement element =carValues;
	Actions actions =new Actions(driver);
	actions.moveToElement(element).perform();
	newAndUsedCar.click();
}



}
