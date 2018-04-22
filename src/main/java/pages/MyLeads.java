package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLead;
	@And("Click on Create lead")
	public CreateLead clickCreateLead() {
		click(eleCreateLead);
		return new CreateLead();		
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLead;
	@And("Click on identifying Leads")
	public FindLeads clickFindLeads() {
		click(eleFindLead);
		return new FindLeads();
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLead;
	public MergeLead clickMergeLeads() {
		click(eleMergeLead);
		return new MergeLead();

}

}