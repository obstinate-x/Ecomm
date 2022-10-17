package com.Ecom.automation.stepDefinition;


import com.Ecom.automation.pages.ContactusPage;
import com.Ecom.automation.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactusStepDefinition {
	
	HomePage homepage = new HomePage();
	ContactusPage contactus = new ContactusPage();


	@Given("click on Contact us")
	public void click_on_contact_us() {
		homepage.click_on_contact_us_form();	   
	}

	@When("user enter {string} , {string}, {string} and {string}")
	public void user_enter_and(String name, String email, String subject, String message) {	
		contactus.enter_Name(name);
		contactus.enter_email(email);
		contactus.enter_subject(subject);
		contactus.enter_message(message);   
	}
	
	@When("upload file in the given field")
	public void upload_file_in_the_given_field() {	
		contactus.upload_file();			
	}

	@When("click on submit")
	public void click_on_submit() {	
		contactus.submit_the_form();
		contactus.accept_alert();
	}

	@Then("user should successfully able to see {string} text")
	public void user_should_successfully_able_to_see_text(String string) {
		ContactusPage contactus = new ContactusPage();
	    contactus.validating_Form_Submission();
	}


}
