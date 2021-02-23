package seleniumsection2senarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.get("https://the-internet.herokuapp.com/");
		d.findElement(By.linkText("JavaScript Alerts")).click();
		d.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alt = d.switchTo().alert();
		alt.dismiss();
		String text = d.findElement(By.xpath("//p[text()='You entered: null']")).getText();
		System.out.println(text);
		d.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alt1 = d.switchTo().alert();
		alt1.sendKeys("hello");
		alt1.accept();
		String text1 = d.findElement(By.xpath("//p[text()='You entered: hello']")).getText();
		System.out.println(text1);
		d.close();


		

	}

}
