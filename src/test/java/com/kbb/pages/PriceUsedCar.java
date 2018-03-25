package com.kbb.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PriceUsedCar {
	
	private WebDriver driver;

	public PriceUsedCar(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="selectedZipCode")
	public WebElement enterZip;
	
	@FindBy(id="enterzipsubmit")
	public WebElement saveButton;
	
	@FindBy (xpath = "(//a[@class='right btn-main-cta'])[6]")
	public WebElement coupe;
	
	public WebElement yearDropdown0;
	
	public WebElement makeDropdown0;
	
	public WebElement modelDropdown0;
	
	public WebElement startMyResearchBtn;
	
	public WebElement mileage;
	
	@FindBy (id = "mileage-error")
	public WebElement mileageError;
	
	public void selectYear() {
		WebElement element = yearDropdown0;
		Select select = new Select(element);
		select.selectByVisibleText("2015");
	}
	public void selectMake() {
		WebElement element = makeDropdown0;
		Select select = new Select(element);
		select.selectByVisibleText("Dodge");
	}
	public void selectModel() throws InterruptedException {
		WebElement element = modelDropdown0;
		Select select = new Select(element);
		select.selectByVisibleText("Challenger");
		Thread.sleep(2000);
		startMyResearchBtn.click();
		
	}
	
	public void handleZipSection() {
		if (enterZip.isDisplayed()) {
			enterZip.sendKeys("22153");
			saveButton.click();
		}
		
	}
		public void enterMileage() {
			mileage.sendKeys("0000"+Keys.ENTER);
		}
		
		public void scrollDown(WebElement element) {
			JavascriptExecutor jsExecuter = (JavascriptExecutor) driver;
			jsExecuter.executeScript("arguments[0].scrollIntoView(true)", element);
			jsExecuter.executeScript("arguments[0].click();", element);
		}
	}

