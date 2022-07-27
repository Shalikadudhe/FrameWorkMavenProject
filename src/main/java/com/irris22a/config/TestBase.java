package com.irris22a.config;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.irris22a.keyword.UIKeyword;

public class TestBase {
	@Parameters("Browser-name")
	@BeforeMethod
	public void setUp(@Optional ("Chrome") String browserNm) throws Exception {
	  
		if((browserNm.isEmpty())||(browserNm.equals("null"))) {
			browserNm="Chrome";
			System.out.println("Setting default browser as Chrome ");
		}
		
		
		UIKeyword.openBrowser(browserNm);
	}
	
	
	@AfterMethod
	public void tearDown() {

		UIKeyword.closeBrowser();
	}

}
