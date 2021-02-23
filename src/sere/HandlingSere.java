package sere;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSere {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		
		POM p = new POM(d);
		d.navigate().refresh();
		p.clickloginBtn();
	}
}
