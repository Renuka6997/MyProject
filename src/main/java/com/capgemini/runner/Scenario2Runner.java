package com.capgemini.runner;



/**
 * @author Renuka
 */

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features = "F:\\ProjectWorkspace\\Cucumber_Project\\src\\main\\java\\com\\capgemini\\feature\\Scenario2.feature",
//path of the feature file
glue = {"StepDef" }, //path of the step definition files
plugin = { "pretty", "html:target/cucumber"}, //The report format to be displayed 
format = {"json:json_output/cucumber.json"}, // To generate output in json format
tags= {"@Test1, @Test2"}, //The feature files of particular tag to be executed using OR condition
monochrome = true, //To display the output in console in a readable format
dryRun = false,//To check all the steps in step definition file according to the feature file(If it is set to true)
strict = false) //It will fail execution if there are any undefined steps(if it is set to true condition)

public class Scenario2Runner extends AbstractTestNGCucumberTests{

}

