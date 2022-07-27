package com.irris22a.keyword;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeyword {

	public static RemoteWebDriver driver = null;

	public static void openBrowser(String BrowserNm) {
		if (BrowserNm.equalsIgnoreCase("Chrome")) {
		 WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 ChromeOptions op=new ChromeOptions();
		 op.addArguments("-disable-notification","start-maximised","--incognito");
			driver = new ChromeDriver(op);

		} else if (BrowserNm.equalsIgnoreCase("edge")) {
			// WebDriverManager.edgedriver().setup();
			System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (BrowserNm.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		System.out.println(BrowserNm + " browser is launched ");
	}

	public static void launchUrl(String url) {

		driver.get(url);
		System.out.println(url + " launch successfully");
	}

	public static void closeBrowser() {
		driver.close();

		System.out.println("Browser is close successfully");
	}

	public static void switchWindow(String byTitle) {

		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		String title = driver.getTitle();
		for (String window : childWindow) {
			if (driver.switchTo().window(window).getTitle().equals(byTitle)) {
				System.out.println("Switched on window : " + byTitle);
				break;
			}
		}

	}

	public static void enterText(By element, String text) {

		driver.findElement(element).sendKeys(text);

	}

	public static void hitButton(int keyCode) {
		Robot robo = null;
		try {
			robo = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robo.keyPress(keyCode);

	}

	public static List<String> getTexts(By element) {
		List<WebElement> elements = driver.findElements(element);
		List<String> texts = new ArrayList<String>();
		for (WebElement ele : elements) {
			texts.add(ele.getText());
		}

		return texts;
	}

	public static void mouseMoveTo(By xpath) {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(xpath)).build().perform();

	}

	public static void clickOn(By xpath) {

		driver.findElement(xpath).click();

	}

	public static void click(String locatorType, String locatorValue) {

		getWebElement(locatorType, locatorValue).click();

	}

	public static WebElement getWebElement(String locatorType, String locatorValue) {

		WebElement element = null;
		if (locatorType.equalsIgnoreCase("xpath")) {
			element = driver.findElement(By.xpath(locatorValue));

		} else if (locatorType.equalsIgnoreCase("id")) {
			element = driver.findElement(By.id(locatorValue));

		} else if (locatorType.equalsIgnoreCase("name")) {
			element = driver.findElement(By.name(locatorValue));

		} else if (locatorType.equalsIgnoreCase("tagName")) {
			element = driver.findElement(By.tagName(locatorValue));

		} else if (locatorType.equalsIgnoreCase("cssSelector")) {
			element = driver.findElement(By.cssSelector(locatorValue));

		} else if (locatorType.equalsIgnoreCase("linkText")) {
			element = driver.findElement(By.linkText(locatorValue));

		} else if (locatorType.equalsIgnoreCase("partialLinkText")) {
			element = driver.findElement(By.partialLinkText(locatorValue));

		} else if (locatorType.equalsIgnoreCase("className")) {
			element = driver.findElement(By.className(locatorValue));

		} else {
			System.err.println("Invalid locator type : " + locatorType);
		}
		return element;
	}

	public static List<WebElement> getWebElements(String locatorType, String locatorValue) {
		List<WebElement> elements = new ArrayList<WebElement>();
		if (locatorType.equalsIgnoreCase("xpath")) {
			elements = driver.findElements(By.xpath(locatorValue));

		} else if (locatorType.equalsIgnoreCase("id")) {
			elements = driver.findElements(By.id(locatorValue));

		} else if (locatorType.equalsIgnoreCase("name")) {
			elements = driver.findElements(By.name(locatorValue));

		} else if (locatorType.equalsIgnoreCase("tagName")) {
			elements = driver.findElements(By.tagName(locatorValue));

		} else if (locatorType.equalsIgnoreCase("cssSelector")) {
			elements = driver.findElements(By.cssSelector(locatorValue));

		} else if (locatorType.equalsIgnoreCase("linkText")) {
			elements = driver.findElements(By.linkText(locatorValue));

		} else if (locatorType.equalsIgnoreCase("partialLinkText")) {
			elements = driver.findElements(By.partialLinkText(locatorValue));

		} else if (locatorType.equalsIgnoreCase("className")) {
			elements = driver.findElements(By.className(locatorValue));

		} else {
			System.err.println("Invalid locator type : " + locatorType);
		}
		return elements;

	}

	public static void mouseMoveTo(String locatorType, String locatorValue) {
		Actions act = new Actions(driver);

		act.moveToElement(getWebElement(locatorType, locatorValue)).perform();
	}

	public static List<String> getTexts(String locatorType, String locatorValue) {

		List<WebElement> elements = getWebElements(locatorType, locatorValue);
		List<String> texts = new ArrayList<String>();
		for (WebElement ele : elements) {
			texts.add(ele.getText());
		}

		return texts;
	}

	public static void enterText(String locatorType, String locatorValue, String text) {

		getWebElement(locatorType, locatorValue).sendKeys(text);

	}

	public static void mouseMoveTo(WebElement men_menu) {

		Actions act = new Actions(driver);

		act.moveToElement(men_menu).perform();

	}

	public static void click(WebElement menu_Topwear) {

		Actions act = new Actions(driver);

		act.click(menu_Topwear).build().perform();
	}
	
	public static void clickON(WebElement element) {

		Actions act = new Actions(driver);

		act.click(element).build().perform();
	}

}
