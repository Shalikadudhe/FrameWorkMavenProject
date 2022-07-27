package com.irris22a.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.irris22a.keyword.UIKeyword;

public class WomenKurtaKurtiSuitPage {

	@FindBy(xpath = "(//a[@href='/shop/women'])[1]")
	public WebElement women;

	@FindBy(xpath = "//a[@href='/fusion-wear']")
	public WebElement indianFusionwear;

	@FindBy(xpath = "//a[@href='/women-kurtas-kurtis-suits']")
	public WebElement womenKurtaKurtiSuit;
	
	@FindBy(xpath="(//div[@class='sort-sortBy']/span)[1]")
	public WebElement BetterDiscount;

	@FindBy(xpath="//div[@class='sort-sortBy']")
	public WebElement sortFilter;
	
	public WomenKurtaKurtiSuitPage() {

		PageFactory.initElements(UIKeyword.driver, this);
	}

	public void hoverOnWomen() {

		UIKeyword.mouseMoveTo(women);
	}

	public void clickOnIndianFusionWear() {

		UIKeyword.click(indianFusionwear);
	}

	public void clickOnWomenKurtaKurtiSuit() {
		UIKeyword.click(womenKurtaKurtiSuit);
	}
	
	public void selectFilterByBetterDiscount() {
    
		 UIKeyword.click(sortFilter);
		 UIKeyword.click(BetterDiscount);
	}

}
