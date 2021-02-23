package DataDrivenPractice;

import org.openqa.selenium.By;

public class InvalidLoginTest extends BaseTest {

public static void main(String[] args) throws Throwable {
       
	BaseTest bt = new BaseTest();
	bt.openBrowser();
	Filelib flib = new Filelib();
    int rc = flib.getRowCount("./data/Book0.xlsx", "validlogintest");
	System.out.println(rc);
    for(int i = 0; i<=rc; i++) {
	String un = flib.getCellData("./data/Book0.xlsx", "invalidlogintest", i, 0);
	
	String pwd = flib.getCellData("./data/Book0.xlsx", "invalidlogintest", 1, 1);
	Thread.sleep(2000);
	d.findElement(By.id("username")).sendKeys(un);
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
	Thread.sleep(2000);
	d.findElement(By.xpath("//a[@id='loginButton']")).click();
	}
}
}
