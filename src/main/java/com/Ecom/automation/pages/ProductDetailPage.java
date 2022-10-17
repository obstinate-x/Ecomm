package com.Ecom.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ecom.automation.base.Base;
import com.Ecom.automation.utils.Waits;
import com.Ecom.automation.utils.utils;

public class ProductDetailPage extends Base {
	
	public ProductDetailPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
  @FindBy(xpath="div[@class=\"product-information\"]/h2")     
  private WebElement ProductName;
  
  @FindBy(xpath="//p[text()='Category: Women > Tops']")
  private WebElement category;
  
  @FindBy(xpath="//span[text()='Rs. 500']")
  private WebElement price;
  
  @FindBy(xpath="//b[text()='Availability:']")
  private WebElement availability;
  
  @FindBy(xpath="//b[text()='Condition:']")
  private WebElement condition;
  
  @FindBy(xpath="//b[text()='Brand:']")
  private WebElement brand;
  
  
  
  
    public void get_productName() {
    	Waits.waitTillElementVisisble(ProductName);
    	System.out.println(ProductName.getText());
	  
}
  	public void get_category() {
	  System.out.println(category.getText());
}
  	public void get_price() {
	  String text = price.getText();
	 int retreievedPrice =  utils.string_to_integer(text);
	 System.out.println(retreievedPrice);
  		
  		
}
  	public void get_availabilty() {
	  System.out.println(availability.getText());
}
  	public void get_condition() {
	  System.out.println(condition.getText());
}
  	public void get_brand() {
	  System.out.println(brand.getText());
}
  	

  
 

  
	
  
  
	
	
	
}
