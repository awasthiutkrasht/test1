package seleniumsection2senarios;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionHandlingOnSpiceJet {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.spicejet.com/");
		WebElement link0 = d.findElement(By.xpath("//a[@class='link'][1]"));
		WebElement link1 = d.findElement(By.xpath("//a[@class='link'][1]/../ul/li[2]/a[1]"));
		WebElement link2 = d.findElement(By.xpath("//a[@class='link'][1]/../ul/li[2]/ul/li[2]/a"));
		Actions act = new Actions(d);
		act.moveToElement(link0).moveToElement(link1).moveToElement(link2).click(link2).build().perform();
		String text = d.findElement(By.xpath("//div[@class='spice-club-register white-background']/div[2]/p")).getText();
		System.out.println(text);
		d.close();
		

	}

}
