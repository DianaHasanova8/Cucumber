package com.hrms.testbase;

import com.hrms.pages.AddEmployeeElements;
import com.hrms.pages.DashBoardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;

public class PageInitializer  extends BaseClass  {
	protected static LoginPageElements login;
	protected static DashBoardPageElements dashboard;
	protected static AddEmployeeElements addEmp;
	protected static PersonalDetailsPageElements pdetails;

	public static void initializeAllPages() {
		login = new LoginPageElements();
		dashboard = new DashBoardPageElements();
		addEmp = new AddEmployeeElements();
		pdetails = new PersonalDetailsPageElements();
	}
}
