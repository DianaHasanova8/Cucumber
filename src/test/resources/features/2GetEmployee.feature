Feature: Validating Syntax /getOneEmployee.php HRMS API
Background:
Given user generates token
@SyntaxHRMSAPIEndToEnd
Scenario: Retrieving created employee using getOneEmp
Given user calls getOneEmployee API
When User retrieves response from getOneEmployee API
Then status code 200 for getOneEmployee API
Then user validates employee exists