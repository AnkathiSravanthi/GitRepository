package com.QA.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
	@FindBy (xpath="//input[@name='uid']")
	public
	WebElement UserName;
	
	@FindBy (xpath="//input[@name='password']z")
	WebElement Password;
	
	@FindBy (xpath="//input[@name='btnLogin']")
	WebElement loginButton;
	
}
