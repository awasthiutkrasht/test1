package com.actitime.TimeTrack;

import org.testng.annotations.Test;

import com.actitime.genericLib.BaseTest;
import com.actitime.genericLib.Filelib;
import com.actitime.pages.LoginPage;

public class ValidLoginPage extends BaseTest {
	
	@Test
	public void run() throws Throwable {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Filelib flib = new Filelib();
		String un = flib.getPropKey(PROP_PATH, "username");
		String pwd = flib.getPropKey(PROP_PATH, "password");
		
		LoginPage lp = new LoginPage(d);
		lp.login(un, pwd);
		
	}

}
