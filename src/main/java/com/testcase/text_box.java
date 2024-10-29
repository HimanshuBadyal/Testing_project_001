package com.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.page.base_class;

import com.page.textbox;

public class text_box extends base_class{
	
	@Test
	public void entertext() {
	textbox ent = PageFactory.initElements(driver, textbox.class);

	ent.entertext("Himanshu");
	}
}
