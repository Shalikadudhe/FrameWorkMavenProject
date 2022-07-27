package com.irris22a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.irris22a.keyword.UIKeyword;

public class HomePage {

	// using PageFactory
	/*
	 * @FindBy(xpath = "(//a[@href='/shop/men'])[1]") public WebElement men_menu;
	 * 
	 * @FindBy(xpath = "//a[contains(text(),'Topwear')]") public WebElement
	 * menu_Topwear;
	 * 
	 * @FindBy(xpath=
	 * "(//li[@class='desktop-oddColumnContent'])[1]/descendant::a[contains(text(),'Casual')]")
	 * public WebElement casualTShirt;
	 * 
	 * 
	 * public HomePage() { PageFactory.initElements(UIKeyword.driver, this);
	 * 
	 * }
	 * 
	 * public void hoverOnMenMenu() {
	 * 
	 * UIKeyword.mouseMoveTo(men_menu);
	 * 
	 * }
	 * 
	 * public void clickOnMenTshirt() {
	 * 
	 * UIKeyword.click(menu_Topwear); }
	 * 
	 * public void clickOnCasualTshirts() {
	 * 
	 * UIKeyword.click(casualTShirt);
	 * 
	 * }
	 * 
	 * first way---> Pom (locator and locator specific metnods)
	 */
	public WebElement men_menu;
	public WebElement casualTShirt;
	public WebElement menTShirt;

	public HomePage() {
		men_menu = UIKeyword.driver.findElement(By.xpath("(//a[@href='/shop/men'])[1]"));
		casualTShirt = UIKeyword.driver.findElement(
				By.xpath("(//li[@class='desktop-oddColumnContent'])[1]/descendant::a[contains(text(),'Casual')]"));
		menTShirt = UIKeyword.driver.findElement(By.xpath("//a[@href=\"/men-tshirts\"]"));
	}

	public void hoverOnMenMenu() {

		UIKeyword.mouseMoveTo(men_menu);
	}

	public void clickOnMenTshirt() {

		UIKeyword.click(menTShirt);
	}

	public void clickOnCasualTshirts() {
		UIKeyword.click(casualTShirt);
	}

}
