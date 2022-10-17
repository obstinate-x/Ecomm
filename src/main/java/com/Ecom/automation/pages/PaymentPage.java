package com.Ecom.automation.pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Ecom.automation.base.Base;
import com.Ecom.automation.config.Data;

public class PaymentPage extends Base{

	public PaymentPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(name="name_on_card")
	private WebElement cardHolderName_input;
	
	@FindBy(name="card_number")
	private WebElement cardnumber_input;
	
	@FindBy(name="cvc")
	private  WebElement cvv_input;
	
	@FindBy(name="expiry_month")
	private WebElement expire_month;
	
	@FindBy(name="expiry_year")
	private WebElement expire_year;
	
	@FindBy(id="submit")
	private WebElement pay_and_confirm_order;
	
	@FindBy(xpath="//p[contains(@style,'font-size:')]")
	private WebElement text;
	
	static String text0;
	
	public void enter_cardName() {
		cardHolderName_input.sendKeys(Data.nameOnTheCard);
	}
	public void enter_CardNumber() {
		cardHolderName_input.sendKeys(Data.cardNumber);
	}
	public void enter_CVV() {
		cardHolderName_input.sendKeys(Data.cvv);
	}
	public void enter_Month() {
		cardHolderName_input.sendKeys(Data.card_month);
	}
	public void enter_year() {
		cardHolderName_input.sendKeys(Data.card_year);
	}
	public void click_on_PayAndOrder() {
		pay_and_confirm_order.click();
		try {
			Base.takeScreenshot();
		} catch (IOException e) {
			System.out.println("Error due to ScreenShot");
		}
	}
	
	
	
	public void orderPlaceText() {
		  text0 = text.getText();
	}
	public void compare(String text) {
		Assert.assertTrue(text0.equals(text));
	}
	
	
	
	
	

}
