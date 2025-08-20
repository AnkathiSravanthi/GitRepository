Feature: User login
registered User should be able to login.
Scenario:Login in with valid cerentials
Given User navigate  to login page
When User enters valid email address "ankatisravs@gmail.com"
And enter valid password "9052044255"
And click submit button
Then usr should login Successfully