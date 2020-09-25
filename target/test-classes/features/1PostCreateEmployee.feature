Feature: Validating Syntax /createEmployee.php HRMS API
Background:
Given user generates token
@SyntaxHRMSAPIEndToEnd
Scenario: This test checks if an Employee has been created 
Given user calls createEmployee API to verify Emp is created
When User retrieves response from Employee API
Then status code 200 for createEmp API
Then user validates employee has been created

