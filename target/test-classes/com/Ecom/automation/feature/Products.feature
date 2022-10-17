Feature: Validating Product and product details.

			Scenario: Verify the list of product are visible
				Given navigate to Website
				When click on product link
				Then user should successfully land on product page
				
				
				Scenario: Verify product details are visile in product detail page.
					Given navigate to Website
					When click on product link
					Then user should successfully land on product page
					When user click on view product for any product
					Then user should see the details name, category, price, availability, condition, brand
					
					
				Scenario: validate when user search then related product are displayed.
					Given navigate to Website
					And click on product link
					When user search "shirt" on the search bar
					Then user should see the product related to shirt.
