package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.core.sym.Name;

public class PaymentPage {
	WebDriver driver;

	public PaymentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (name="name_on_card")
	WebElement NameonCard;
	@FindBy (name="card_number")
	WebElement cardNumber;
	@FindBy (name="cvc")
	WebElement cvv;
	@FindBy (name="expiry_month")
	WebElement expmonth;
	@FindBy (name="expiry_year")
	WebElement expyear;
	@FindBy (id="submit")
	WebElement submit;
	@FindBy (xpath="//*[text()='Your order has been placed successfully!']")
	WebElement message;
	
	public void Payment() {
		NameonCard.sendKeys("abcd");
		cardNumber.sendKeys("12345");
		cvv.sendKeys("123");
		expmonth.sendKeys("05");
		expyear.sendKeys("2029");
		submit.click();
	}
	public void OrderConfirmation() {
		boolean title=message.isDisplayed();
		if(title) {
			System.out.println("Your order has been placed successfully! is displayed");
		}else {
			System.out.println("Your order has been placed successfully! is not displayed");
		}
	}
	
}
