package seleniumsection2senarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripDate {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.cleartrip.com/");
		
		d.findElement(By.xpath("//label[@title='Round trip']")).click();
		d.findElement(By.id("DepartDate")).click();
		//handling tomorrow date
		String currentDateXpath = "//a[contains(@class,'highlight ')]";
	    String sameWeek =currentDateXpath + "/../following-sibling::td[1]/a";
	    List<WebElement> allDays = d.findElements(By.xpath(sameWeek));
	    
	    if(allDays.size()==0) {
	    	
	    	//handle next week
	    	
	   String nextWeek =currentDateXpath + "/../../following-sibling::tr[1]/td[1]/a";
	   List<WebElement> allWeek = d.findElements(By.xpath(nextWeek)); 	 
	   
	   if(allWeek.size()==0) {
		   
        //handle next month
String nextMonth =currentDateXpath + "/../../../../../following-sibling::div[1]//a[text()='1']";
d.findElement(By.xpath(nextMonth)).click();

}
	   else {
		   
		   d.findElement(By.xpath(nextWeek)).click();
	   }}
	    else {
	    	
	    	//handle same week
	    	
	    	d.findElement(By.xpath(sameWeek)).click();
	 }	}}
