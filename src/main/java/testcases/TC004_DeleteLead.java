package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_DeleteLead";
		testDescription="Lead Edition";
		testNodes="Leads";
		category="Smoke";
		authors="Nishanth";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void login(String uName,String pwd,String firstname,String Title) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLead()
		.clickFindLeads()
		.typeFirstname(firstname)
		.clickSubmit()
	//	.wait(2000)
		.clickSub()
		.verifyName(Title)
		.clickDelete();
	}

}
