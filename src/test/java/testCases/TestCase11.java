package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.MainPage;
import utils.BaseClass;

public class TestCase11 extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void Subscription() {
		MainPage mp=new MainPage(driver);
		mp.Cart();
		mp.Subscription();
	}

}
