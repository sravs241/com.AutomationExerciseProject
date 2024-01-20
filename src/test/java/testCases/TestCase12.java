package testCases;

import org.apache.log4j.chainsaw.Main;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AllProductsPage;
import pages.CartPage;
import pages.MainPage;
import utils.BaseClass;

public class TestCase12 extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void AddProductinCart() throws InterruptedException {
		AllProductsPage app=new AllProductsPage(driver);
		app.AddToCart();
		MainPage mp=new MainPage(driver);
		mp.Cart();
		CartPage cp=new CartPage(driver);
		cp.ProductDetails();
	}
}
