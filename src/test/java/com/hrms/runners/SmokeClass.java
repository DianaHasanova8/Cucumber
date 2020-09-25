package com.hrms.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//executes multiple features file
@RunWith(Cucumber.class)
@CucumberOptions(    //features/login.feature if you want to run one feature
		features="src/test/resources/features"
        ,glue="com/hrms/steps"
        ,dryRun =true//false - starts running tc and if not implemented wil show in console
        ,monochrome=true
         // pretty variable prints the steps that are running one by one 
        //"html:target     ->> reports go to json format
        ,plugin= {"pretty", "html:target/html/cucumber-default-report","json:target/cucumber.json"}
        ,tags= {"@smoke"}//{"~@regression"}Excluding Smoke scenarios
       )
public class SmokeClass {
	
//	Sometimes we might need to skip tags in cucumber BDD, 
//	we can use a special Character ~ to skip the tags. 

//	OR: Runs the scenario if it has at least one give tag,
//	there are separated with comma, all the tags will be include in one 
//	double quotes like {"Sanity, smoke, regression"}
//  AND: Runs the scenario if it has all the given tags, all the tags are separated
//  with double quotes {"Sanity", "smoke", "regression"}
	
	// features set: Path to the Feature Files{ }
	// glue set: Path to the Step Definitions{ }
	// monochrome true: Display console Output is more readable format
	// dryRun true: checks if all the Steps have Step Definition
	// tags instruct: What tags in feature files should be executed
	// plugin set: What all report formats to usefalse
}
