@sprint1,login
Feature: Login

@smoke
Scenario: Valid Login
Given I open browser and navigated to the HRMS
When I enter valid username and valid password
And I click login button
Then I am successfully logged in
And I close the browser

@regression
Scenario: Invalid Login
Given I open browser and navigated to the HRMS
When I enter valid username and invalid password
And I click login button
Then I see error message
And I close the browser




 


