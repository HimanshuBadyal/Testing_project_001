package com.page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import com.utility.BrowserFactory;

public class base_class {
public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = BrowserFactory.startApplication(driver,"Chrome", "https://artoftesting.com/samplesiteforselenium");
	}
	
	@AfterMethod
	public void teardown() {
		BrowserFactory.quitBrowser(driver);
		
	}
}
