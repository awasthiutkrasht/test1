package com.actitime.genericLib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.google.common.io.Files;
@Listeners(com.actitime.genericLib.MyListener.class)
public class MyListener extends BaseTest implements ITestListener {

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log(context.getName()+"method finished", true);
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log(context.getName()+"method started", true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+"method failed", true);
		WebdriverCommonLib wlib = new WebdriverCommonLib();
		
		TakesScreenshot ts=(TakesScreenshot)d;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\utkrasht awasthi\\eclipse-workspace\\javaprogrampractice\\Screenshot");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+"method skipped", true);;
	}

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+"method started", true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
          Reporter.log(result.getName()+"method success", true);		
	}

	
}
