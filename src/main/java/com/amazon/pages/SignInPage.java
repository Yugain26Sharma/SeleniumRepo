package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.TestBase;

public class SignInPage extends TestBase{
	
	//Page Factory -- OR
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement signInButton;
	
	
	public SignInPage(){
		PageFactory.initElements(driver, this);
	}
	
	// submit the sign-in form
	public void signIn() {
		email.sendKeys(prop.getProperty("email"));
		password.sendKeys(prop.getProperty("password"));
		signInButton.click();
		
	}
}
