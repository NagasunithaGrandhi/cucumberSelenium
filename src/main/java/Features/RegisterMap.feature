Feature: Cheking the Registration using map 

Scenario: Test Registration using Map 

	
	
	Given  user is already on home  page
	When  Title of home Page is Nridesicharms 
	Then  Click on Register button 
	And   user enters registration details 
		|FirstName|LastName|Email           | password |Re-password|
		|Rani5    |guntur1 |rp99@gmail.com  |Runitha@1|Runitha@1|
		|Rani7    |guntur2 |rn10@gmail.com |Runitha@1|Runitha@1|
		|Rani9   |guntur3 |ra91@gmail.com |Runitha@1|Runitha@1|
		Then  close the Browser