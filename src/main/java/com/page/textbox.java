package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class textbox {
	public WebDriver driver;

	public void LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}
	@FindBy(id = "fname")
	WebElement Name;
	
	


public void entertext(String myname) {

	
	
	Name.sendKeys(myname);
	
}
}
