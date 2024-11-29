package com.irctc.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.irctc.pages.HomePage;
import com.irctc.pages.LoginPage;

public final class LoginTest extends BaseTest{
	private LoginTest() {}

	@Test(description = "Login to the IRCTC website")
	public void loginToApplication() {
		HomePage hp = new HomePage();
		LoginPage lp = hp.navigateToLoginPage();
		
		lp.waitForPageLoad();
		Assertions.assertThat(lp.getTitle()).isEqualTo("IRCTC Next Generation eTicketing System");
		
		lp.loginToApp("swetasingh0322", "Swetadi@12345");
		
	}
}
