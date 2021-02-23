package seleniumsection2senarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListBoxHandlingOnOrangeHrm {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.get("https://www.orangehrm.com/");
		d.findElement(By.xpath("(//a[@class='btn-orange trial-btn pulse '])[2]")).click();
		
		WebDriverWait wait = new WebDriverWait(d,20);
		wait.until(ExpectedConditions.titleContains("Free Human Resource Management Software"));
		String title = d.getTitle();
		
		WebElement noofEmploye = d.findElement(By.xpath("//select[@id='Form_submitForm_NoOfEmployees']"));
		Select sel =new Select(noofEmploye);
		sel.selectByVisibleText("76 - 100");
		
		Thread.sleep(2000);
		WebElement nameofIndustry = d.findElement(By.xpath("//select[@id='Form_submitForm_Industry']"));
		Select s = new Select(nameofIndustry);
		s.selectByIndex(2);
		
		Thread.sleep(2000);
	    WebElement nameofCountry = d.findElement(By.xpath("//select[@id='Form_submitForm_Country']"));
	    Select l = new Select(nameofCountry);
	    l.selectByVisibleText("India");
	    
		d.close();
	}

}
