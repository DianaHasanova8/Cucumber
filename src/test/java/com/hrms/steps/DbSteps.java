package com.hrms.steps;

import java.util.List;
import java.util.Map;

import com.hrms.utils.DbUtils;
import com.hrms.utils.GlobalVariables;

import cucumber.api.java.en.Then;

public class DbSteps {

	
	public static List<Map<String,String>> dblistMap;
	 
 
	
	@Then("I collect employee data from database")
	public void i_collect_employee_data_from_database() {
	DbUtils.createConnection();
	String sqlQuery="select * emp_firstname, emp_lastname,emp_middle_name" + 
			"from hs_hr_employees" + 
			"where emp_number="+GlobalVariables.empId;
	dblistMap=DbUtils.storeDataFromDB(sqlQuery);
	 
	}
}
