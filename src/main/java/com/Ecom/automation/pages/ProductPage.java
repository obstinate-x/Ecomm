package com.Ecom.automation.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Ecom.automation.base.Base;
import com.Ecom.automation.utils.Element;
import com.Ecom.automation.utils.Waits;
import com.Ecom.automation.utils.utils;


public class ProductPage extends Base {
	
	public ProductPage() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
		@FindBy(xpath="//div[@class='productinfo text-center']")
		private List<WebElement> products;
	
		@FindBy(xpath="//ul/li/a/i[@class='fa fa-plus-square']")
		private List<WebElement> viewproduct;
	
	 	@FindBy(xpath="(//div[@class='single-products'])[1]")
	    private WebElement firstproduct;
	  
	 	@FindBy(xpath="(//a[contains(@class, ' add-to-cart')])[1]")
	 	private WebElement add_to_cart_first_product;
	  
	 	@FindBy(xpath="(//a[contains(@class, ' add-to-cart')])[2]")
	 	private WebElement add_to_cart_second_product;
	  
	 	@FindBy(xpath="(//div[@class='single-products'])[2]")
	 	private WebElement secondProduct;
	  
	 	@FindBy(xpath="//button[contains(@class,' close-modal btn-block')]")
	 	private WebElement continueShoppingButton;
	 	
	 	@FindBy(xpath="//div[@class='modal-content']")
	 	private WebElement modal;
	 	
	 	@FindBy(id="search_product")
	 	private WebElement searchBar;
	 	
	 	@FindBy(id="submit_search")
	 	private WebElement searchButton;
	 	
	 	@FindBy(xpath="//h2[@class='title text-center']")
	 	private WebElement searchedProductText;
	 	
	 	@FindBy(xpath="//u[text()='View Cart']")
	 	private WebElement ViewCart;
	 	
	 	//Initialization
	 	HomePage homepage = new HomePage();
	
	  public void verify_product_visibiity() {
		Assert.assertTrue("Validation failed",products.size()>1);	
	  }
	  public void click_on_view_product() {
		Waits.waitTillElementPresentForClicking(viewproduct.get(0));
		viewproduct.get(0).click();
	  }
	  public void click_on_view_product(String productName) {
		viewproduct.stream().filter(product-> product.getText().equalsIgnoreCase(productName)).forEach(product->product.click());	
	  }
	  public void addFirstProductToTheCart() {
		  Waits.waitTillElementVisisble(firstproduct);
		  Element.move_over_element(firstproduct);	
		  Element.move_over_element(add_to_cart_first_product);
		  Element.click_after_hoverBy();
		  
	  }
	  public void addSecondProductToTheCart() {
		  Waits.waitTillElementVisisble(secondProduct);
		 Element.move_over_element(secondProduct);
		 Element.move_over_element(add_to_cart_second_product);
		 Element.click_after_hoverBy();
		  	  
	  }
	 
	  public void click_on_continue_shopping() {
		  Waits.waitTillElementPresentForClicking(modal);
		  continueShoppingButton.click();	  
	  }
	  public void move_to_second_product() {
		  Element.move_over_element(secondProduct);
	  }
	  public void click_on_cart() {
		homepage.click_on_cart();	
	  }
	  public void enter_SearchField(String text) {
		  searchBar.sendKeys(text);	  
	  }
	  public void click_searchButton(){
		  searchButton.click();
	  }
	  public void Verifying_searched_result() {
		 String text =  searchedProductText.getText();
		 text.contains("searched");
	  }
	  public void click_on_view_cart() {
		  Waits.waitTillElementVisisble(ViewCart);
		  ViewCart.click();
	  }
	  
	  
	
	
	
	

}
