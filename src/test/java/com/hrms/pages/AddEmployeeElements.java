package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class AddEmployeeElements extends CommonMethods{
	

	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement PIM;

	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addEmp;
	
	@FindBy(id="firstName")
	public WebElement firstName;
	
	@FindBy(id="middleName")
	public WebElement middleName;
	
	@FindBy(id="lastName")
	public WebElement lastName;
	
	@FindBy(id="btnSave")
	public WebElement submitBtn;
	
	@FindBy(xpath="//div[@id='profile-pic']/h1")
	public WebElement ID;

	public AddEmployeeElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void navigateToAddEmp() {
		click(PIM);
		click(addEmp);
	}
}
