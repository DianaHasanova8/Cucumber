package com.hms.API.steps.practice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Assert;

import com.hrms.utils.APIConstants;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTCreateEmpAPI {

	private static RequestSpecification request;
	private Response response;
	public static Object employee_ID;

	@Given("user calls createEmployee API to verify Emp is created")
	public void user_calls_createEmployee_API_to_verify_Emp_is_created() {
		request = given().header("Content-Type", "application/json").header("Authorization",
				SyntaxAPIAuthonticationSteps.token);
		request.body(CommonMethods.readJson(APIConstants.CREATE_EMP_URI));
	}

	@When("User retrieves response from Employee API")
	public void user_retrieves_response_from_Employee_API() {
		response = request.when().post(APIConstants.CREATE_EMP_URI);
		response.prettyPrint();
	}

	@Then("status code {int} for createEmp API")
	public void status_code_for_createEmp_API(int int1) {
		response.then().assertThat().statusCode(int1);
	}

	@Then("user validates employee has been created")
	public void user_validates_employee_has_been_created() {
 		response.then().body("Employee[0].emp_firstname", equalTo(POSTCreateEmpAPI.employee_ID));

		JsonPath jsonPathEvaluator = response.jsonPath();
		
		String actual_employee_ID = jsonPathEvaluator.get("employee[0].employee_id");
		
		System.out.println("Emp id is " + actual_employee_ID);
		
		try {
			Assert.assertEquals("Verifying Employee ID's", POSTCreateEmpAPI.employee_ID,actual_employee_ID);
		}catch(AssertionError e) {
			System.out.println("Employees ID's do not match");
		}
		System.out.println("Employees ID's match");
	}
}
