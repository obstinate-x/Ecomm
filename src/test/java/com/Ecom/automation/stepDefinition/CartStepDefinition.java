package com.Ecom.automation.stepDefinition;

import org.junit.Assert;

import com.Ecom.automation.pages.Cart;
import com.Ecom.automation.pages.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CartStepDefinition {
	
	
	
	ProductPage productpage = new ProductPage();
		Cart cart = new Cart();
	
	
	@When("user move the mouse over first product and add to cart")
	public void user_move_the_mouse_over_first_product_and_add_to_cart() {
		productpage.addFirstProductToTheCart();
	}

	@When("click on continue shopping button")
	public void click_on_continue_shopping_button() {
		productpage.click_on_continue_shopping();
	}

	@When("move mouse over second product and add to cart")
	public void move_mouse_over_second_product_and_add_to_cart() {
		productpage.addSecondProductToTheCart();
	}

	@When("click on view cart button")
	public void click_on_view_cart_button() {
		productpage.click_on_view_cart();  
	}
	@Then("user should see {string} the product in the cart")
	private void user_should_see_the_product_in_the_cart(String number) {
		Assert.assertEquals(number, cart.noOf_Product());
	}
	



}
