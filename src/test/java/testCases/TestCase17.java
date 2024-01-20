package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AllProductsPage;
import pages.CartPage;
import pages.MainPage;
import utils.BaseClass;

public class TestCase17 extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void RemoveFromCart() throws InterruptedException {
		AllProductsPage app=new AllProductsPage(driver);
		app.AddToCart();
		MainPage mp=new MainPage(driver);
		mp.Cart();
		CartPage cp=new CartPage(driver);
		cp.VerifyShoppingCart();
		cp.DeleteProduct();
		cp.CartisEmpty();
		driver.quit();
	}
}
