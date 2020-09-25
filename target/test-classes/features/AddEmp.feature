##Author: Diana H
#@sprint3 @addEmp 
#Feature: AddEmp 
#
#Background: 
#	Given I am logged in to HRMS 
#	Given I navigated to Add Employee Page 
#	
#@smoke
#Scenario: Add New Emp
#	When  I add "J" and "H" 
#	And I click save 
#	Then I see Emp has been added 
#	
#Scenario Outline: Add New Emp 
#	When I add "<FirstName>" and "<LastName>" 
#	And I click Save 
#	Then I see Emp with "<FirstName>" and "<LastName>" 
#	
#	
#	Examples: 
#		|FirstName|LastName|
#		|Diana |Hasanova|
#		|Liana| Hasanova|
#		