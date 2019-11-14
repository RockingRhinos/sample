package com.leafBot.pages;

import com.leafBot.testng.api.base.Annotations;

public class LeadsPage extends Annotations{
	
	public CreateLeadPage createLead() {
		click(locateElement("link", "Create Lead"));
		return new CreateLeadPage();
	}

}
