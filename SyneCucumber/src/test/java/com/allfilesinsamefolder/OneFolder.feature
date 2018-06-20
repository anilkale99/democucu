Feature: Registration page33
As a new user, I want to enter firstname and lastname as a parameter

Scenario: validate Registration Scenario1
Given the user is on registration Page
When he enters "David" as user name
And he enters "Rogers" as user last name
Then check username is present in textbox