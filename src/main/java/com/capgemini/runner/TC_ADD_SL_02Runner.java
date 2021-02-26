package com.capgemini.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "F:\\ProjectWorkspace\\Cucumber_Project\\src\\main\\java\\com\\capgemini\\feature\\TC_ADD_SL_02.feature", 
                 glue = {"StepDef" }, 
                 plugin = { "pretty", "html:target/cucumber" }, 
                 monochrome = true, dryRun = false)

public class TC_ADD_SL_02Runner extends AbstractTestNGCucumberTests{

}

