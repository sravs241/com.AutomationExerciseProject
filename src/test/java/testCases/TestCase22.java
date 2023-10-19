package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.MainPage;
import utils.BaseClass;

public class TestCase22 extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void RecommendedItems() {
		MainPage mp=new MainPage(driver);
		mp.RecommendedItem();
		mp.AddtoCart();
		mp.ViewCart();
		CartPage cp=new CartPage(driver);
		cp.ProductDetails();
	}

}
