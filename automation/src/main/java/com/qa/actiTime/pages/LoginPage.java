package com.qa.actiTime.pages;

import java.net.PasswordAuthentication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.actiTime.TestBase.TestBase;

public class LoginPage extends TestBase {
	@FindBy(xpath="//input[@id='username']")
	WebElement username;

	@FindBy(xpath="//input[contains(@placeholder,'Password')]")
	WebElement password;
	
	@FindBy(xpath="//a[@id='loginButton']//div[contains(text(),'Login')]")
	WebElement loginButton;
	
	@FindBy(xpath="//div[contains(@class,'atLogoImg')]")
	WebElement logoImage;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateActTimeLogo(){
		 return logoImage.isDisplayed();
		
	}
	
	public HomePage login(String un, String pd){
		username.sendKeys(un);
		password.sendKeys(pd);
		loginButton.click();
		return new HomePage();
	}
}
