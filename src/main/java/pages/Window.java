package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Window extends ProjectMethods {
	
	Window(){
		PageFactory.initElements(driver, this);
		//switchToWindow(1);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	private WebElement eleLeadId;
	public Window typeLeaId(String data) {
		type(eleLeadId,data);
		//switchToWindow(1);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFind1;
	public Window clickFind1() throws InterruptedException {
		
		clickWithNoSnap(eleFind1);
		Thread.sleep(2000);
		//switchToWindow(1);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleFirst1;
	public MergeLead clickFirst1() throws InterruptedException {
		String Text;
		firstResLeadId=eleFirst1.getText();
		System.out.println(firstResLeadId);
		clickWithNoSnap(eleFirst1);
		switchToWindow(0);
		Thread.sleep(2000);
		return new MergeLead();		
	}
	
	
	
	
}
