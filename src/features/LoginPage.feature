Feature: login page feature

Scenario: login page title verification
Given user is application home page
And user is navigated to login page
When user get the login page title
Then login page title should be "Welcome,Please Sign in!"

Scenario: verify login button
Given user is on the application home page
And user navigated to login page
Then login button should present on the page

Scenario: verify register button
Given user is on the application home page
And navigated to login page
Then register button should present on the page