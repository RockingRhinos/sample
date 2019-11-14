package com.leafBot.pages;

import com.leafBot.testng.api.base.Annotations;

public class MyHomePage extends Annotations{
	
	public LeadsPage clickLeads() {
		click(locateElement("link", "Leads"));
		return new LeadsPage();
	}
	
}
