package com.kbb.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VolvoS60StylesPage {
	
private WebDriver driver;
	
	public VolvoS60StylesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@data-selected-vehicle-styles='T5 Inscription']")
	public WebElement T5select;
	
	
	@FindBy(xpath="//a[@title='Click to close.']")
	public WebElement closeFeedback;
	
	
	@FindBy(xpath="//div[@class='style-name section-title']")
	public WebElement styleList;
	
	
	public void chooseT5() {
			
		WebElement element = T5select;   //	
		JavascriptExecutor jse = (JavascriptExecutor)driver;    
		jse.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", element);

		
	}
	
	
	//NEED TO USE COMPARING ELEMENT AND LISTS
//	public static List<String> getElementsText(By locator){
//		List<WebElement>elems=driver.findElements(locator);
//		List<String> elemTexts=new ArrayList<>();
//		
//		for (WebElement el : elems) {
//			if(!el.getText().isEmpty()) {
//				elemTexts.add(el.getText());
//			}
//			
//		}
//		return elemTexts;
//		
//		
//	}
//	
	
	
}	


