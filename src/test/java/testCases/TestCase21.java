package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AllProductsPage;
import pages.MainPage;
import utils.BaseClass;

public class TestCase21 extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void AddReview() throws InterruptedException   {
		MainPage mp=new MainPage(driver);
		mp.Product();
		AllProductsPage app=new AllProductsPage(driver);
		app.VerifyProducts();
		app.ViewProduct();
		Thread.sleep(2000);
		app.Review();
		app.ThankyouMessage();
		
	}
}
