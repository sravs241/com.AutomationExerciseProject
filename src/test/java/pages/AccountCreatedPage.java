package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreatedPage {
	WebDriver driver;
	public AccountCreatedPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy (xpath="//b[text()='Account Created!']")
	WebElement message;
	@FindBy (xpath="//b[text()='Account Deleted!']")
	WebElement deletemessage;
	@FindBy (xpath="//a[text()='Continue']")
	WebElement continuebtn;
	
	public void AccountCreatedMessage() {
		//Verify that 'Account Created!' is visible
		boolean accountinfo=message.isDisplayed();
		if(accountinfo) {
			System.out.println("'Account Created!' is visible ");
		}else
		{
			System.out.println("'Account Created!' is not visible ");
		}
	}
	public void AccountDeletedMessage() {
		//Verify that 'Account Deleted!' is visible
		boolean accountinfo=deletemessage.isDisplayed();
		if(accountinfo) {
			System.out.println("'ACCOUNT DELETED!' is visible ");
		}else
		{
			System.out.println("'ACCOUNT DELETED!' is not visible ");
		}
	}
	
	public void Continuebtn() {
		continuebtn.click();
	}

}
