package com.Ecom.automation.stepDefinition;

import com.Ecom.automation.pages.Cart;
import com.Ecom.automation.pages.PaymentPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrderSteoDefinition {
	
	Cart cart = new Cart();
	PaymentPage paymentpage = new PaymentPage();
	
	@When("click Proceed to checkout")
	public void click_proceed_to_checkout() {
	    cart.click_on_proceedToCheckout();
	}

	@When("click on place order")
	public void click_on_place_order() {
	    cart.click_on_PlaceOrder();
	}

	@When("enter payment details Name, Card Number, CVC, Expiration date")
	public void enter_payment_details_name_card_number_cvc_expiration_date() {
	   paymentpage.enter_cardName();
	   paymentpage.enter_CardNumber();
	   paymentpage.enter_CVV();
	   paymentpage.enter_Month();
	   paymentpage.enter_year();
	}

	@When("click pay and order button")
	public void click_pay_and_order_button() {
		paymentpage.click_on_PayAndOrder();
	}

	@Then("user should successfully place the order")
	public void user_should_successfully_place_the_order() {
		paymentpage.orderPlaceText();
	}

	@Then("{string} message should appear")
	public void message_should_appear(String text) {
		paymentpage.compare(text);
	}

}
