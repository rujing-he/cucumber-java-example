package com.rujinghe.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author He Rujing
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		glue = "com.rujinghe.cucumber.stepdefs",
		features = "classpath:cucumber/example",
		plugin = {
				"pretty",
				"html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestRepots.json",
				"rerun:target/cucumber-reports/rerun.txt"
		}
		)
public class RunCucumber {

}
