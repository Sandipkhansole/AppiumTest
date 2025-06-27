package com.rc.paeobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory {
	WebDriver driver;
	
	@FindBy(xpath="")
	WebElement Username;
	
	@FindBy(xpath="")
	WebElement Password;
	
	@FindBy(id="")
	WebElement Loginbtn;
	
	LoginPageWithPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String username) {
		Username.sendKeys(username);
	}
	public void setPasswordName(String password) {
		Password.sendKeys(password);
	}
	public void clickLoginButton() {
		Loginbtn.click();
	}

}
