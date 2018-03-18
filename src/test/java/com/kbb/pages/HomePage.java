package com.kbb.pages;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

	@FindBy(id="intentDropdown0")
	public WebElement vehicleOpt;
	
	public void selectVehicle(int i) {
		Select select =new Select(vehicleOpt);
		select.selectByIndex(i);
	}

	@FindBy(id="makeDropdown0")
	public WebElement make;
	
	public void selectMake(int i) {
		Select select =new Select(make);
		select.selectByIndex(i);
	}
	
	@FindBy(id="modelDropdown0")
	public WebElement model;
	
	public List<String> getAllModel() {
		Select select =new Select(model);
		List<WebElement> allOptions=select.getOptions();
		allOptions.remove(0);
		List<String> options=new ArrayList<>();
		
		for (WebElement element : allOptions) {
		
				  options.add(element.getText());
			}	
		//System.out.println(options);		
		return options;
	}
	
	
	
	
	
}
