package com.irctc.pages;

import org.openqa.selenium.support.PageFactory;

public class MobilePage extends BasePage{
	
	public MobilePage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle() {
		return getPageTitle();
	}

}
