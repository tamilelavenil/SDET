package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.SalesforceMethods;

public class LoginPage extends SalesforceMethods{
	
	
	public LoginPage typeUsername(String username) {
		type(locateElement(Locators.ID,"username"), username);
		reportStep(username+" Username is entered successfully", "pass");
		return this;
	}

	
	public LoginPage typePassword(String password) {
		type(locateElement(Locators.ID,"password"), password);
		reportStep(password+" Password is entered successfully", "pass");
		return this;
	}	
	

	public HomePage clickLogIn() {
		pause(2000);
		click(locateElement(Locators.XPATH,"//input[@id='Login']"));
		reportStep("Login button is clicked", "pass");
		return new HomePage();		
	}

}
