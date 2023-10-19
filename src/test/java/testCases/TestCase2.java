package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AccountCreatedPage;
import pages.LoginPage;
import pages.MainPage;
import utils.BaseClass;

public class TestCase2 extends BaseClass{
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void loginwithValidInputs() throws InterruptedException {
		MainPage mp=new MainPage(driver);
		mp.signupbtn();
		Thread.sleep(2000);
		LoginPage lp=new LoginPage(driver);
		lp.LoginMessage();
		lp.UserLogin("qatest1@gmail.com", "abcde");
		mp.LoginwithUserId();
		mp.Delete();
		AccountCreatedPage acc=new AccountCreatedPage(driver);
		acc.AccountDeletedMessage();
	}
}
