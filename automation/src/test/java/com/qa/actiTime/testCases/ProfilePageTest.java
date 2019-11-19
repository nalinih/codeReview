package com.qa.actiTime.testCases;

import org.testng.annotations.DataProvider;

import com.qa.actiTime.TestBase.TestBase;
import com.qa.actiTime.util.TestUtil;

public class ProfilePageTest extends TestBase{
	
	@DataProvider
	public Object[][]  getActData(){
		Object data [][]= TestUtil.getTestData("Users");
		return data;
	}

}
