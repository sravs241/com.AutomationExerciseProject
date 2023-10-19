package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MainPage;
import utils.BaseClass;

public class TestCase5 extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void loginwithValidInputs() throws InterruptedException  {
		MainPage mp=new MainPage(driver);
		mp.signupbtn();
		Thread.sleep(2000);
		LoginPage lp=new LoginPage(driver);
		lp.Message();
		lp.UserSignup("QA Engineer","qaenginer1@gmail.com");
		lp.ErrorMessage2();
	}

}
