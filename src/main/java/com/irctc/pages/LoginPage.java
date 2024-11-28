package com.irctc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

	public LoginPage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	private final By departureCity = By.xpath("//p-autocomplete[@id='origin']");
	private final By arrivalCity = By.xpath("//p-autocomplete[@id='destination']");
	private final By departureDate = By.name("0-datefrom");
}
