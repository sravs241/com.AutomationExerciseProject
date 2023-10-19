package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utils.BaseClass;

public class LaunchURL extends BaseClass{
		
	@Test
	public void LaunchingURL() {
		String path="https://automationexercise.com/";
		driver.get(path);
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("Automation Exercise")) {
			System.out.println("Home page is visible successfully");
		}else {
			System.out.println("Home page is not visible");
		}
	}

}

