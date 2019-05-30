package com.amazon.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.TestBase;

public class HeadphoneInfoPage extends TestBase {

	// Page Factory -- OR
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement addToCartButton;

	public HeadphoneInfoPage() {
	PageFactory.initElements(driver, this);

	}

	public void addToCart() throws InterruptedException {		
		addToCartButton.click();	
		System.out.println("yugain");
		try{			
		driver.findElement(By.id("attach-close_sideSheet-link")).isDisplayed();		
		driver.findElement(By.id("attach-close_sideSheet-link")).click();			
		}
		catch(Exception e){	
			System.out.println("close button not present");
		}
	}

}
