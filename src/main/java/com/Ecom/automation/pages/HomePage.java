package com.Ecom.automation.pages;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Ecom.automation.base.Base;
import com.Ecom.automation.config.Data;
import com.Ecom.automation.utils.Waits;
import com.Ecom.automation.utils.utils;
import com.google.common.base.Verify;


public class HomePage {
		
	public HomePage() {	
		PageFactory.initElements(Base.driver, this);
	}
	
	   JavascriptExecutor js = (JavascriptExecutor)Base.driver;
	   
	   
	@FindBy(xpath="//ul//li")
    private List<WebElement> element;
	
	@FindBy(xpath="//ul//li//a/b")
	private WebElement username;
	
	@FindBy(id="susbscribe_email")
	private WebElement subscription;
	
	@FindBy(id="success-subscribe")
	private WebElement message;
	
	@FindBy(id="subscribe")
	private WebElement arrow_button;
	
	@FindBy(className="btn btn-success close-modal btn-block")
	private WebElement continue_button;
	
	
	
	public void click_on_signup_and_login(){		
	    utils.click_on(element, "Signup");
	}
	public void click_on_contact_us_form() {
		utils.click_on(element, "Contact");		
	}
	public void click_on_products() {
		utils.click_on(element, "Products");		
	}
	public void click_on_logout() {
		utils.click_on(element, "logout");
	}
	public void verify_Loggedin()  {
	
	Verify.verify(true, "TestFailed", username.getText().equalsIgnoreCase(Data.firstname));
	try {
		Base.takeScreenshot();
	} catch (IOException e) {
		System.out.println("Screenshot error");
	}}
	public void click_on_cart() {
		utils.click_on(element, "Cart");	
	}
	public void scroll_to_footer() {
		js.executeScript("arguments[0].scrollIntoView();", subscription);
	}
	public void enter_email(String email) {
		subscription.sendKeys(email);
	}
	public void Click_on_arrow() {
		arrow_button.click();
	}
	public String successfully_subscribe_message() {
		String text = message.getText();
		try {
			Base.takeScreenshot();
		} catch (IOException e) {
			System.out.println("error due to screenshot class");
		}
		return text;
	}
	  public void click_on_continue_shopping() {
		  Waits.waitTillElementPresentForClicking(continue_button);
		  continue_button.click();	
	
	
}
}
	
	
	
	
