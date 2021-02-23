package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.genericLib.BaseTest;

public class HomePageElement {
	
	@FindBy(xpath="//div[@id='container_users']") private WebElement usertab;
	
	public HomePageElement(WebDriver d) {
		
		PageFactory.initElements(d, this);
	}
	
	public WebElement getusertab() {
		return usertab;
		
	}
	public void clickUserTab() {
		
		usertab.click();
	}
	

}
