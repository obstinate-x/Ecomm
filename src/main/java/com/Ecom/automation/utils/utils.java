package com.Ecom.automation.utils;

import java.util.List;
import org.openqa.selenium.WebElement;

public class utils {
	
	

	public static void click_on(List<WebElement> element, String text) {
		
		//element.stream().filter(s->s.getText().contains(text)).forEach(s->s.click());		

	for(int i=0; i<element.size(); i++) {			
			if(element.get(i).getText().contains(text)) {
				element.get(i).click();
				break;
			}}}
		
		
	public static int string_to_integer(String text) {
		String[] splittedtext = text.split(" ");
		String retrieveText = splittedtext[1];
		Integer integer = Integer.parseInt(retrieveText);
		
		return integer;				
	}
	
	 
	
	

	
}
