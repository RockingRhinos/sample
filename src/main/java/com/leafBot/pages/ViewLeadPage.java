package com.leafBot.pages;

import com.leafBot.testng.api.base.Annotations;

public class ViewLeadPage extends Annotations{

	public ViewLeadPage verifyFirstName() {
		verifyExactText(locateElement("id", "viewLead_firstName_sp"), "Naveen");
		return this;
	}
	
}
