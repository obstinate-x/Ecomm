package com.Ecom.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ecom.automation.base.Base;
import com.Ecom.automation.utils.Element;
import com.Ecom.automation.utils.Waits;
import com.google.common.base.Verify;

public class ContactusPage extends Base {
	
	public ContactusPage() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement input_name;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement input_email;
	
	@FindBy(xpath="//input[@name='subject']")
	private WebElement input_subject;
	
	@FindBy(id="message")
	private WebElement input_textArea;
	
	@FindBy(xpath="//input[@type='file']")
	private WebElement input_file;
	
	@FindBy(xpath="//input[@data-qa='submit-button']")
	private WebElement submit_button;
	
	@FindBy(xpath="//div[@class='status alert alert-success']")
	private WebElement validating_Text;
	
	
	public void enter_Name(String name) {
		Waits.waitTillElementPresentForClicking(input_name);
		input_name.sendKeys(name);		
	}
	public void enter_email(String email) {
		input_email.sendKeys(email);
	}
	public void enter_subject(String subject) {
		input_subject.sendKeys(subject);
	}
	public void enter_message(String message) {
		input_textArea.sendKeys(message);
	}
	public void upload_file() {
		
		input_file.sendKeys("C:\\Users\\avish\\Downloads\\Dekhsale.jpg");
		
		
	}
	public void submit_the_form() {
		Waits.waitTillElementPresentForClicking(submit_button);
		submit_button.click();		
	}
	public void accept_alert() {
		Element.AcceptAlert();
	}
	public void validating_Form_Submission() {
		Waits.waitTillElementVisisble(validating_Text);
		String actual_Text = validating_Text.getText();
		
		Verify.verify(true, "Validation Failed", actual_Text.contains("String"));
		
	}
	
	
	
	
	
	
	

}
