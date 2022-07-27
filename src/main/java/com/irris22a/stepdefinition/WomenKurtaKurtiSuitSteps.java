package com.irris22a.stepdefinition;

import com.irris22a.keyword.UIKeyword;
import com.irris22a.pages.WomenKurtaKurtiSuitPage;
import com.irris22a.util.EnvironmentUtil;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WomenKurtaKurtiSuitSteps {

	@Given("open chrome browser")
	public void openBrowser() {

		UIKeyword.openBrowser("Chrome");
	}

	@And("url is launched")
	public void launchUrl() {

		EnvironmentUtil env = new EnvironmentUtil();
		UIKeyword.launchUrl(env.getappUrl());
	}

	@And("hover on Women and Click on Fusion Wear")
	public void hoverOnWomenAndClickOnIndianFusionWear() {
		WomenKurtaKurtiSuitPage wk = new WomenKurtaKurtiSuitPage();
		wk.hoverOnWomen();
		wk.clickOnIndianFusionWear();
	}

	@When("click on Women kurta kurti Suit")
	public void clickOnWomenKurtaKurtiSuit() {
		WomenKurtaKurtiSuitPage wk = new WomenKurtaKurtiSuitPage();
		wk.clickOnWomenKurtaKurtiSuit();

	}

	@Then("select filter by Better Discount")
	public void selectFilterByBetterDiscount() {
		WomenKurtaKurtiSuitPage wk = new WomenKurtaKurtiSuitPage();
		wk.selectFilterByBetterDiscount();
	}

}
