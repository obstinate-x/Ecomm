	Feature: Registration

  Scenario: Verify registration with vaild input
  			Given navigate to Website
  			And click on signup button
  			When user fill all the details and click on create account button
  			|Name          |Test	Name					|
  			|Email         |Testemail@data.com	|
  			|Password      |TestP@ssw0rd				|
  			|FirstName     |TestFirstName	   		|
  			|LastName      |TestLastname				|
  			|Address       |TestAddress00				|
  			|State 		 	 	 |TestState						|
  			|City          |testCity						|
  			|ZipCode			 |70008								|
  			|Mobile Number |9000000546					|
  			
  			Then user should successfully registerd
  		
	Scenario: Verify registration with existing email
				Given navigate to Website
  			And click on signup button
  			When user enter name and existing email
  			Then user should see "Email Address already exist!" text
  			