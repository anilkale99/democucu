Feature: Registration page with data driven
As a new user, I want to enter firstname and lastname as a parameter

Scenario Outline: validate Registration Scenario1
Given the user is on registration Page
When he enters "<firstname>" as user name
And he enters "<lastname>" as user last name
Then check username is present in textbox

Examples:
		| firstname 		| lastname |
    | Tom  					| Jerry 	 |
    | Loren 				| Hardy    |