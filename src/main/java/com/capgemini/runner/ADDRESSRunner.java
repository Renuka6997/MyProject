package com.capgemini.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "F:\\ProjectWorkspace\\Cucumber_Project\\src\\main\\java\\com\\capgemini\\feature\\ADDRESS.feature", 
                 glue = {"StepDef" }, 
                 plugin = { "pretty", "html:target/cucumber" }, 
                 monochrome = true, dryRun = false)
public class ADDRESSRunner extends AbstractTestNGCucumberTests{

}
