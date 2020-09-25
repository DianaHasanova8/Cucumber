package com.hms.API.steps.practice;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class SampleAPITests {
	//@Test
	public void getAllJobTitles() {
		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzQxODgsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4OTM4OCwidXNlcklkIjoiMzU5In0.FhxcRtXmc4xDaSe6r2bfVs22hWL6EXEeNAXH7wy3X9I")
				.when().get("http://54.167.125.15/syntaxapi/api/jobTitle.php");

		response.prettyPrint();

		int actualResponseCode = response.getStatusCode();
		System.out.println(actualResponseCode);
	}

	//@Test
	public void getOneEmp() {
		Response response = RestAssured.given().param("employee_id", "3559").contentType("application/json").header(
				"Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzQxODgsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4OTM4OCwidXNlcklkIjoiMzU5In0.FhxcRtXmc4xDaSe6r2bfVs22hWL6EXEeNAXH7wy3X9I")
				.when().get("http://54.167.125.15/syntaxapi/api/getOneEmployee.php");
		response.prettyPrint();
		int actualResponseCode2 = response.getStatusCode();
		System.out.println(actualResponseCode2);
	}

	@Test
	public void createEmployee() {
		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzQxODgsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4OTM4OCwidXNlcklkIjoiMzU5In0.FhxcRtXmc4xDaSe6r2bfVs22hWL6EXEeNAXH7wy3X9I")
				//.body("{\emp_firstname\:\Didi\+\n +")
				.param("emp_firstname", "Jackson")
				.param("emp_lastname", "Kirkin")
				.param("emp_middle_name", "Hope")
				.param("emp_gender", "1")
				.param("emp_birthday", "1998-03-12")
				.param("emp_status", "Self-Employee")
				.param("emp_job_title", "Developer")
				.when().post("http://54.167.125.15/syntaxapi/api/createEmployee.php");

		response.prettyPrint();
		int code = response.getStatusCode();
		System.out.println(code);
//		Assert.assertEquals(200, code);
		
	}

}
