package com.hms.API.steps.practice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import com.hrms.utils.APIConstants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_ONE_EmployeeAPI {

	private static RequestSpecification request;
	private Response response;

	@Given("user calls getOneEmployee API")
	public void user_calls_getOneEmployee_API() {
		given().header("Content-Type", "application/json").header("Authorization", SyntaxAPIAuthonticationSteps.token)
				.param("employee_id", POSTCreateEmpAPI.employee_ID);
	}

	@When("User retrieves response from getOneEmployee API")
	public void user_retrieves_response_from_getOneEmployee_API() {
		response = request.when().get(APIConstants.GET_ONE_EMPLOYEE_URI);
	}

	@Then("status code {int} for getOneEmployee API")
	public void status_code_for_getOneEmployee_API(Integer int1) {
		response.then().assertThat().statusCode(int1);
	}

	@Then("user validates employee exists")
	public void user_validates_employee_exists() {
		request.then().body("message", equalTo("employee"));
		response.then().body("Employee[0].emp_firstname", equalTo("John"));

		JsonPath jsonPathEvaluator = response.jsonPath();
//		String result = jsonPathEvaluator.prettify();
//	    System.out.println(result);
		String pathID = jsonPathEvaluator.get("Employee[0].epm_id");
		// Elion // String code = jsonPathEvaluator.get("_meta.code");
		System.out.println("Emp id is " + pathID);

		// Elion // request.then().body("message", Matchers.equalTo("OK."));
//2d Way
		List<Object> albums = jsonPathEvaluator.get("result");
		Object album = albums.get(0);
		System.out.println(album);
		
		
	}
}
