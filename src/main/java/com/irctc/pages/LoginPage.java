package com.irctc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.irctc.enums.WaitStrategy;

public class LoginPage extends BasePage{

	public LoginPage() {
		super();
		PageFactory.initElements(driver, this);
	}

	public String getTitle() {
		return getPageTitle();
	}

	private final By username = By.xpath("//input[@formcontrolname='userid']");
	private final By password = By.xpath("//input[@formcontrolname='password']");

	public void loginToApp(String user, String pass) {
		clearAndSendKeys(username, user, WaitStrategy.VISIBLE, "User Name");
		clearAndSendKeys(password, pass, WaitStrategy.VISIBLE, "Password");
	}
}
