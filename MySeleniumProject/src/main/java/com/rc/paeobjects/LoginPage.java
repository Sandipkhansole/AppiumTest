package com.rc.paeobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
		WebDriver driver;
	    By txt_username_loc=By.xpath("");
		By txt_password_loc=By.xpath("");
		By btn_login_loc=By.xpath("");
		
		LoginPage(WebDriver driver){
			this.driver=driver;
		}

		public void setUserName(String username) {
			driver.findElement(txt_username_loc).sendKeys(username);
		}	
		public void setPassword(String password) {
			driver.findElement(txt_password_loc).sendKeys(password);
		}
		public void clickLogin() {
			driver.findElement(btn_login_loc).click();
		}
	
}

