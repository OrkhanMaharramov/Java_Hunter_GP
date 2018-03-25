package com.kbb.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ResearchHome {
	private WebDriver driver;

	public ResearchHome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='noresultsmake']")
	public WebElement makeDrop;

	@FindBy(xpath = "//select[@id='noresultsmodel']")
	public WebElement modelDrop;

	@FindBy(xpath = "//select[@id='noresultsyear']")
	public WebElement yearDrop;
	
	@FindBy (xpath = "//a[.='Add']")
	public WebElement addButton;
	
	@FindBy (xpath = "//strong[.='New: 2018 Audi S8']")
	public WebElement audi2018S8;
	
	@FindBy (xpath = "//a[.='x']")
	public WebElement selectedClose;
	
	@FindBy (xpath = "//a[.='x']")
	List<WebElement> closeButtons ;
	
	@FindBy(id="selectedZipCode")
	public WebElement enterZip;
	
	@FindBy(id="enterzipsubmit")
	public WebElement saveButton;

	public void selectMake() {
		Select select = new Select(makeDrop);
		select.selectByVisibleText("Audi");
	}

	public void selectModel() {
		Select select = new Select(modelDrop);
		select.selectByVisibleText("S8");
	}

	public void selectYear() {
		Select select = new Select(yearDrop);
		select.selectByVisibleText("2018");

	}
	public void handleZipSection() {
		if (enterZip.isDisplayed()) {
			enterZip.sendKeys("22153");
			saveButton.click();
		}	
	}
	
	public void scrollDown(WebElement element) {
		JavascriptExecutor jsExecuter = (JavascriptExecutor) driver;
		jsExecuter.executeScript("arguments[0].scrollIntoView(true)", element);
		jsExecuter.executeScript("arguments[0].click();", element);
	}
	public void closeSelected() throws InterruptedException {
		
		for (int i = 0; i < closeButtons.size(); i++) {
			if (selectedClose.isDisplayed()) {
				selectedClose.click();
				Thread.sleep(1000);
			}
		}
	}
}
