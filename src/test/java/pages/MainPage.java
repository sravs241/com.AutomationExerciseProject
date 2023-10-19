package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	WebDriver driver;
	public MainPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()=' Signup / Login']")
	WebElement signup;
	@FindBy (xpath="//*[text()=' Contact us']")
	WebElement contactus;
	@FindBy (xpath="//a[text()=' Logged in as ']/b[text()='QA Engineer']")
	WebElement loginwithUser;
	@FindBy (xpath="//*[text()=' Delete Account']")
	WebElement deleteacc;
	@FindBy (xpath="//*[text()=' Logout']")
	WebElement logout;
	@FindBy (xpath="//*[text()=' Test Cases']")
	WebElement testcase;
	@FindBy (xpath="//a[text()=' Products']")
	WebElement product;
	@FindBy (id="susbscribe_email")
	WebElement subscriptionmail;
	@FindBy (id="subscribe")
	WebElement btn;
	@FindBy(xpath="//div[text()='You have been successfully subscribed!']")
	WebElement subscribe;
	@FindBy (xpath="//*[text()=' Cart']")
	WebElement cart;
	@FindBy (xpath="//*[text()='View Product']")
	WebElement viewproduct;
	@FindBy (xpath="//h2[text()='Category']")
	WebElement category;
	@FindBy (xpath="(//h4[@class='panel-title']/a)[1]")
	WebElement women;
	@FindBy (xpath="(//div[@id='Women']/div/ul/li/a)[1]")
	WebElement dress;
	@FindBy (xpath="(//h4[@class='panel-title']/a)[2]")
	WebElement men;
	@FindBy (xpath="(//div[@id='Men']/div/ul/li/a)[1]")
	WebElement tshirts;
	@FindBy (xpath="//h2[text()='recommended items']")
	WebElement recommendeditem;
	@FindBy (xpath="//a[@class='btn btn-default add-to-cart'][1]")
	WebElement addtocart;
	@FindBy (xpath="//a[text()='View Cart']")
	WebElement viewcart;
	
	public void RecommendedItem() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		boolean message=recommendeditem.isDisplayed();
		if(message) {
			System.out.println("'RECOMMENDED ITEMS' are visible");
		}else {
			System.out.println("'RECOMMENDED ITEMS' are not visible");
		}
	}
	public void ViewCart() {
		viewcart.click();
	}
	public void AddtoCart() {
		addtocart.click();
	}
	public void signupbtn() {
		signup.click();
	}
	public void ContactUs() {
		contactus.click();
	}
	public void TestCase() {
		testcase.click();
	}
	public void Product() {
		product.click();
	}
	public void Cart() {
		cart.click();
	}
	public void ViewProduct() {
		viewproduct.click();
	}
	public void Subscription() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		subscriptionmail.sendKeys("abc@gmail.com");
		btn.click();
		boolean message=subscribe.isDisplayed();
		if(message) {
			System.out.println("You have been successfully subscribed! is visible");
		}else {
			System.out.println("You have been successfully subscribed! is not visible");
		}
	}
	public void LoginwithUserId() {
		//Verify that 'Login with userid' is visible
		boolean accountinfo=loginwithUser.isDisplayed();
		if(accountinfo) {
			System.out.println("'Logged in as username' is visible ");
		}else
		{
			System.out.println("'Logged in as username' is not visible ");
		}
	}
	public void Delete() {
		deleteacc.click();
	}
	public void Logout() {
		logout.click();
	}
	public void Categoryview() {
		boolean categoryview=category.isDisplayed();
		if(categoryview)
		{
			System.out.println(" Categories are visible on left side bar");
		}else {
			System.out.println(" Categories are not visible on left side bar");
		}
	}
	public void WomenProducts() {
		
		women.click();
		dress.click();
		}
	public void MenProducts() {
		men.click();
		tshirts.click();
		}

}
