package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AccountCreatedPage;
import pages.AccountInfo;
import pages.AllProductsPage;
import pages.CartPage;
import pages.LoginPage;
import pages.MainPage;
import pages.PaymentPage;
import utils.BaseClass;

public class TestCase16 extends BaseClass{
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void RegisterWhileCheckout() throws InterruptedException {
		AllProductsPage app=new AllProductsPage(driver);
		app.AddToCart();
		Thread.sleep(2000);
		MainPage mp=new MainPage(driver);
		mp.Cart();
		CartPage cp=new CartPage(driver);
		cp.ProceedToCheckout();
		Thread.sleep(1000);
		cp.Register();
		LoginPage lp=new LoginPage(driver);
		lp.UserLogin("abcde", "abcde@gmail.com");
		AccountInfo ai=new AccountInfo(driver);
		ai.Mr();
		ai.AccuntInformation();
		Thread.sleep(1000);
		AccountCreatedPage acc=new AccountCreatedPage(driver);
		acc.AccountCreatedMessage();
		mp.LoginwithUserId();
		mp.Cart();
		cp.ProceedToCheckout();
		cp.AddressDetails();
		cp.ReviewurOrder();
		Thread.sleep(2000);
		cp.Message();
		cp.PlaceOrder();
		PaymentPage pp=new PaymentPage(driver);
		pp.Payment();
		Thread.sleep(2000);
		pp.OrderConfirmation();
		Thread.sleep(2000);
		mp.Delete();
		acc.AccountDeletedMessage();
	}
}
