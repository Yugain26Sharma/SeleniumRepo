package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.TestBase;

public class ShoppingList extends TestBase{
	
	@FindBy(xpath="//img[@alt='Send list to others']")
	WebElement shareListImage;
	
	@FindBy(xpath="//input[@name='invite-view-only-button']")
	WebElement viewOnlyLink;
	
	public ShoppingList() {
		PageFactory.initElements(driver, this);		
	}
	
	public void shareShoppingList() {
		shareListImage.click();
		viewOnlyLink.click();
	
	}
}
