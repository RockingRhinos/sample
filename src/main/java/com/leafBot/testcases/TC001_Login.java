package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.Annotations;

public class TC001_Login extends Annotations{

	@BeforeTest
	public void setData() {
		testcaseName = "TC001_Login";
		testcaseDec = "Loging into LeafTaps";
		author = "Sam";
		category = "Smoke";
	}
	
	@Test
	public void login() {
		LoginPage obj = new LoginPage();
		obj.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA();
	}
	
}
