package com.hms.API.steps.practice;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
 

public class UpdateEmployeeAPI {

	private Response response;
	private static RequestSpecification request;
	
	@Given("user calls update emp API")
	public void user_calls_update_emp_API() {
	 request.given().header("Content-Type","application/json").header("Authorization",SyntaxAPIAuthonticationSteps.token);
	 request.body(CommonMethods.readJson("C:\\Users\\deann\\"
	 		+ "eclipse-workspace\\HrmsCucumberFramework_1\\src\\test\\resources\\JSONFiles\\UpdateEmployee.json"));
	 
	}

	@When("user retrieves the response")
	public void user_retrieves_the_response() {
	   response= request.put("http://54.167.125.15/syntaxapi/api/updateEmployee.php");
	   response.prettyPrint();
	   
	}

	@Then("user receives status code {int}")
	public void user_receives_status_code(Integer int1) {
	   Integer statusCode= response.getStatusCode();
	   System.out.println("Status code is "+statusCode);
	   response.then().assertThat().statusCode(int1);
	}

	@Then("user validates employee was created")
	public void user_validates_employee_was_created() {
	    boolean isUpdated = response.getBody().asString().contains("Entry updated");
	    Assert.assertTrue(isUpdated);
	    
	}
}
