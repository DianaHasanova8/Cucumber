package com.hms.API.steps.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import com.hrms.utils.APIConstants;
import com.hrms.utils.CommonMethods;

public class DELETE_EmployeeAPI {

	private static RequestSpecification request;
	private Response response;
	public static Object employee_ID;
	
	
	@Given("user calls deleteEmployee API")
	public void user_calls_deleteEmployee_API() {
	 request=given().header("Content-Type","application/json").header
			 ("Authorization",SyntaxAPIAuthonticationSteps.token).param("employee_id", POSTCreateEmpAPI.employee_ID);
 	 
	}

	@When("User retrieves response for deleteEmployee API")
	public void user_retrieves_response_for_deleteEmployee_API() {
	    response= request.when().delete(APIConstants.DELETE_EMPLOYEE_URI);
	    response.prettyPrint();
	
	}

	@Then("status code is {int} for deleteEmployee API")
	public void status_code_is_for_deleteEmployee_API(int int1) {
	 response.then().assertThat().statusCode(int1);
	 int reponseCode= response.getStatusCode();
	  ///// 	 Assert.assertEquals(int1, response.getStatusCode());

	 Assert.assertEquals(int1, reponseCode);
	 response.then().assertThat().statusCode(int1);
	}

	@Then("user validates user was deleted")
	public void user_validates_user_was_deleted() {
	  response.then().body("employee[0].employee_id", equalTo(POSTCreateEmpAPI.employee_ID));
	  response.then().body("message",equalTo( "Entry deleted"));
	  boolean responseMessage= response.asString().contains("Entry deleted");
	  if(responseMessage) {
		  System.out.println("Messge is correct");
	  }else {
		  System.out.println("Message is incorrect");
	  }
	}


	
}
