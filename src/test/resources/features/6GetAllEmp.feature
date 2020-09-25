Feature: Validating getAllEmployee.php HRMS API
Background:
Given user generates token
@SyntaxHRMSAPIEndToEnd24

Scenario: Getting all employees using/getAllEmployees.php

Given user calls getAllEmployee API
When user retrieves reponse for getting all employees
Then status code is 200 for getting all employees
Then user validates all employees were retrieved

