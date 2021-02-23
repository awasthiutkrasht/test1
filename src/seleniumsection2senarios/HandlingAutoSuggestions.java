package seleniumsection2senarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestions {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe" );
        WebDriver d = new ChromeDriver();
        
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        d.get("https://www.flipkart.com/");
        d.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
        d.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
        Thread.sleep(4000);
        
        List<WebElement> sugg_lis = d.findElements(By.xpath("//input[@name='q']/../../following-sibling::ul//a/div[2]"));
        System.out.println("pass");
        System.out.println(sugg_lis.size());
   //     int count = 1;
        System.out.println(sugg_lis.size());
        for(WebElement wb : sugg_lis ) {
        	
        	String text = wb.getText();
        	String rbk = "12 pro max";
        	System.out.println(text);
        	if(text.contains(rbk)) {
        		
        		wb.click();
        		break;
        	}
   //     	System.out.println(text);
    //    	count++;
        }
        System.out.println("fail");
         Thread.sleep(10000);
        d.close();
      
      //  System.out.println("total suggestion is :"+ count);
        //d.close();
//		System.out.println("pass");
	}

}
