package com.Ecom.automation.stepDefinition;

import org.junit.Assert;

import com.Ecom.automation.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDefinition {
	
	HomePage homepage = new HomePage();
	
	@Given("scroll to the bottom")
	public void scroll_to_the_bottom() {
	    homepage.scroll_to_footer();  
	}

	@When("user enter email {string} and click on arrow")
	public void user_enter_email_and_click_on_arrow(String email) {
	    homepage.enter_email(email);
	    homepage.Click_on_arrow();
	   
	}

	@Then("user should see {string} message")
	public void user_should_see_message(String text) {
	   Assert.assertTrue(homepage.successfully_subscribe_message().contains(text));
		
	}

}
