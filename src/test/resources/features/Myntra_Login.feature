Feature: Login to account


Scenario: Login with credentials

Given User opens browser and Navigated to login page
When user provided "saipavan@yopmail.com" and  "Sai@1234"
And clicks on Login button
Then user should be redirected to Account page


 