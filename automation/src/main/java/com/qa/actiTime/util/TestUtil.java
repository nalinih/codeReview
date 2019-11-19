package com.qa.actiTime.util;

import com.qa.actiTime.TestBase.TestBase;

public class TestUtil extends TestBase {
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT =20;
	
	public void switchTOFrame(){
		driver.switchTo().frame("mainpanel");
		
	}

}
