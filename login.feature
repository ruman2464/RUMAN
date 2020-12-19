Feature: login validation 

Scenario: valid credintial 

	Given open browser 
	And navigate to url 
	When user type userId i text box 
	And user type password in text box 
	And user click on login button 
	Then user should land his profile page 
	
	
Scenario Outline: invalid credintial 

	Given open browser 
	And navigate to url 
	When user type <"userId"> i text box 
	And user type <"password"> in text box 
	And user click on login button 
	Then user should not be landing his profile page 
	
	Examples: 
		|userId|password|
		|user1|s233|
		|user2|dg45|
