package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name="username") private WebElement untb;
	@FindBy(name="pwd") private WebElement pwtb;
	@FindBy(xpath= "//div[text()='Login ']") private WebElement loginBtn;
	
	public LoginPage(WebDriver d) {
		
		PageFactory.initElements(d, this);
	}
	
	public WebElement getuntb() {
		return untb;
	}
	public void setuntb(String un) {
		untb.sendKeys(un);
	}
	public WebElement getpwtb() {
		return pwtb;	
	}
	public void setpwtb(String pwd) {
		pwtb.sendKeys(pwd);
	}
	public WebElement getloginBtn() {
		return loginBtn;
	}
	public void clickLoginBtn() {
	loginBtn.click();
    }
	public void login(String un , String pwd) {
		
		untb.sendKeys(un);
		pwtb.sendKeys(pwd);
		loginBtn.click();
	
	}
}