package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath ="//button")
	WebElement loginbtn;

	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
     }
	public void LoginToApplication(String uname,String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}
}
