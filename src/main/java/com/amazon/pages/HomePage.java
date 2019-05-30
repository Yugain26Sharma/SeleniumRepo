package com.amazon.pages;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthStyle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//input[@id=\"twotabsearchtextbox\"]")
	WebElement searchBox;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement signInLink,accountList;
	
	@FindBy(xpath="//a[@id='nav-link-shopall']")
	WebElement department;
	
	Actions action = new Actions(driver);
	
	public HomePage() {
		PageFactory.initElements(driver, this);		
	}
	
	//click on sign-in link
	public SignInPage clickSignIn() {
		signInLink.click();
		return new SignInPage();
	}
	
	public void selectDepartment() throws InterruptedException {
		action.moveToElement(department).build().perform();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Electronics")).click();
		
	}	
	
	public void performSearch() throws InterruptedException {
		searchBox.sendKeys("macbook pro");
		driver.findElement(By.xpath("//div[@id='issDiv2']")).click();			
	}	
	
	public void accountDetails() {
		action.moveToElement(accountList).build().perform();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Shopping List")).click();
	}
		
	
}
	