package com.irctc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.irctc.enums.WaitStrategy;

public final class HomePage extends BasePage {
	
	public HomePage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	private final By loginBtn = By.xpath("//a[contains(text(),'LOGIN')]");
	private final By travelLink = By.xpath("//span[text()='Flight Bookings']");


	public LoginPage navigateToLoginPage() {
		click(loginBtn, WaitStrategy.CLICKABLE, "Login Button");
		return new LoginPage(); // method chaining
	}

	public TravelPage navigateToTravelPage() {
		click(travelLink, WaitStrategy.CLICKABLE, "Travel Page Link");
		return new TravelPage(); // method chaining
	}
	
}
