package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.MainPage;
import pages.contactUsPage;
import utils.BaseClass;

public class TestCase6 extends BaseClass {
	@BeforeMethod
	public void launchingURL() {
		LaunchURL url=new LaunchURL();
		url.LaunchingURL();
	}
	@Test
	public void ContactForm() {
		MainPage mp=new MainPage(driver);
		mp.ContactUs();
		contactUsPage contact=new contactUsPage(driver);
		contact.GetinTuch();
		contact.Contactform();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("Automation Exercise")) {
			System.out.println("Home page is visible successfully");
		}else {
			System.out.println("Home page is not visible");
		}
	}
}
