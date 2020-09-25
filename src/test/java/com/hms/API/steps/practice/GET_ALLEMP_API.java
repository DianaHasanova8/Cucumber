package com.hms.API.steps.practice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.json.JSONArray;
import org.json.JSONObject;

import com.hrms.utils.APIConstants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_ALLEMP_API {

	private Response response;
	private RequestSpecification request;

	@Given("user calls getAllEmployee API")
	public void user_calls_getAllEmployee_API() {
		given().header("Content-Type", "application/json").header("Authorization", SyntaxAPIAuthonticationSteps.token);
	}

	@When("user retrieves reponse for getting all employees")
	public void user_retrieves_reponse_for_getting_all_employees() {
		response = request.when().get(APIConstants.GET_ALL_EMPLOYEES);
	}

	@Then("status code is {int} for getting all employees")
	public void status_code_is_for_getting_all_employees(Integer int1) {
		response.then().assertThat().statusCode(int1);
	}

	@Then("user validates all employees were retrieved")
	public void user_validates_all_employees_were_retrieved() {
		JSONObject json = new JSONObject(response.prettyPrint());

		JSONArray array = json.getJSONArray("Employee");
		System.out.println("Size for returned Employee list is " + array.length());

		for (int i = 0; i < array.length() - 1; i++) {
			String createEmp = response.jsonPath().getString("Employee[" + i + "].emp_firstname");

			if (createEmp.equals("John")) {
				response.then().body("Employee[" + i + "].emp_lastname", equalTo("Davis"));

				response.then().body("Employee[" + i + "].emp_middle_name", equalTo("Lewis"));
				response.then().body("Employee[" + i + "].emp_gender", equalTo("employee"));

				response.then().body("Employee[" + i + "].emp_birthday", equalTo("1999-01-01"));

				response.then().body("Employee[" + i + "].emp_status", equalTo("Self-Employee"));
				response.then().body("Employee[" + i + "].emp_job_title", equalTo("Developer"));
				System.out.println("Employee is found");
				break;
			} else {
				System.out.println("Employee is not found ");
			}
		}
	}
}
