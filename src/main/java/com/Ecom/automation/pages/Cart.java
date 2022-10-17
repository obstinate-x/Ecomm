package com.Ecom.automation.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ecom.automation.base.Base;

public class Cart extends Base{
	
	public Cart() {
		PageFactory.initElements(Base.driver, this);
	}
	

	@FindBy(xpath="//tbody//tr")
	private List<WebElement> productselements;
	
	@FindBy(className ="btn btn-default check_out")
	private WebElement procced_to_checkout;
	
	@FindBy(className="btn btn-default check_out")
	private WebElement place_order;
	
	
	
	public int noOf_Product() {
		int actualproducts = productselements.size();
		return actualproducts;	
	}
	
	public void click_on_proceedToCheckout() {
		procced_to_checkout.click();	
	}
	public void click_on_PlaceOrder() {
		place_order.click();
		
	}

}
