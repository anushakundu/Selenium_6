package com.tricenties.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	@FindBy(id="Email")
	private WebElement emailtextfield;
	@FindBy(id="Password")
	private WebElement pwatextfield;
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginbtn;
	
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPwatextfield() {
		return pwatextfield;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	

}
