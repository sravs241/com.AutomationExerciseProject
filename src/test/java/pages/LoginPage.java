package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//input[@name='email'])[1]")
	WebElement loginemail;
	@FindBy(name="password")
	WebElement password;
	@FindBy (xpath="//button[text()='Login']")
	WebElement loginbtn;
	@FindBy (name="name")
	WebElement name;
	@FindBy(xpath="(//input[@name='email'])[2]")
	WebElement signupemail;
	@FindBy (xpath="//button[text()='Signup']")
	WebElement Signupbtn;
	@FindBy (xpath="//h2[text()='New User Signup!']")
	WebElement message;
	@FindBy (xpath="//h2[text()='Login to your account']")
	WebElement loginmessage;
	@FindBy (xpath="//*[text()='Your email or password is incorrect!']")
	WebElement errormsg;
	@FindBy (xpath="//*[text()='Email Address already exist!']")
	WebElement errormsg2;
			
	public void UserLogin(String user,String pwd) {
		loginemail.sendKeys(user);
		password.sendKeys(pwd);
		loginbtn.click();
	}
	
	public void UserSignup(String Name, String email) {
		name.sendKeys(Name);
		signupemail.sendKeys(email);
		Signupbtn.click();		
	}
	public void Message() {
		boolean signuptext=message.isDisplayed();
		if(signuptext) {
			System.out.println("'New User Signup!' is visible ");
		}else
		{
			System.out.println("'New User Signup!' is not visible ");
		}
	}
	public void LoginMessage() {
		boolean signuptext=loginmessage.isDisplayed();
		if(signuptext) {
			System.out.println("'Login to your account' is visible ");
		}else
		{
			System.out.println("'Login to your account' is not visible ");
		}
	}
	public void ErrorMessage() {
		boolean signuptext=errormsg.isDisplayed();
		if(signuptext) {
			System.out.println("'Your email or password is incorrect!' is visible ");
		}else
		{
			System.out.println("'Your email or password is incorrect!' is not visible ");
		}
	}
	public void ErrorMessage2() {
		boolean signuptext=errormsg2.isDisplayed();
		if(signuptext) {
			System.out.println("'Email Address already exist!' is visible ");
		}else
		{
			System.out.println("'Email Address already exist!' is not visible ");
		}
	}
	

}
