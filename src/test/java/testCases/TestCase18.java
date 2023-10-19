package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AllProductsPage;
import pages.MainPage;
import utils.BaseClass;

public class TestCase18 extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void ViewCategoryProducts() throws InterruptedException {
		MainPage mp=new MainPage(driver);
		mp.Categoryview();
		Thread.sleep(2000);
		mp.WomenProducts();
		AllProductsPage app=new AllProductsPage(driver);
		app.WomenProducts();
		Thread.sleep(2000);
		mp.MenProducts();
		app.MenProducts();
	}
}
