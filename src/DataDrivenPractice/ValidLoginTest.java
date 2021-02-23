package DataDrivenPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidLoginTest extends BaseTest {
@Test
	public void test() throws Throwable {
		
//		BaseTest bt = new BaseTest();
		openBrowser();
		
		Filelib flib =new Filelib();
		
		String un = flib.getCellData("./data/Book0.xlsx", "validlogintest", 1, 0);
		String pwd = flib.getCellData("./data/Book0.xlsx", "validlogintest", 1, 1);
		System.out.println(un);
		System.out.println(pwd);
		d.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		d.findElement(By.xpath("//a[@id='loginButton']")).click();
	
closeBrowser();
	}
	
}
