package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_MergeLead";
		testDescription="Lead Merge";
		testNodes="Leads";
		category="Smoke";
		authors="Nishanth";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void login(String uName,String pwd,String Fname,String Fname2,String text) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLead()
		.clickMergeLeads()
		.clickpop1()
		.typeLeaId(Fname)
		.clickFind1()
		.clickFirst1()
		.clickpop2()
		.typeLeaId(Fname2)
		.clickFind1()
		.clickFirst1()
		.clickMerge()
		.clickFindLeads()
		.typeFirstname(firstResLeadId)
		.clickSubmit()
		.verifytextMsg(text);
	}

}
