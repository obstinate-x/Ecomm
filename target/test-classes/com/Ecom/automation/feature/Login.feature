Feature: Login/logout Functionality

		@login
  Scenario: Login with correct email and password
    Given navigate to Website
    And click on login
    When user enter the email as "TestEmail01@data.com" and password as "TestP@ssw0rd" and click on login
    Then user should successfully logged in

   @login
  Scenario: Login with incorrect email and password
    Given navigate to Website
    And click on login
    When user enter the email as "TestEmail@you.com" and password as "TestPassword" and click on login
    Then user should not able to logged in
 	
 	@logout
  Scenario: Logout user
    Given navigate to Website
    And click on login
    And user enter the email as "TestEmail01@data.com" and password as "TestP@ssw0rd" and click on login
    When user click on logout
    Then user should navigated to login page
