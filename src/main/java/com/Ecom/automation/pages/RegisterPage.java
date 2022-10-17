package com.Ecom.automation.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ecom.automation.base.Base;
import com.Ecom.automation.config.Data;
import com.Ecom.automation.utils.Element;
import com.Ecom.automation.utils.Waits;
import com.google.common.base.Verify;

public class RegisterPage {
	
	public RegisterPage() {
		
		PageFactory.initElements(Base.driver, this);

	}
	
	//First Registration page fill up info
	
	@FindBy(xpath="//input[@data-qa='signup-name']")
	private WebElement name;
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	private WebElement email;
	
	@FindBy(xpath="//button[@data-qa='signup-button']")
	private WebElement signup_button;
	
	
	public void enter_Name() {	
		Waits.waitTillElementPresentForClicking(name);
    name.sendKeys(Data.firstname);
	
	}
	public void enter_Email() {	
		//email.sendKeys(Data.email);
		email.sendKeys(Data.loginEmail);
	}
	public void click_on_signup() {	
		signup_button.click();
	}
	
	//Second Registration Page Fill uip info
	
	@FindBy(id="id_gender1")
	private WebElement radio_mr;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="days")
	private WebElement day;
	
	@FindBy(id="months")
	private WebElement month;

	@FindBy(id="years")
	private WebElement year;
	
	@FindBy(id="newsletter")
	private WebElement newsletterCheckbox;
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address1")
	private WebElement address;
	
	@FindBy(id="country")
	private WebElement country;
	
	@FindBy(id="state")
	private WebElement state;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="zipcode")
	private WebElement zipcode;
	
	@FindBy(id="mobile_number")
	private WebElement mobileNumber;
	
	@FindBy(xpath="//button[@data-qa='create-account']")
	private WebElement createAccountButton;
	
	public void select_title_as_MR() {
		radio_mr.click();
	}	
	public void enter_Password() {
		password.sendKeys(Data.password);		
	}
	public void select_Date() {
		Element.selectByValue(day, Data.day);
	}
	public void select_Month() {
		Element.selectByValue(month, Data.month);
	}
	public void select_Year() {
		Element.selectByValue(year, Data.year);
		Waits.waitTillElementPresentForClicking(newsletterCheckbox);
	}
	public void select_newsLetterCheckbox() {
		newsletterCheckbox.click();
	}
	public void enter_FirstName() {
		firstName.sendKeys(Data.firstname);		
	}
	public void enter_LastName() {
		lastName.sendKeys(Data.lastName);		
	}
	public void enter_Address() {
		address.sendKeys(Data.address);		
	}
	public void select_Country() {
		Element.selectByValue(country, Data.country);
	}
	public void enter_state() {
		state.sendKeys(Data.state);
	}
    public void enter_city() {
		city.sendKeys(Data.city);
	}
    public void enter_zipcode() {
    	zipcode.sendKeys(Data.zipCode);
    }
    public void enter_mobileNumber() {
    	mobileNumber.sendKeys(Data.mobileNumber);
    }
    public void click_on_Create_Account() {
    	String print = "create account button not visible";
    	if(createAccountButton.isDisplayed()) {
    	createAccountButton.click();}else {System.out.println(print);
    }  
    }
    
    //Login functionality
    
     @FindBy(xpath="//input[@data-qa='login-email']")
     private WebElement login_email;
     
     @FindBy(xpath="//input[@data-qa='login-password']")
     private WebElement login_password;
    
     @FindBy(xpath="//button[@data-qa='login-button']")
     private WebElement login_button;
     
     public void enter_loginEmail(String email) {
    	 login_email.sendKeys(email);
     }
     public void enter_loginPassword(String password) {
    	 login_password.sendKeys(password);
     }
     public void click_on_login_button() {
    	 login_button.click();
     }
     
     
     //invalid login
     @FindBy(xpath="//p[@style='color: red;']")
     private WebElement error;
     
     public void verif_Error(String text) {
    	Verify.verify(true, "Test Failed", error.getText().equalsIgnoreCase(text));
    	try {
			Base.takeScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
     }
    
    
    
    
}
	

