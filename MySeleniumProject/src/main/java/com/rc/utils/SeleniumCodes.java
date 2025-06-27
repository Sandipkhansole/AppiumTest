package com.rc.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumCodes {
	// Write a program to select the dropdown element
	public static void launchingBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.id("sandip"));

	}

	public static void selectDropwnText(WebElement ele, String DropdownText) {
		Select sel = new Select(ele);
		try {
			sel.selectByVisibleText(DropdownText);
		} catch (NoSuchElementException e) {
			e.getStackTrace();
		}
	}

	public static void usekeyboardActions(WebDriver driver, WebElement source, WebElement destination) {
		Actions act = new Actions(driver);
		act.dragAndDrop(source, destination).build().perform();
		act.keyDown(Keys.SHIFT).build().perform();
		act.sendKeys(Keys.chord(Keys.CONTROL, Keys.F5)).build().perform();
		
	}

	public static void chromeOptions(WebDriver driver) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--ignore--certificate--errors");

	}
	public static void AdnroidOptions(WebDriver driver) {
		//UIAutomator2Options op=new UIAutomator2Options();
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("PlatformName", "Android");
		caps.setCapability("appPackage", "Android");
		AndroidDriver driver1=new AndroidDriver(caps);
		driver1.get("");

	}
	

}
