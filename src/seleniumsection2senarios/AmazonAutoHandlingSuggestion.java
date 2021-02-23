package seleniumsection2senarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutoHandlingSuggestion {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver d = new  ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.get("https://www.amazon.in/");
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 12");
		Thread.sleep(4000);
        List<WebElement> list = d.findElements
        		(By.xpath("//input[@id='twotabsearchtextbox']/ancestor::div[5]/following-sibling::div//span[2]"));
        Thread.sleep(8000);
		System.out.println("pass");
		System.out.println(list.size());
		for (WebElement wb : list) {
			
		String text = wb.getText();
		System.out.println(text);
		String rt = "pro";
		
		if(text.contains(rt)) {
			wb.click();
			break;
		}
		
		
	}
	

	}

}
