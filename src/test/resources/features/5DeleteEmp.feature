Feature: Validating deleteEmployee.php HRMS API
Background:
Given user generates token
@SyntaxHRMSAPIEndToEnd

Scenario: Deleting existing employee using /deleteEmployee.php API

Given user calls deleteEmployee API
When User retrieves response for deleteEmployee API
Then status code is 200 for deleteEmployee API
Then user validates user was deleted

