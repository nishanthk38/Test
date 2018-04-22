package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
     public ViewLead(){
    	 PageFactory.initElements(driver, this);
     }
     @FindBy(how=How.ID,using="viewLead_companyName_sp")
 	private WebElement eleCompanyName;
 	
 	public ViewLead verifyCompanyName(String data) {
 	verifyPartialText(eleCompanyName, data);
 		return this;		
 	}
 	
 	  @FindBy(how=How.ID,using="sectionHeaderTitle_leads")
 	 	private WebElement eleName;
 	  @And("Verify the title (.*)")
 	 	public ViewLead verifyName(String data) {
 	 	verifyPartialText(eleName, data);
 	 		return this;		
 	 	}
 	 	
 	 	@FindBy(how=How.LINK_TEXT,using="Edit")
 		private WebElement eleEdit;
 		@And("Click on Edit")
 		public MyViewLead clickEdit() {
 			click(eleEdit);
 			return new MyViewLead();		
 		}
 		
 		@FindBy(how=How.ID,using="viewLead_companyName_sp")
 	 	private WebElement eleCName;
 	 	@And("Verify the company name (.*)")
 	 	public ViewLead verifyCname(String data) {
 	 	verifyPartialText(eleCName, data);
 	 		return this;		
 	 	}
 	 	
 	 	@FindBy(how=How.LINK_TEXT,using="Delete")
 		private WebElement eleDelete;
 		
 		public MyLeads clickDelete() {
 			click(eleDelete);
 			return new MyLeads();		
 		}
 		
 		}
