package com.qa.actiTime.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.actiTime.TestBase.TestBase;
import com.qa.actiTime.pages.HomePage;
import com.qa.actiTime.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUP(){
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageValidation(){
		String titl = loginPage.validatePageTitle();
		Assert.assertEquals(titl, "actiTIME - Login");
	}
	@Test(priority=2)
	public void actimeLogoValidation(){
		boolean logo = loginPage.validateActTimeLogo();
		Assert.assertTrue(logo);
		}
	
	@Test(priority=3)
	public void loginTest(){
	homePage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
