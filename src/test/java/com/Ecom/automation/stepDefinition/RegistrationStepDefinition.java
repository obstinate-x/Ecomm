package com.Ecom.automation.stepDefinition;

import java.util.Map;

import com.Ecom.automation.base.Browser;

import com.Ecom.automation.pages.AccountPage;
import com.Ecom.automation.pages.HomePage;
import com.Ecom.automation.pages.RegisterPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStepDefinition {
	
	HomePage homepage = new HomePage();
	RegisterPage registerpage = new RegisterPage();
	 AccountPage accountpage = new AccountPage();
		static Map<String, String> map;



	@And("click on signup button")
	public void click_on_signup_button() {
		homepage.click_on_signup_and_login();		
	}

	@When("user fill all the details and click on create account button")
	public void user_fill_all_the_details_and_click_on_create_account_button(DataTable datatable) {
		
		Map<String, String> map = datatable.asMap(String.class, String.class);
				
		registerpage.enter_Name(map.get("Name"));
		registerpage.enter_Email(map.get("Email"));
		
		registerpage.click_on_signup();
		registerpage.select_title_as_MR();
		registerpage.enter_Password();
		registerpage.select_Date();
		registerpage.select_Month();
		registerpage.select_Year();
		registerpage.select_newsLetterCheckbox();
		registerpage.enter_FirstName();
		registerpage.enter_LastName();
		registerpage.enter_Address();
		registerpage.select_Country();
		registerpage.enter_state();
		registerpage.enter_city();
		registerpage.enter_zipcode();
		registerpage.enter_mobileNumber();
		registerpage.click_on_Create_Account();		
	}

	@Then("user should successfully registerd")
	public void user_should_successfully_registerd() {	
	   accountpage.verify_accountIsCreated();
	}
	
	
	@When("user enter name and existing email")
	public void user_enter_name_and_existing_email() {
		registerpage.enter_Name(map.get("Name"));
		registerpage.enter_Email(map.get("Email"));
		registerpage.click_on_signup();	
	}
	
	@Then("user should see {string} text")
	public void user_should_see_text(String text) {	
		registerpage.verif_Error(text);	
		}
}
