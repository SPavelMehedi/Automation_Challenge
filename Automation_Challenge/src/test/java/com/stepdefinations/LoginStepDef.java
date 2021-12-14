package com.stepdefinations;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pagefactory.MasterPageFactory;
import com.usa.base.BasePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDef extends BasePage {

	MasterPageFactory pf;

	@Given("^User can open chrome browser & enter the url$")
	public void user_can_open_chrome_browser_enter_the_url() {
		logger.info("******** User able to open chrome browser *********");
		//initialization();
		pf = PageFactory.initElements(driver, MasterPageFactory.class);
		logger.info("******** User able to enter website url *********");
		driver.get(prop.getProperty("URL"));
	}

	@Then("^User able to verify the homepage title$")
	public void user_able_to_verify_the_homepage_title() {
		logger.info("******** User able to verify the homepage *********");
		String actual = "Sign In - ViewMyConsult";
		Assert.assertEquals(actual, driver.getTitle());
		

	}
}
