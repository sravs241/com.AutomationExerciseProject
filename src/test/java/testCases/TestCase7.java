package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.MainPage;
import pages.TestCasesPage;
import utils.BaseClass;

public class TestCase7 extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void TestCase() {
		MainPage mp=new MainPage(driver);
		mp.TestCase();
		TestCasesPage tc=new TestCasesPage(driver);
		tc.TestcaseVerification();
	}
}
