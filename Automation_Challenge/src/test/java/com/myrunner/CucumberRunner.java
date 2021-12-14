package com.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin= {"pretty","json:target/cucumber.json" },			
		features = {".//Fetatures/"}, 
        glue = {"com.stepdefinations","com.hooks"}, 	
		dryRun = false, 
		monochrome = true, 
		tags = "@Smoke")

public class CucumberRunner extends AbstractTestNGCucumberTests {

}