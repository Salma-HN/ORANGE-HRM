#Author: Proservice

Feature: orangeHRM login page
Scenario: login with valid credentials
Given admin is on login page
When admin enter correct username "Admin" and correct password "admin123"
Then admin is directed to the home page that contains message "Dashboard"

Scenario: login with invalid credentials
Given admin is on login page
When admin enter correct username "Admin" and wrong password "Test.test"
Then admin still on login page that contains message "invalid credentials"