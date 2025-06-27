package com.rc.utils;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	WebDriver driver;

	public void setImplicictlyWait(int Seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Seconds));
	}

	public void setExplicitWait(int Seconds, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(Seconds));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
	}
	public void setFluentWait(int Seconds, int pollingseconds, WebElement ele) {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(Seconds));
		wait.pollingEvery(Duration.ofSeconds(pollingseconds));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

}
