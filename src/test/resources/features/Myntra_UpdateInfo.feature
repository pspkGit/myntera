Feature: 

Scenario: Edit own account information

Given User opens browser and Navigated to login page
When user provided "saipavan@yopmail.com" and  "Sai@1234"
And clicks on Login button
And clicks on edit account information
And update "First Name" and "Telephone" fields
Then information should be updated