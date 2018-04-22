package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCname;
	@And("Enter the Company (.*)")
	public CreateLead typecompanyName(String data) {
		type(eleCname,data);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleForeName;
	@And("Enter the Firstname (.*)")
	public CreateLead typeforeName(String data) {
		type(eleForeName,data);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	@And("Enter the lastname (.*)")
	public CreateLead typelastName(String data) {
		type(eleLastName,data);
		return this;
	}
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleSubmit;
	@When("Click on submit button")
	public ViewLead clickSubmit() {
		click(eleSubmit);
		return new ViewLead();		
	}

}
