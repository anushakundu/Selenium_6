package com.teicenties.genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.tricenties.objectrepository.HomePage;
import com.tricenties.objectrepository.LogInPage;
import com.tricenties.objectrepository.WelcomePage;

public class BaseClass { 
	public static WebDriver driver;
	public WelcomePage wp ;
	public LogInPage lp ;
	public HomePage hp;
	public static ExtentTest test;
	
	
	WebDriverUtility wUtil = new WebDriverUtility();
	public static ExtentReports exReport;
	public javaUtility jUtil = new javaUtility();
	public FileUtility fUtil = new FileUtility();
	
	@BeforeSuite
	public void configReport()
	{
		ExtentSparkReporter spark = new ExtentSparkReporter("./htmlreports/ExtentReport_"+jUtil.getSystemTime()+".html");
		 exReport = new ExtentReports();
		exReport.attachReporter(spark);
	}
	
	@BeforeClass
	public void openBrowser() throws IOException
	{
		driver = new ChromeDriver();
		wUtil.maximize(driver);;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(fUtil.getDataFromProperty("url"));
	}
	@BeforeMethod
	public void login() throws IOException
	{
		wp=new WelcomePage(driver);
		wp.getLoginLink().click();
		lp = new LogInPage(driver);
		lp.getEmailtextfield().sendKeys(fUtil.getDataFromProperty("email"));
		lp.getPwatextfield().sendKeys(fUtil.getDataFromProperty("passward"));
		lp.getLoginbtn().click();
		
	}
	
	@AfterMethod
	public void logout()
	{
		hp=new HomePage(driver);
		hp.getLogoutlink().click();
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void reportBackup()
	{
		exReport.flush();
	}

	public void onTestFaliure() {
		// TODO Auto-generated method stub
		
	}

	public void onTestFaliure(ITestResult result) {
	
		
	}

}
