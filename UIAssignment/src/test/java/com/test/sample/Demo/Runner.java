package com.test.sample.Demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\data\\resource\\UITest.feature",plugin = { "html:target\\cucumber-html-report\\", "json:target\\cucumber-json-report.json" }
		)

public class Runner {

}
