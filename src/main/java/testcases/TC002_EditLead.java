package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC002_EditLead";
		testDescription="Lead Edition";
		testNodes="Leads";
		category="Smoke";
		authors="Nishanth";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void login(String uName,String pwd,String firstname,String Title,String companyname) {
		
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
		.clickEdit()
		.typecompanyName(companyname)
		.clickEdit2()
		.verifyCname(companyname);
		
	}

}
