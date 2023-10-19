package testCases;

import org.apache.log4j.chainsaw.Main;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.MainPage;
import utils.BaseClass;

public class TestCase10 extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void Subscription() {
		MainPage mp=new MainPage(driver);
		mp.Subscription();
	}
}
