package com.Ecom.automation.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ecom.automation.base.Base;
import com.Ecom.automation.config.Data;
import com.google.common.base.Verify;

public class AccountPage {
	
	public AccountPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(xpath="//h2/b")
	private WebElement accountCreationText;
	
	@FindBy(xpath="//div[@class='login-form']")
	private WebElement login_form;
	
	String actual_text;
	public String getText() {
		 actual_text = accountCreationText.getText();
		return actual_text;
	}
	public void verify_accountIsCreated() {
		
		String error_msg = "validation failed - error in account creation";
		
		Verify.verify(true, error_msg, getText().contains(Data.text));
	}
	

	public String validatePage() {
		String loginText = 	login_form.getText();
		return loginText;
	}
	

}
