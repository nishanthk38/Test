package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class ResultLead extends ProjectMethods {

	public ResultLead()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a)[1]") 
	 WebElement eleClick;
	@And("Click on first resulting lead")
	public ViewLead clickSub() {
		click(eleClick);
		return new ViewLead();
	}
	
	@FindBy(how=How.XPATH,using="//div[text()='No records to display']")
	private WebElement textMessage;
	
	public ResultLead verifytextMsg(String data) {
	verifyPartialText(textMessage, data);
		return this;		
	}

	
}
