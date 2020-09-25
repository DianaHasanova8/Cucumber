package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class AddEmpElements  extends CommonMethods{

	@FindBy(id ="menu_pim_viewPimModule")
	public WebElement PIM;
	
	@FindBy(id ="menu_pim_addEmployee")
	public WebElement addEmp;
	
	@FindBy(id ="firstName")
	public WebElement empName;
	
	@FindBy(id="lastName")
	public WebElement empLastName;
	
	@FindBy(id="btnSave")
	public WebElement saveBtn;
	
	@FindBy(id="profile-pic")
	public WebElement idEmp;
	
	public AddEmpElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void navigateToAddEmp() {
		click(PIM);
		click(addEmp);
	}
}
