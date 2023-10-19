package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCasesPage {
	WebDriver driver;
	public TestCasesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy (xpath="//*[text()='Test Cases']")
	WebElement testcase;
	
	public void TestcaseVerification() {
		boolean testcasepage=testcase.isDisplayed();
		if(testcasepage) {
			System.out.println("'Test Case Page' is visible");
		}else {
			System.out.println("'Test Case Page' is not visible");
		}
			
	}
}
