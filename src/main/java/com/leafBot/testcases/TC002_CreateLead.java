package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.Annotations;

public class TC002_CreateLead extends Annotations{

	@BeforeTest
	public void setData() {
		testcaseName = "TC001_Login";
		testcaseDec = "Loging into LeafTaps";
		author = "Sam";
		category = "Smoke";
	}
	
	@Test
	public void createLead() {
		LoginPage obj = new LoginPage();
		obj.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.createLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.submitCreateLead()
		.verifyFirstName();
	}
	
}
