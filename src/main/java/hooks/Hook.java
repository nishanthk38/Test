package hooks;



import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hook extends SeMethods{
	@Before
//	@Given("Open the browser")
	public void beforeRun()
	{
		startResult();
		//startTestModule("Create Lead", "Creating Lead");
		startTestModule("Edit Lead", "Editing Lead");
		//test = startTestCase("TC001");
		test = startTestCase("TC002");
		test.assignCategory("Smoke");
		test.assignAuthor("Nishanth");
		startApp("chrome");
	}
	@After
	public void afterRun()
	{
		endResult();
		closeAllBrowsers();
	}

}
