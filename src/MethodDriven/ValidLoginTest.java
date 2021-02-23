package MethodDriven;

import org.testng.annotations.Test;

import MethodDriven.POMLOGIN;

public class ValidLoginTest extends BaseTest {
	
	@Test
	public void run() throws Throwable {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		POMLOGIN pl = new POMLOGIN(d);
		Filelib flib = new Filelib();
		String un = flib.getPropertyKeyValue(PROP_PATH, "username");
		String pwd = flib.getPropertyKeyValue(PROP_PATH, "password");
		
		pl.login(un, pwd);
		bt.closeBrowser();
	}

}
