package com.leafBot.pages;

import com.leafBot.testng.api.base.Annotations;

public class CreateLeadPage extends Annotations{
	
	public CreateLeadPage enterCompanyName() {
		clearAndType(locateElement("id", "createLeadForm_companyName"), "TestLeaf");
		return this;
	}
	
	public CreateLeadPage enterFirstName() {
		clearAndType(locateElement("id", "createLeadForm_firstName"), "Naveen");
		return this;
	}
	
	public CreateLeadPage enterLastName() {
		clearAndType(locateElement("id", "createLeadForm_lastName"), "Elumalai");
		return this;
	}
	
	public ViewLeadPage submitCreateLead() {
		click(locateElement("class", "smallSubmit"));
		return new ViewLeadPage();
	}
	
}
