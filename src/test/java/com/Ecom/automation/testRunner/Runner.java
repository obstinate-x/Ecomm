package com.Ecom.automation.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\java\\com\\Ecom\\automation\\feature\\Login.feature"},
		glue = {"com.Ecom.automation.utils", "com.Ecom.automation.stepDefinition"},
		plugin = {"pretty", "html:target\\cucumber-report\\report.html"}
		
		)

public class Runner {

}
