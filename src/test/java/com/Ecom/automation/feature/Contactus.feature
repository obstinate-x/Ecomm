Feature:  Conatact Us form.

			Scenario: Validating conatct us with valid input
						Given navigate to Website
						And click on Contact us 
						When user enter "name" , "email@you.com", "subject" and "message"
						And  upload file in the given field
						And click on submit
						Then user should successfully able to see "your message submitted" text
