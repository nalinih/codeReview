package com.qa.actiTime.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.actiTime.TestBase.TestBase;
import com.qa.actiTime.pages.HomePage;
import com.qa.actiTime.pages.LoginPage;
import com.qa.actiTime.pages.ProfilePage;

import junit.framework.Assert;

public class HomePageTest extends TestBase {
	 LoginPage loginPage;
	 HomePage homePage;
	 ProfilePage profilePage;	
	 
	public HomePageTest(){
		super();
		}
	
	@BeforeMethod
	public void setUP(){
		initialization();
		loginPage = new LoginPage();
		profilePage = new ProfilePage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test
	public void validateHomePageTitle(){
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "actiTIME -  Task List", "Home Page Title not matched");
	}
	
	@Test
	public void validateclickProfileLink(){
		profilePage =  homePage.clickProfileLink();
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
