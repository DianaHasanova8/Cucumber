package com.hrms.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/UpdateEmployee.feature",
glue="com.hms.API.steps.practice",
dryRun=true,
tags="@APITEST"
)



public class UpdateEmpAPI_Runner {

}
