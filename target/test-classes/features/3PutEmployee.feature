Feature: Validating Syntax /updateEmployee.php HRMS API
Background:
Given user generates token
@SyntaxHRMSAPIEndToEnd22
Scenario: Updating created employee using /updateEmployee.php API
Given user calls updateEmployee API
When User retrieves response for updateEmployee API
Then status code is 200 for updateEmployee API
Then user verifies employee name was updated
Then user validates employee was updated