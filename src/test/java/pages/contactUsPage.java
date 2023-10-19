package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactUsPage {
	WebDriver driver;
	public contactUsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy (xpath="//*[text()='Get In Touch']")
	WebElement getintouch;
	@FindBy(name = "name")
	WebElement Name;
	@FindBy(name = "email")
	WebElement email;
	@FindBy(name = "subject")
	WebElement subject;
	@FindBy (id="message")
	WebElement message;
	@FindBy(name="upload_file")
	WebElement upload;
	@FindBy(name = "submit")
	WebElement submitbtn;
	@FindBy(xpath="(//*[text()='Success! Your details have been submitted successfully.'])[1]")
	WebElement successmessage;
	@FindBy (xpath="(//*[text()=' Home'])[2]")
	WebElement home;
	
	public void GetinTuch() {
		boolean message=getintouch.isDisplayed();
		if(message) {
			System.out.println("'GET IN TOUCH' is visible ");
		}else
		{
			System.out.println("'GET IN TOUCH' is not visible ");
		}
	}
	public void Contactform() {
		Name.sendKeys("abcd");
		email.sendKeys("abcd@gmail.com");
		subject.sendKeys("Dress");
		message.sendKeys("Material is good");
		//upload.sendKeys("location of file");
		submitbtn.click();
		Alert a=driver.switchTo().alert();
		a.accept();
		boolean message=successmessage.isDisplayed();
		if(message) {
			System.out.println(" 'Success! Your details have been submitted successfully.' is visible");
		}else
		{
			System.out.println(" 'Success! Your details have been submitted successfully.' is not visible");
		}
		home.click();
	}
}
