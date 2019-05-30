package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.TestBase;

public class ElectronicsPage extends TestBase {
	
	@FindBy(xpath="//span[contains(text(),'HEADPHONES')]")
	WebElement headphoneLink;

	public ElectronicsPage() {
		PageFactory.initElements(driver, this);		
	}
	
	//Select electronic category
	public HeadphonesPage selectCategory() throws InterruptedException {
		headphoneLink.click();
		return new HeadphonesPage();
	}
}
