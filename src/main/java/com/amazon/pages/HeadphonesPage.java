package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.TestBase;

public class HeadphonesPage extends TestBase{
	
	//Page Factory -- OR	
	@FindBy(xpath="//div[@data-index='0']//img//ancestor::a")
	WebElement headphoneName;
	
	public HeadphonesPage(){
		PageFactory.initElements(driver, this);
	}
	
	public HeadphoneInfoPage selectHeadphone() throws InterruptedException {
		headphoneName.click();
		return new HeadphoneInfoPage();
	}

}
