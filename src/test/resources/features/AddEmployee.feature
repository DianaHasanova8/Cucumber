##Author: syntax team 
@sprint2 @addemployee 
Feature: Add Employee 

#@smoke
#  Scenario: Add and Modify Employee Details
#    When I enter employee details
#      | FirstName | MiddleName | LastName |
#      | John      | J          | Smith    |
#    And I click Save
#    Then I am able to modify Employee Details
#      | DriverLisence | ExpirationDate | SSN         | SIN     | Gender | MaritalStatus | Nationality | DOB        |
#      | N78787886     | 2021-12-08     | 123-45-6789 | 7687687 | Male   | Other         | Afghan      | 1980-10-10 |
#      | Nhkjkgkhgkg   | 2018-12-08     | yiy-45-6789 | uyiy    | Female | Married       | Burmese     | 1980-10-10 |


Background: 
	Given I am logged in to HRMS 
	And I navigated to Add Employee Page 
	
@regression
Scenario: Add new Employee 
	When I add "John", "S" and "Smith" 
	And I click Save 
	Then I see Employee has been succesfully added 
	
@test
Scenario Outline: Add new Employee 
	When I add "<FirstName>", "<MiddleName>" and "<LastName>" 
	And I click Save 
	Then I see Employee with "<FirstName>", "<MiddleName>" and "<LastName>" is displayed 
	
	Examples: 
		| FirstName | MiddleName | LastName |
		| James     |            | Smith    |
		| Jane      | J          | Smith    |
		| Sasha     | J          | Smith    |
		| David     | J          | Smith    |
		
		@inProgress 
		Scenario: Add and Modify Employee Details 
			When I enter employee details 
				|FirstName|MiddleName|LastName|
				|John|J|Smith|
			And I click Save 
			And I click on Edit 
			Then I am able to modify Employee Details 
				| DriverLisence | ExpirationDate | SSN         | SIN     | Gender | MaritalStatus | Nationality | DOB        |
				| N78787886     | 2021-12-08     | 123-45-6789 | 7687687 | Male   | Other         | Afghan      | 1980-10-10 |
				| Nuy89889800   | 2018-12-08     | yiy-45-6789 | uyiy    | Female | Married       | Burmese     | 1980-10-10 |
#		Scenario: Add Employee without employee id 
#			When I add firstName, middleName and last name 
#			And I delete employee id 
#			And I click Save 
#			Then I see employee without employee id is being added 
#			
#		Scenario: Add Employee negative scenario 
#			When I click Save 
#			Then I see required error message next to the first and last name 
#			
#		Scenario: AddEmployee and Login Credentials 
#			When I add firstName, middleName and last name 
#			And I click on create login checkbox 
#			And I enter username, password and confirm password 
#			When I click Save 
#			Then I see Employee has been succesfully added 
#			
