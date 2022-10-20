package com.Ecom.automation.utils;




import com.Ecom.automation.base.Base;
import com.Ecom.automation.base.Browser;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	
	@Before
	public static void setupBrowser() {
		
		Browser.startBrowser();
		Browser.maximize();
	}
	
	@After
	public static void closeBrowser() {
		
		Base.driver.quit();
	}
	
}
