package com.hms.API.steps.practice;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateEmployeeAPI {
	private Response response;
	private static RequestSpecification request;
	public Object employee_id;

	@Given("user calls createEmployee API")
	public void user_calls_createEmployee_API() {
		request = given().header("Content-Type", "application/json").header("Authorization",
				SyntaxAPIAuthonticationSteps.token);

		request.body(CommonMethods.readJson(
				"C:\\Users\\deann\\eclipse-workspace\\HrmsCucumberFramework_1\\src\\test\\resources\\JSONFiles\\CreateEmployee.json"));
	}

	@When("user retrieves response")
	public void user_retrieves_response() {
		response = request.post("http://54.167.125.15/syntaxapi/api/createEmployee.php");
		response.prettyPrint();

	}

	@Then("status code is {int}")
	public void status_code_is(int int1) {
		int bs = response.getStatusCode();
		if (bs == 200) {
			System.out.println("Success");
		} else {
			System.out.println("code failed");
		}
	}

	@Then("user validates employee is created")
	public void user_validates_employee_is_created() {
		boolean isCreated = response.prettyPrint().contains("Entry Created");
		Assert.assertTrue("employee is not created", isCreated);
		System.out.println("Response is " + response.prettyPrint());
	}

}
