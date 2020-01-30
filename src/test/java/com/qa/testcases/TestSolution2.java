package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.base.TestBase;
import com.amazon.pages.ElectronicsPage;
import com.amazon.pages.HeadphoneInfoPage;
import com.amazon.pages.HeadphonesPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.ShoppingList;
import com.amazon.pages.SignInPage;
//yug
public class TestSolution2 extends TestBase {
	
	SignInPage signinPage;
	HomePage homePage;
	ElectronicsPage electronicsPage;
	HeadphonesPage headphonesPage;
	HeadphoneInfoPage headphoneInfoPage;
	ShoppingList shoppingList;
	
	public TestSolution2() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		homePage = new HomePage();
		signinPage = new SignInPage();
		electronicsPage = new ElectronicsPage();
		headphonesPage = new HeadphonesPage();
		headphoneInfoPage = new HeadphoneInfoPage();
		homePage.clickSignIn();
		signinPage.signIn();
		shoppingList = new ShoppingList();

	}
	
	@Test
	public void signInTest() throws InterruptedException {
		homePage.selectDepartment();
		electronicsPage.selectCategory();
		headphonesPage.selectHeadphone();
		headphoneInfoPage.addToCart();
		homePage.performSearch();
		homePage.accountDetails();
		shoppingList.shareShoppingList();
	}
	public void tearDown1() {
		driver.quit();
	}
   @AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
