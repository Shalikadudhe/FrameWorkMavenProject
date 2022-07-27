package com.irris22a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.irris22a.keyword.UIKeyword;
import com.irris22a.util.WaitFor;

public class MenTShirtPage {

	public WebElement sortByFilter;
	public WebElement countryOfOrigin;

	public WebElement casualTShirt;
	public WebElement popularityFilter, WhatsNewFilter, BetterDiscountFilter;

	public MenTShirtPage() {

		sortByFilter = UIKeyword.driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
		// countryOfOrigin = UIKeyword.driver.findElement(By.xpath(""));

		// casualTShirt = UIKeyword.driver.findElement(
		// By.xpath("(//li[@class='desktop-oddColumnContent'])[1]/descendant::a[contains(text(),'Casual')]"));

		popularityFilter = UIKeyword.driver.findElement(By.xpath("//ul[@class='sort-list']/li[2]/label/input"));
		//ul[@class='sort-list']/li[2]/label[@class='sort-label ']/input
		// WhatsNewFilter =
		// UIKeyword.driver.findElement(By.xpath("//label[@class='sort-label
		// sort-selected']/input"));
		// BetterDiscountFilter =
		// UIKeyword.driver.findElement(By.xpath("(//label[@class='sort-label
		// ']/input)[2]"));
	}

	public void clickOnSortByFilter() {
		sortByFilter.click();
	}

	public void clickOnCasualTshirts() {
		UIKeyword.click(casualTShirt);

	}

	public void selectPopularityFilter() {
	//	UIKeyword.mouseMoveTo(sortByFilter);
	//	WaitFor.time(4);
		UIKeyword.clickON(popularityFilter);
	}

	public void selectWhatsNewFilter() {
		UIKeyword.click(WhatsNewFilter);
	}

	public void selectBetterDiscountFilter() {

		UIKeyword.click(BetterDiscountFilter);
	}

}
