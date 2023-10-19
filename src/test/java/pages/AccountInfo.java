package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountInfo {
	WebDriver driver;

	public AccountInfo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//b[text()='Enter Account Information']")
	WebElement message;
	@FindBy(id = "id_gender1")
	WebElement mr;
	@FindBy(id = "id_gender2")
	WebElement mrs;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(id = "days")
	WebElement day;
	@FindBy(id = "months")
	WebElement month;
	@FindBy(id = "years")
	WebElement year;
	@FindBy(id = "newsletter")
	WebElement news;
	@FindBy(id = "optin")
	WebElement specialoffers;
	@FindBy(id = "first_name")
	WebElement firstname;
	@FindBy(id = "last_name")
	WebElement lastname;
	@FindBy(id = "company")
	WebElement company;
	@FindBy(id = "address1")
	WebElement address1;
	@FindBy(id = "address2")
	WebElement address2;
	@FindBy(id = "country")
	WebElement country;
	@FindBy(id = "state")
	WebElement state;
	@FindBy(id = "city")
	WebElement city;
	@FindBy(id = "zipcode")
	WebElement zipcode;
	@FindBy(id = "mobile_number")
	WebElement mobileno;
	@FindBy(xpath = "//button[text()='Create Account']")
	WebElement Accountbtn;

	public void Message() {
		// Verify that 'ENTER ACCOUNT INFORMATION' is visible
		boolean accountinfo = message.isDisplayed();
		if (accountinfo) {
			System.out.println("'ENTER ACCOUNT INFORMATION' is visible ");
		} else {
			System.out.println("'ENTER ACCOUNT INFORMATION' is not visible ");
		}
	}

	public void Mr() {
		mr.click();
	}

	public void Mrs() {
		mrs.click();
	}

	public void AccuntInformation() {

		password.sendKeys("abcd432A");
		day.sendKeys("17");
		month.sendKeys("October");
		year.sendKeys("1988");
		news.click();
		specialoffers.click();
		firstname.sendKeys("test");
		lastname.sendKeys("Engineer");
		company.sendKeys("xyz company");
		address1.sendKeys("Hyderabad");
		address2.sendKeys("Hyderabad");
		country.sendKeys("India");
		state.sendKeys("Telangana");
		city.sendKeys("Hyderabad");
		zipcode.sendKeys("515151");
		mobileno.sendKeys("1234567890");
		Accountbtn.click();
	}

}
