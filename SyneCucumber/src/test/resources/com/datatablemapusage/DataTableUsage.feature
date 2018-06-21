Feature: Registration page with data table
As a new user, I want to enter firstname and lastname as a parameter

Scenario: validate Registration Scenario1
Given the user is on registration Page
When he enters following data
	| Labels                 | Params              | Params1  	|
	| First Name             | Anil                |  A				  |
	| Last Name              | Kale                |	B					|
	| email Address    			 | email 				   		 |	C					|
Then check signup should
