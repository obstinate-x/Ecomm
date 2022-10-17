package com.Ecom.automation.stepDefinition;

import com.Ecom.automation.pages.HomePage;
import com.Ecom.automation.pages.ProductDetailPage;
import com.Ecom.automation.pages.ProductPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDefinition {
	
	 ProductPage product = new ProductPage();
	 ProductDetailPage pdp = new ProductDetailPage();
	
	@When("click on product link")
	public void click_on_product_link() {
	   HomePage homepage = new HomePage();
	   homepage.click_on_products();
	}

	@Then("user should successfully land on product page")
	public void user_should_successfully_land_on_product_page() {
		
		product.verify_product_visibiity();
	    
	}
	
	  @When("user click on view product for any product")
	    public void user_click_on_view_product_for_any_product()  {
		  
		  product.click_on_view_product();
	    }

	    @Then("user should see the details name, category, price, availability, condition, brand")
	    public void user_should_see_the_details_name_category_price_availability_condition_brand() {
	    	
	    	
	    	pdp.get_productName();
	    	pdp.get_category();
	    	pdp.get_price();
	    	pdp.get_availabilty();
	    	pdp.get_condition();
	    	pdp.get_brand();     
	    }
	    @When("user search {string} on the search bar")
	    public void user_search_on_the_search_bar(String text) {
	    	product.enter_SearchField(text);
	    	product.click_searchButton();
	    	       
	    }

	    @Then("user should see the product related to shirt.")
	    public void user_should_see_the_product_related_to_shirt() {
	    	product.Verifying_searched_result();
	    	
	    	
	       
	    }


}
