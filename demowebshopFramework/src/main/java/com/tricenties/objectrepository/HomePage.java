package com.tricenties.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText = "Log out")
	private WebElement logoutlink;
	
	@FindBy(linkText = "Books")
	private WebElement bookslink;
	
	@FindBy(linkText = "Computer")
	private WebElement computerlinklink;
	
	@FindBy(linkText ="Electronics")
	private WebElement electroniclink;
	
	@FindBy(linkText = "Gift Cards")
	private WebElement giftcardlink;

	public WebElement getComputerlinklink() {
		return computerlinklink;
	}

	public WebElement getElectroniclink() {
		return electroniclink;
	}

	public WebElement getGiftcardlink() {
		return giftcardlink;
	}

	public WebElement getBookslink() {
		return bookslink;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}