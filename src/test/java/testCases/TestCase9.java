package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AllProductsPage;
import pages.MainPage;
import utils.BaseClass;

public class TestCase9 extends BaseClass{
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void SearchBtn() throws InterruptedException {
		MainPage mp=new MainPage(driver);
		mp.Product();
		AllProductsPage app=new AllProductsPage(driver);
		app.VerifyProducts();
		app.SearchProduct();
		Thread.sleep(2000);
		app.ProductInformation();
	}

}
