package com.actitime.users;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.TimeTrack.ValidLoginPage;
import com.actitime.genericLib.BaseTest;
import com.actitime.genericLib.Filelib;
import com.actitime.pages.HomePageElement;
import com.actitime.pages.LoginPage;
import com.actitime.pages.UserList;
@Listeners(com.actitime.genericLib.MyListener.class)
public class CreateNewUser extends BaseTest {
	@Test
	public void createNewUserTest() throws Throwable {
		
		ValidLoginPage vp = new ValidLoginPage();
		vp.run();
		
		HomePageElement hp = new HomePageElement(d);
		hp.clickUserTab();
		
		UserList ul = new UserList (d);
         ul.clickNewUser();
		
		Thread.sleep(3000);
		Filelib flib = new  Filelib();
		ul.create(flib.getCellData(EXCEL_PATH, 1, 0, "Sheet1"),
				flib.getCellData(EXCEL_PATH, 1, 1, "Sheet1"),
				flib.getCellData(EXCEL_PATH, 1, 2, "Sheet1"), 
				flib.getCellData(EXCEL_PATH, 1, 3, "Sheet1"));
		
		
	}
	
	
}
