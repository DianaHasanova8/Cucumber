package com.hms.API.steps.practice;

import com.hrms.utils.APIConstants;
import com.hrms.utils.CommonMethods;
import static io.restassured.RestAssured.given;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.equalTo;

public class PUTUpdateEmployee {

	private static RequestSpecification request;
	private Response response;
	public String file = CommonMethods.readJson(APIConstants.UPDATE_EMPLOYEE_JSON);

	@Given("user calls updateEmployee API")
	public void user_calls_updateEmployee_API() {
		request = given().header("Content-Type", "application/json").header("Authorization",
				SyntaxAPIAuthonticationSteps.token);
		request.body("{ \"employee_id\" : \"" + POSTCreateEmpAPI.employee_ID + "\"," + file);
	}

	@When("User retrieves response for updateEmployee API")
	public void user_retrieves_response_for_updateEmployee_API() {
		response = request.when().put(APIConstants.UPDATE_EMPLOYEE_URI);

		response.prettyPrint();
	}

	@Then("status code is {int} for updateEmployee API")
	public void status_code_is_for_updateEmployee_API(Integer int1) {
		
		int statusCode = response.getStatusCode();
		response.then().assertThat().statusCode(int1);
		System.out.println(statusCode);
	}

	@Then("user verifies employee name was updated")
	public void user_verifies_employee_name_was_updated() {
		response.then().body("employee[0].emp_firstname", equalTo("student1"));
	}

	@Then("user validates employee was updated")
	public void user_validates_employee_was_updated() {
		response.then().body("Message", equalTo("Entry updated"));
		boolean checkPoint = response.asString().contains("Entry updated");

		if (checkPoint) {
			System.out.println("Employee was successfully created");
		}
	}

}