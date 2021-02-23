package seleniumsection2senarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		d.findElement(By.linkText("Create a new account")).click();
		d.findElement(By.cssSelector("input[type=submit]")).click();
		Alert alt = d.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		d.close();

	}

}
