package com.Ecom.automation.stepDefinition;

import org.junit.Assert;

import com.Ecom.automation.base.Browser;
import com.Ecom.automation.pages.AccountPage;
import com.Ecom.automation.pages.HomePage;
import com.Ecom.automation.pages.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDifinition {
	
	HomePage homepage = new HomePage();
	RegisterPage login = new RegisterPage();
	AccountPage accountpage = new AccountPage();
	
	@Given("navigate to Website")
	public void naviagte_to_website() {
		Browser.navigateToWebsite();
	}

	@Given("click on login")
	public void click_on_login() {
		homepage.click_on_signup_and_login();
	}

	@When("user enter the email as {string} and password as {string} and click on login")
	public void user_enter_the_email_as_and_password_as(String email , String password) {	
	   login.enter_loginEmail(email);
	   login.enter_loginPassword(password);
	   login.click_on_login_button();
	}

	@Then("user should successfully logged in")
	public void user_should_successfully_logged_in() {
		homepage.verify_Loggedin();   
	}
	
	@Then("user should not able to logged in")
	public void user_should_not_able_to_logged_in() {
		login.verif_Error("incorrect");
	}
	
	 @When("user click on logout")
	 public void user_click_on_logout() {
		 homepage.click_on_logout();	 
	 }
	 
	 @Then("user should navigated to login page")
	 public void user_should_navigated_to_login_page() {
		Assert.assertEquals(accountpage.validatePage(), "login");
		 
	 }
	


}
