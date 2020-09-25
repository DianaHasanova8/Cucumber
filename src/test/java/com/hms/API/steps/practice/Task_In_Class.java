package com.hms.API.steps.practice;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Task_In_Class {

	@Test
	public void getAllEmpStatuses() {
		Response response = RestAssured.given().contentType("application/json").header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzQxODgsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4OTM4OCwidXNlcklkIjoiMzU5In0.FhxcRtXmc4xDaSe6r2bfVs22hWL6EXEeNAXH7wy3X9I")
				.when().get("http://54.167.125.15/syntaxapi/api/employeeStatus.php");
		response.prettyPrint();
		int code = response.getStatusCode();
		System.out.println(code);		
	}
	
	@Test
	public void getAllEmp() {
		Response response = RestAssured.given().contentType("application/json").header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzQxODgsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4OTM4OCwidXNlcklkIjoiMzU5In0.FhxcRtXmc4xDaSe6r2bfVs22hWL6EXEeNAXH7wy3X9I")
			.when().get("http://54.167.125.15/syntaxapi/api/getAllEmployees.php");
		response.prettyPrint();
		int code = response.getStatusCode();
		System.out.println(code);
	}
}
