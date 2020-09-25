package com.hms.API.steps.practice;

import static io.restassured.RestAssured.given;

import com.hrms.utils.APIConstants;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SyntaxAPIAuthonticationSteps {
	private Response response;
	public static String token;
	private static RequestSpecification request;
	String generateTokenURI = "http://54.167.125.15/syntaxapi/api/generateToken.php";
//http://
	
	@Given("user generates token")
	public void user_generates_token() {
		request = given().header("Content-Type", "application/json");

		System.out.println(request.log().all());
 		response= request.body(CommonMethods.readJson(APIConstants.GENERATE_TOKEN_JSON)).when().post(generateTokenURI);
		
		System.out.println(response.prettyPrint());
		
		token = "Bearer "+response.jsonPath().getString("token");
		System.out.println(token);
	}
}
