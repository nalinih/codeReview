package com.qa.actiTime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.actiTime.TestBase.TestBase;

public class HomePage extends TestBase{
	
	//elemet location
		@FindBy(xpath="//td[contains(text(),'Dhanvi Narumanchi')]")
		WebElement pofileName;
		
		@FindBy(xpath="//div[contains(text(),'TIME-TRACK')]")
		WebElement timeTrackerLink;
		
		@FindBy(xpath="//div[contains(text(),'REPORTS')]")
		WebElement reportsLink;
		
		@FindBy(xpath="//div[contains(text(),'USERS')]")
		WebElement usersLink;
		
		//initialization
		//creating Construtor
		public HomePage(){
			PageFactory.initElements(driver, this);
		}
		
		
		///Actions
		public String verifyHomePageTitle(){
			return driver.getTitle();
			}
		
		public ProfilePage clickProfileLink(){
			pofileName.click();
			return new ProfilePage();
		}
		
		public void clickTimeTrackerLink(){
			timeTrackerLink.click();
			
		}
		public Reports clickReportsLink(){
			reportsLink.click();
			return new Reports();
		}
		public userPage clickUserLink(){
			usersLink.click();
			return new userPage();
		}

}
