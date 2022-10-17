Feature: Place Order

		Scenario: Place order after login
			  Given navigate to Website
  		  And click on login
  		  When user enter the email as "TestEmail01@data.com" and password as "TestP@ssw0rd" and click on login
  	 	  Then user should successfully logged in
  	 	  And click on product link
				When user move the mouse over first product and add to cart
			  And click on continue shopping button
			  And click on view cart button
			  And click Proceed to checkout
			  And click on place order
			  And enter payment details Name, Card Number, CVC, Expiration date
			  And click pay and order button
			  Then user should successfully place the order
			  And "Congratulations! Your order has been confirmed!" message should appear
			  
			
