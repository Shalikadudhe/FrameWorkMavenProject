package com.irris22a;

import org.testng.annotations.Test;

import com.irris22a.config.TestBase;
import com.irris22a.keyword.UIKeyword;
import com.irris22a.pages.WomenKurtaKurtiSuitPage;
import com.irris22a.util.EnvironmentUtil;

public class WomenKurtaKurtiSuitTest extends TestBase{
	
	
	@Test
	public void verifySearchResultForIndianWear() {
		
		EnvironmentUtil env=new EnvironmentUtil();
		
		UIKeyword.launchUrl(env.getappUrl());
		WomenKurtaKurtiSuitPage wk=new WomenKurtaKurtiSuitPage();
		wk.hoverOnWomen();
		wk.clickOnIndianFusionWear();
		wk.clickOnWomenKurtaKurtiSuit();
		wk.selectFilterByBetterDiscount();
		System.out.println("showing better Discount...");

	}

}
