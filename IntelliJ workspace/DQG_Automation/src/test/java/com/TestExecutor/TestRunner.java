package com.TestExecutor;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/HomePage.feature",glue={"com.stepDefinitions","com.pages.Hooks"},
                plugin = {"pretty","html:target/cucumber-html-report"}, tags="@Regression",dryRun=false)

public class TestRunner {

}


