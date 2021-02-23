package com.actitime.genericLib;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class WebdriverCommonLib extends BaseTest {
	
	public void getPagetitle() {
		
		d.getTitle();	
	}
	public void verify(String expected, String actual, String value ) {
		
		Assert.assertEquals(expected, actual);
		Reporter.log(value+"is Displayed", true);
	}
	public void selectOption(WebElement element , int index ) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectOption(WebElement element , String text ) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	public void selectOption(String value ,WebElement element  ) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	public void waitForPage(String title) {
		
		WebDriverWait wait= new WebDriverWait(d , 20);
		wait.until(ExpectedConditions.titleContains(title));
	}
	public void switchToFrame(int index) {
		d.switchTo().frame(index);
	}
	public void switchToFrame(String attribute) {
		d.switchTo().frame(attribute);
	}
	public void switchToFrame(WebElement element ) {
		d.switchTo().frame(element);
	}
	public void mouseOver(WebElement target) {
		Actions act = new Actions(d);
		act.moveToElement(target).perform(); 
	}

	
	
}
