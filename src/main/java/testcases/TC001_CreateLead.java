package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_CreateLead";
		testDescription="Lead Creation";
		testNodes="Leads";
		category="Smoke";
		authors="Nishanth";
		browserName="chrome";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void login(String uName,String pwd,String cname,String forename,String lastname) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLead()
		.clickCreateLead()
		.typecompanyName(cname)
		.typeforeName(forename)
		.typelastName(lastname)
		.clickSubmit()
		.verifyCompanyName(cname);
	}

}
