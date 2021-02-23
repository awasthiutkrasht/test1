package MethodDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest implements IAutoCons {
	
	public static WebDriver d;
	
	public void openBrowser() throws Throwable {
		
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		 d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Filelib flib = new Filelib();
		d.get(flib.getPropertyKeyValue(PROP_PATH, "url"));	
	}
	
	
	public void closeBrowser() {
		
		d.quit();
		
	}
	

}
