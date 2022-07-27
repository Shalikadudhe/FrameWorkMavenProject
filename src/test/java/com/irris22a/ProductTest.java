package com.irris22a;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.irris22a.config.TestBase;
import com.irris22a.keyword.UIKeyword;
import com.irris22a.pages.CasualShirtsPage;
import com.irris22a.pages.HomePage;
import com.irris22a.util.EnvironmentUtil;
import com.irris22a.util.PropUtil;
import com.irris22a.util.WaitFor;

public class ProductTest extends TestBase {

	EnvironmentUtil env = new EnvironmentUtil();

	@Test
	public void verifySearchResultPollomen() {

		PropUtil repo = new PropUtil();

		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.enterText(repo.getLocator("search_products_txtBox")[0],repo.getLocator("search_products_txtBox")[1], "polo men");
		UIKeyword.hitButton(KeyEvent.VK_ENTER);
		List<String> ProductTitles = UIKeyword.getTexts(repo.getLocator("product_titles_txt")[0],repo.getLocator("product_titles_txt")[1]);
		for (String productTitle : ProductTitles) {
		
			Assert.assertTrue(productTitle.contains("polo men"),
					"Product Tiles doesn't contains polo :" + productTitle);
		}

	}

	@Test
	public void verifyCategoryListForTopwear() {

		List<String> expected = new ArrayList<String>();
		expected.add("Tshirts(82018)");
		expected.add("Shirts(71014)");
		expected.add("Kurtas(13198)");
		expected.add("Sweatshirts(12789)");
		expected.add("Jackets(10315)");
		expected.add("Sweaters(5747)");
		expected.add("Blazers(3282)");

		PropUtil repo = new PropUtil();

		UIKeyword.launchUrl(env.getappUrl());
		UIKeyword.mouseMoveTo(repo.getLocator("men_menu")[0],repo.getLocator("men_menu")[1]);
		UIKeyword.click(repo.getLocator("menu_Topwear")[0],repo.getLocator("menu_Topwear")[1]);
		WaitFor.ElementToPresent(repo.getLocator("categories_text")[0],repo.getLocator("categories_text")[1]);
	

		List<String> Actualcategories = UIKeyword.getTexts(repo.getLocator("categories_text")[0],repo.getLocator("categories_text")[1]);
		for (int i = 0; i < Actualcategories.size(); i++) {

			Actualcategories.set(i, Actualcategories.get(i).split("(")[0]);

		}
		Assert.assertTrue(Actualcategories.containsAll(expected),
				"List didn't match : expected " + expected + "\n Actual : " + Actualcategories);
	}
	@Test
	public void verifyItemCountCasualShirt() {

		UIKeyword.launchUrl(env.getappUrl());
		HomePage home=new HomePage();
		home.hoverOnMenMenu();
		home.clickOnCasualTshirts();
		CasualShirtsPage casual=new CasualShirtsPage();
		int itemcount=casual.getItemCount();
		System.out.println(itemcount);
	}

}
