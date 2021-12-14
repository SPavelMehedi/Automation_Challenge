package com.hooks;

import com.usa.base.BasePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BasePage {

	public Scenario scenario;
	@Before
	public void suiteSetup(Scenario scenario) throws InterruptedException {
		this.scenario = scenario; 
		initialization();
		logger.info("");
		logger.info("...........START AUTOMATION.............");
		logger.info("");
	}
	@After
	public void tearDown(Scenario scenario) {
	/*	if (scenario.isFailed()) {
			CommonUtil.getScreenshot(driver, scenario);
		}*/
		
		driver.quit();
		logger.info("");
		logger.info("...........END AUTOMATION.............");
		logger.info("");
		
	}
}
