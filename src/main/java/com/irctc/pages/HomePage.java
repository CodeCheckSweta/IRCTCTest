package com.irctc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.irctc.enums.WaitStrategy;

public final class HomePage extends BasePage {
	
	public HomePage() {
		super();
		PageFactory.initElements(driver, this);
	}

	private final By mobileLink = By.xpath("//span[text()='Mobiles & Tablets']");
	private final By travelLink = By.xpath("//span[text()='Flight Bookings']");
	private final By searchBox = By.xpath("//input[@title='Search for Products, Brands and More']");
	private final By searchButton = By.xpath("//button[@type='submit']");


	public MobilePage navigateToMobilePage() {
		click(mobileLink, WaitStrategy.CLICKABLE, "Mobile Page Link");
		return new MobilePage(); // method chaining
	}

	public TravelPage navigateToTravelPage() {
		click(travelLink, WaitStrategy.CLICKABLE, "Travel Page Link");
		return new TravelPage(); // method chaining
	}
	
	public  ProductNoisePage navigatetoProductNoisePage(String productName) throws InterruptedException {
		clearAndSendKeys(searchBox, productName, WaitStrategy.CLICKABLE, "Products Search Box");
		click(searchButton, WaitStrategy.CLICKABLE, "Search Button");
		return new ProductNoisePage();
	}

}
