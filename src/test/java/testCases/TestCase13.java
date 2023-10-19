package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AllProductsPage;
import pages.CartPage;
import pages.MainPage;
import utils.BaseClass;

public class TestCase13 extends BaseClass{
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void ProductQuantity() throws InterruptedException {
		MainPage mp=new MainPage(driver);
		mp.ViewProduct();
		AllProductsPage app=new AllProductsPage(driver);
		app.Quantity();
		Thread.sleep(2000);
		mp.Cart();
		Thread.sleep(2000);
		CartPage cp=new CartPage(driver);
		cp.Quantity();
	}
}
