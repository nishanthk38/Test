package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;



public class MyViewLead extends ProjectMethods {
	
	public MyViewLead(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id = 'updateLeadForm_companyName']")
	private WebElement eleCompanyname;
	@And("Change the Company name (.*)")
	public MyViewLead typecompanyName(String data) {
		type(eleCompanyname,data);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//input[@name='submitButton'])[1]")
		private WebElement eleSub;
		@And("Click update")
		public ViewLead clickEdit2() {
			click(eleSub);
			return new ViewLead();		
		}
	
}
