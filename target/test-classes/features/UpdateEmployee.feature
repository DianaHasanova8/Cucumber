Feature: Updating Employee
Background:
 Given user generates token
 @APITEST
 Scenario: This test will check if employee was updated
 Given user calls update emp API
 When user retrieves the response
 Then user receives status code 200
 Then user validates employee was created
 
