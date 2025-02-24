package com.teicenties.genericutility;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListenersUtility extends BaseClass implements ITestListener {
	
	
	
	@Override
	public void onTestStart(ITestResult result) {
		exReport.createTest(result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "test script is failed");
		TakesScreenshot ts = (TakesScreenshot) driver;
		String screenshot = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(screenshot);
		
	}

	@Override
	public void onTestFaliure(ITestResult result)
	{
		try {
			wUtil.takeScreenshot(driver);
			}
		catch(IOException e) {
			e.printStackTrace();
			}
	}
	
	
	
	
	

}
