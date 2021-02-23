package sere;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {

	@FindBy(xpath="//div[text()='Login ']") private WebElement loginBtn;
	
	public POM(WebDriver d) {
		
		PageFactory.initElements(d, this);
	
	}
	
	public WebElement getloginBtn() {
		
		return loginBtn;
		
	}
	
	public void clickloginBtn() {
		
		loginBtn.click();
		
	}

}
