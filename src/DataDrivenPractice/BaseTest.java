package DataDrivenPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public static WebDriver d;
	
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		 d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://demo.actitime.com/login.do");
	
	}

	public void closeBrowser() {
		
		d.quit();
		
	}
}
