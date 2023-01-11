package basicTestScript;

import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class DemoTestScriptTest extends BaseClass {
	
	@Test(priority = 1)
	public void verifyHomePageTest() {
		System.out.println("Homepage has been verified");
	}
	
	
}
