package com.hms.API.steps.practice;

import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.json.JSONObject;

import cucumber.api.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Verify_ThreeWays {

	private static RequestSpecification request;
	private Response response;

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
		// 3d way
		// Example values
		JSONObject jsonOBJECT = new JSONObject(response.asString());
		JSONObject meta = jsonOBJECT.getJSONObject("_meta");
		JSONObject rateLimit = meta.getJSONObject("rateLimit");

		int limitInt = rateLimit.getInt("limit");
		System.out.println(limitInt);

		int limitInt2 = (int) rateLimit.getInt("limit");
		System.out.println(limitInt2);

	}
}
