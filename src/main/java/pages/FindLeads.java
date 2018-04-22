package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods {
	
	public FindLeads()
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(how=How.XPATH,using="(//input[@name = 'firstName'])[3]")
	private WebElement eleFirstname;
	@And("Enter the Name (.*)")
	public FindLeads typeFirstname(String data) {
		type(eleFirstname,data);
		return this;
	}
		
	@FindBy(how=How.XPATH,using="(//button[text()='Find Leads'])") 
	 WebElement eleFind;
	@And("Click on Find")
	public ResultLead clickSubmit() {
		click(eleFind);
		return new ResultLead();
		
	}
	
	}
	

