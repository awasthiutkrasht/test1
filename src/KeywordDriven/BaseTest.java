package KeywordDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest implements IAutoCons {

	public static WebDriver d ;
	
	public void openBrowser() throws Throwable {
		
		Filelib flib = new Filelib();
	   // flib.getPropKeyValue(PROP_PATH, "browser");
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	    d= new ChromeDriver();
	    d.manage().window().maximize();
	    d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    String appUrl = flib.getPropKeyValue(PROP_PATH, "url");
	    d.get(appUrl);
		
	}
	public void closeBrowser() {
		
		
		d.quit();
		
		
	}
	
}
