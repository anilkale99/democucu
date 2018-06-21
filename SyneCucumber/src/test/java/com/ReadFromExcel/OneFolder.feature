Feature: Registration page with excel
As a new user, I want to enter firstname and lastname as a parameter

Scenario: validate Registration Scenario1
Given the user is on registration Page
When he enters data from "DataSheet.xlsx" file
Then check username is present in textbox