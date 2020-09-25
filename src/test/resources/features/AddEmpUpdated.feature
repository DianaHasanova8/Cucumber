#Author: syntax team (asel@syntaxtechs.com)
@sprint2 @addemployee
Feature: Add Employee

  Background: 
    Given I am logged into HRMS
    And I navigated to Add Employee Page

  @regression
  Scenario: Add new Employee
  When I add "John", "S" and "Smith"
  And I click Save
  Then I see Employee has been succesfully added
  
  @regression
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
  @regression
  Scenario: Add and Modify Employee Details
    When I enter employee details
      | FirstName | MiddleName | LastName |
      | John      | J          | Smith    |
    And I click Save
    And I click on Edit
    Then I am able to modify Employee Details
      | DriverLicence | ExpirationDate | SSN         | SIN     | Gender | MaritalStatus | Nationality | DOB        |
      | N78787886     | 2021-13-08     | 123-45-6789 | 7687687 | Male   | Other         | Afghan      | 1980-10-10 |
      | T55578855     | 2018-15-08     | 245-45-6789 | 5486547 | Female | Married       | Burmese     | 1980-10-10 |
  Scenario: Add Employee without employee id
    When I add "John", "M" and "Smith"
    And I delete employee id
    And I click Save
    Then I see employee without employee id is being added
 @regression
  Scenario: Add Employee negative scenario
    When I click Save
    Then I see required error message next to the first and last name
 @regression
  Scenario: AddEmployee and Login Credentials
    When I add "John", "M" and "Smith"
    And I click on create login checkbox
    And I enter  "username","password" and "confirm password"
    When I click Save
    Then I see Employee has been succesfully added
  @regression   
 Scenario: Add Employee and validate database
  When I add "James", "John" and "Smith"
  And I click Save
  And I see Employee has been succesfully added
  Then I collect employee data from database
  And I verify employee data is matched