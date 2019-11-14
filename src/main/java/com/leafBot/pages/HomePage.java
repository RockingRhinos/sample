package com.leafBot.pages;

import com.leafBot.testng.api.base.Annotations;

public class HomePage extends Annotations{

	public MyHomePage clickCRMSFA() {
		click(locateElement("link", "CRM/SFA"));
		
		return new MyHomePage();
	}
	
}
