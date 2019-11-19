package com.qa.actiTime.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.qa.actiTime.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		try{
			
		prop = new Properties();
		FileInputStream fs = new FileInputStream(System.getProperty("C:\\Users\\user\\workspace\\automation\\src\\main\\java\\com\\qa\\actiTime\\config\\config.properties"));
		prop.load(fs);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

	public static void initialization(){
		String browserName = prop.getProperty("browser");
		if(browserName.equals("ff")){
			System.setProperty("webdriver.gecko.driver", "E:\\Java Selenium\\Drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
		}else if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\Java Selenium\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		}else if(browserName.equals("ie")){
			System.setProperty("webdriver.ie.driver", "E:\\Java Selenium\\Drivers\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
