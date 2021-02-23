package Cleartrip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest implements IAutoCons {
	
	public static WebDriver d;
	Filelib flib = new Filelib();
	public void openBrowser() throws Throwable {
		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--disable-notifications");
		co.addArguments("start maximized");
	    System.setProperty(CHROME_KEY , CHROME_VALUE);
		d= new  ChromeDriver(co);
		d.get(flib.getPropKey(PROP_PATH, "URL"));
		
	}
	
	public void closeBrowser() {
		
		d.quit();
		
	}
	
	
	

}
