package com.Ecom.automation.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.Ecom.automation.config.Data;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser  {
	
	
	public static WebDriver startBrowser() {
		
		String browser = Data.browser.toLowerCase();
		switch(browser) {
		
		case "chrome" : 
			             WebDriverManager.chromedriver().setup();
			              Base.driver = new ChromeDriver();
			             return Base.driver;
		case "firefox" : 
						WebDriverManager.firefoxdriver().setup();
						Base.driver  = new FirefoxDriver();
						return Base.driver;
		case "safari" :
						WebDriverManager.safaridriver().setup();
						Base.driver  = new SafariDriver();
						return Base.driver;
		case "edge" : 
			    		WebDriverManager.edgedriver().setup();
			    		Base.driver  = new EdgeDriver();
			    		return Base.driver;
		default : 
						WebDriverManager.chromedriver().setup();
						Base.driver = new ChromeDriver();
						return Base.driver;
		}
		
	}
	public static void maximize() {
		Base.driver.manage().window().maximize();
	}
	public static void navigateToWebsite() {
		
		 Base.driver.get(Data.url);
		 System.out.println("Navigated to website - "+ Data.url);
	}
	
	

}
