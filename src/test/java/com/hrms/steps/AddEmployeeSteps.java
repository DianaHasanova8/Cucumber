package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

 import com.hrms.pages.DashBoardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.GlobalVariables;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddEmployeeSteps extends CommonMethods {

	@Given("I am logged in to HRMS")
	public void i_am_logged_in_to_HRMS() {
		LoginPageElements login = new LoginPageElements();
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@Given("I navigated to Add Employee Page")
	public void i_navigated_to_Add_Employee_Page() {
		DashBoardPageElements dashboard = new DashBoardPageElements();
		dashboard.navigateToAddEmployee();
	}

	@When("I add {string}, {string} and {string}")
	public void i_add_and_(String fName, String mName, String lName) {
		sendText(addEmp.firstName, fName);
		sendText(addEmp.middleName, mName);
		sendText(addEmp.lastName, lName);
		GlobalVariables.empId = addEmp.ID.getAttribute("value");
	//getText();
	}

	@When("I click Save")
	public void i_click_Save() {
		click(addEmp.submitBtn);
	}

	@Then("I see Employee has been succesfully added")
	public void i_see_Employee_has_been_succesfully_added() {
		Assert.assertEquals("Employee is NOT being added", pdetails.empId.getText(), GlobalVariables.empId);
	}

	@Then("I see Employee with {string}, {string} and {string} is displayed")
	public void i_see_Employee_with_and_is_displayed(String string, String string2, String string3) {

	}

	@When("I enter employee details")
	public void i_enter_employee_details(DataTable empDetails) {

		List<Map<String, String>> empDetailList = empDetails.asMaps();
		for (Map<String, String> map : empDetailList) {
			sendText(addEmp.firstName, map.get("FirstName"));
			sendText(addEmp.middleName, map.get("MiddleName"));
			sendText(addEmp.lastName, map.get("LastName"));

		}
	}

	@When("I click on Edit")
	public void clickOnEdit_SaveButton() {
		click(pdetails.edit_saveBtn);
	}

//	@Then("I am able to modify Employee Details")
//	public void modifyEmployeeDetails(DataTable modifyEmpDetail) {
//		List<Map<String,String>>modifyList =modifyEmpDetail.asMaps();
//	    for(Map<String,String> map:modifyList) {
//	    	click(pdetails.edit_saveBtn);
//	    	
//	    	sendText(pdetails.licenNo, map.get("DriverLisence"));
//	    	sendText(pdetails.maritalStatus, map.get("MaritalStatus"));
//	    	sendText(pdetails.nationality, map.get("Nationality"));
//	    }
//	}
	@Then("I am able to modify Employee Details")
	public void modifyEmployeeDetails(DataTable modifyEmpDetail) throws InterruptedException {
		List<Map<String, String>> modifyList = modifyEmpDetail.asMaps();

		for (Map<String, String> map : modifyList) {
			// click on edit
			click(pdetails.edit_saveBtn);

			// passing new details to the employee
			sendText(pdetails.licenNo, map.get("DriverLisence"));
			sendText(pdetails.licExpDate, map.get("ExpirationDate"));
			sendText(pdetails.SSN, map.get("SSN"));
			sendText(pdetails.SIN, map.get("SIN"));
			clickRadio(pdetails.genderLabels, map.get("Gender"));
			Thread.sleep(5000);

			selectDdValue(pdetails.maritalStatus, map.get("MaritalStatus"));
			selectDdValue(pdetails.nationality, map.get("Nationality"));
			sendText(pdetails.DOB, map.get("DOB"));

			// click on save
			click(pdetails.edit_saveBtn);
		}
		 // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   // throw new cucumber.api.PendingException();
	}
	@Then("I verify employee data is matched")
	public void i_verify_employee_data_is_matched(DataTable dataTable) {
	    //extract data from cucumber dataTable
		List<Map<String,String>> dataListMap = dataTable.asMaps();
		//comparison of dataMap to dMap
		
		System.out.println("Data List map "+dataListMap);
		System.out.println("DataBase List map "+ DbSteps.dblistMap);
		Assert.assertTrue(dataListMap.equals(DbSteps.dblistMap));
		
		
	}
	
}
