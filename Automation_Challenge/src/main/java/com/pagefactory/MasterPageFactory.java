package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.usa.base.BasePage;



public class MasterPageFactory extends BasePage {

	public static String value;

	public MasterPageFactory() {
		PageFactory.initElements(driver, this);
	}

	public void getTitles() {
		driver.getTitle();
	}

	@FindBy(xpath = "(//*[text()='Sign in'])[2]")
	@CacheLookup
	private WebElement clickSigninButton;

	@FindBy(id = "input-email-address")
	@CacheLookup
	private WebElement enterUserName;

	@FindBy(id = "input-password")
	@CacheLookup
	private WebElement enterPassword;

	public WebElement getEnterUserName() {
		return enterUserName;
	}

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	public WebElement getClickLogginButton() {
		return clickSigninButton;
	}

	public void getLogin() {
		enterUserName.sendKeys(prop.getProperty("userName"));
		enterPassword.sendKeys(prop.getProperty("textPassword"));
		clickSigninButton.click();
	}

}
