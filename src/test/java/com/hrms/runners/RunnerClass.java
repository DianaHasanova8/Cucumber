package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/login.feature"
        ,glue="com/hrms/steps"
       ,dryRun =false
       )
public class RunnerClass {
	
     
	
}
