@Important
Feature: Registration page with tags
As a new user, I want to enter firstname and lastname as a parameter

Scenario: validate Registration Scenario1
Given the user is on registration Page
When he enters "David" as user name
And he enters "Rogers" as user last name
Then check username is present in textbox


@smoke
Scenario: validate Registration Scenario1
Given the user is on registration Page
When he enters "David" as user name
And he enters "Rogers" as user last name
Then check username is present in textbox

@Regression
Scenario: validate Registration Scenario1
Given the user is on registration Page
When he enters "David" as user name
And he enters "Rogers" as user last name
Then check username is present in textbox

@smoke @Regression
Scenario: validate Registration Scenario1
Given the user is on registration Page
When he enters "David" as user name
And he enters "Rogers" as user last name
Then check username is present in textbox