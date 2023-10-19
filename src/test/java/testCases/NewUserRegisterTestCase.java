package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AccountCreatedPage;
import pages.AccountInfo;
import pages.LoginPage;
import pages.MainPage;
import utils.BaseClass;

public class NewUserRegisterTestCase extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void Signup() throws InterruptedException {
		MainPage mp=new MainPage(driver);
		mp.signupbtn();
		Thread.sleep(2000);
		LoginPage lp=new LoginPage(driver);
		lp.Message();
		lp.UserSignup("QA Engineer","qaenginer1@gmail.com");
		AccountInfo acc=new AccountInfo(driver);
		acc.Message();
		acc.Mr();
		Thread.sleep(2000);
		acc.AccuntInformation();
		AccountCreatedPage accCreate= new AccountCreatedPage(driver);
		Thread.sleep(2000);
		accCreate.AccountCreatedMessage();
		accCreate.Continuebtn();
		Thread.sleep(2000);
		mp.LoginwithUserId();
		mp.Delete();
		Thread.sleep(2000);
		accCreate.AccountDeletedMessage();
		accCreate.Continuebtn();
	}
	

	

}
