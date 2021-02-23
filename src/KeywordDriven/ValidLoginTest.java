package KeywordDriven;

import org.openqa.selenium.By;

public class ValidLoginTest extends BaseTest {

	public static void main(String[] args) throws Throwable {
     
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Filelib flib = new Filelib();
		String un = flib.getPropKeyValue(PROP_PATH, "username");
		String pwd = flib.getPropKeyValue(PROP_PATH, "password");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		Thread.sleep(2000);
        d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[@id='loginButton']")).click();
		bt.closeBrowser();

	}

}
