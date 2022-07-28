Feature: Application Login 

@Loginpagefunction

Scenario Outline: Homepage default login

Given User is on fusion login page 
When user login into the application by following details 
|ggaurav@sekuremerchants.com|Q@SPuzybQXD|
Then homepage is populated      



