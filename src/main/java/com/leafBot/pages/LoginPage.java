package com.leafBot.pages;

import com.leafBot.testng.api.base.Annotations;

public class LoginPage extends Annotations {
	
	public LoginPage enterUserName() {
		clearAndType(locateElement("id", "username"), "demosalesmanager");
		return this;
	}
	
	public LoginPage enterPassword() {
		clearAndType(locateElement("id", "password"), "crmsfa");
		return this;
	}
	
	public HomePage clickLogin() {
		click(locateElement("class", "decorativeSubmit"));
		return new HomePage();
	}
	
}
