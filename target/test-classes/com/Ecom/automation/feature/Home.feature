Feature: HomePage Functinalitieso

		Scenario: Verify user can suscribe through suscription functioanlity
		Given navigate to Website
		And scroll to the bottom
		When user enter email "TestEmail01@data.com" and click on arrow
		Then user should see "successfully subscribed" message
