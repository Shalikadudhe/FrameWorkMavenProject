package com.irris22a;

import org.testng.annotations.Test;

import com.irris22a.config.TestBase;
import com.irris22a.keyword.UIKeyword;
import com.irris22a.pages.HomePage;
import com.irris22a.pages.MenTShirtPage;
import com.irris22a.util.EnvironmentUtil;
import com.irris22a.util.WaitFor;

public class MenTShirtPageTest extends TestBase {

	EnvironmentUtil env = new EnvironmentUtil();

	@Test
	public void verifyIfByPopularityYieldsProperResults() {
		UIKeyword.launchUrl(env.getappUrl());
		HomePage home = new HomePage();
		WaitFor.time(4);
		home.hoverOnMenMenu();
		WaitFor.elementToBeClickable(home.men_menu);

		home.clickOnMenTshirt();
		System.out.println("click on MenMenuTShirt...");
		MenTShirtPage mentshirt = new MenTShirtPage();
		 mentshirt.clickOnSortByFilter();
		WaitFor.time(5);
		 mentshirt.selectPopularityFilter();
		
		System.out.println("Select the Popularity Filter....");
	}

}
