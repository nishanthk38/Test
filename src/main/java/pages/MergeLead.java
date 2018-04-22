package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods {

	MergeLead(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement eleSubmit1;
	public Window clickpop1() {
		clickWithNoSnap(eleSubmit1);
		switchToWindow(1);
		return new Window();	
		
	}
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eleSubmit2;
	public Window clickpop2() {
		clickWithNoSnap(eleSubmit2);
		switchToWindow(1);
		return new Window();	
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge")
		private WebElement eleMerge;
		
		public MyLeads clickMerge() {
			clickWithNoSnap(eleMerge);
			acceptAlert();
			return new MyLeads();		
		}
	
	
	
	
	
	/*@FindBy(how=How.XPATH,using="(//input[@class=' x-form-text x-form-field'])[1]")
	private WebElement eleLeadId;
	public MergeLead typeLeadId(String data) {
		type(eleLeadId,data);
		//switchToWindow(1);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFind1;
	public MergeLead clickFind1() {
		click(eleFind1);
		//switchToWindow(1);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]']")
	private WebElement eleFirst1;
	public MergeLead clickFirst1() {
		click(eleFirst1);
		switchToWindow(0);
		return this;		
	}*/
	
}
