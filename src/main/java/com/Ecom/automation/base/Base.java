package com.Ecom.automation.base;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Base {
	
	public static  WebDriver driver;
	
	
	public static void takeScreenshot() throws IOException {
		
		File srcFile = ((TakesScreenshot)Base.driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcFile, new File("target\\screenshot.png"));
	}

}
