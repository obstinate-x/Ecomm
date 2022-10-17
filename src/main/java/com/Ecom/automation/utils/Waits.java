package com.Ecom.automation.utils;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Ecom.automation.base.Base;



public class Waits extends Base{
	
	
	static WebDriverWait wait = new WebDriverWait(Base.driver, Duration.ofSeconds(10));
	
	public static void waitTillElementVisisble(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public static void waitTillAllElementIsVisible(List<WebElement> elements) {
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}
	public static void waitTillElementPresentForClicking(WebElement element) {		 
		wait.until(ExpectedConditions.elementToBeClickable(element));		
	}
	public static void waituntil_AlertisPresent() {	
		wait.until(ExpectedConditions.alertIsPresent());	
	}
	public static void wait_for_Sec(int sec) {	
			Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

	
	

}
