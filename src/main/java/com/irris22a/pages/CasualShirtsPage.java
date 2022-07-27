
package com.irris22a.pages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.irris22a.keyword.UIKeyword;

public class CasualShirtsPage {

	public By itemCount = By.xpath("//span[@class=\"title-count\"]");

	public int getItemCount() {

		String itemcount = UIKeyword.driver.findElement(itemCount).getText();
		Pattern p = Pattern.compile("//d");
		Matcher m = p.matcher(itemcount);
		String count = m.group();
		return Integer.parseInt(itemcount);
	}
	
	
	
}
