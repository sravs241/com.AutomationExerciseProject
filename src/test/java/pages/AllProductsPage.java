package pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllProductsPage {
	WebDriver driver;
	public AllProductsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//h2[text()='All Products']")
	WebElement products;
	@FindBy (id="quantity")
	WebElement quantity;
	@FindBy (xpath="(//a[text()='View Product'])[1]")
	WebElement viewproduct;
	@FindBy (xpath="//div[@class='product-information']/p")
	List<WebElement> productinfo;
	@FindBy (id="search_product")
	WebElement searchproduct;
	@FindBy (xpath="//h2[text()='Searched Products']")
	WebElement searchedproduct;
	@FindBy (id="submit_search")
	WebElement submitbtn;
	@FindBy (xpath="//*[text()='Add to cart']")
	WebElement addtoCart;
	@FindBy (xpath="//button[text()='Continue Shopping']")
	WebElement Continuebtn;
	@FindBy (xpath="(//div[@class='single-products'])[1]")
	WebElement bluetop;
	@FindBy (xpath="(//div[@class='single-products'])[2]")
	WebElement menTshirt;
	@FindBy (xpath="//button[@class='btn btn-default cart']")
	WebElement AddtoCart;
	@FindBy (xpath="//h2[text()='Women - Dress Products']")
	WebElement womencategoryproducts;
	@FindBy (xpath="//h2[text()='Men - Tshirts Products']")
	WebElement mencategoryproducts;
	@FindBy (xpath="//h2[text()='Brands']")
	WebElement brand;
	@FindBy (xpath="//a[text()='Polo']")
	WebElement polobrand;
	@FindBy (xpath="//h2[text()='Brand - Polo Products']")
	WebElement polobrandproducts;
	@FindBy (xpath="//a[text()='H&M']")
	WebElement HMbrand;
	@FindBy (xpath="//h2[text()='Brand - H&M Products']")
	WebElement HMbrandproducts;
	@FindBy (xpath="//a[text()='Write Your Review']")
	WebElement writeurReview;
	@FindBy (id="name")
	WebElement name;
	@FindBy (id="email")
	WebElement email;
	@FindBy (id="review")
	WebElement review;
	@FindBy (id="button-review")
	WebElement submit;
	@FindBy (xpath="//*[text()='Thank you for your review.']")
	WebElement thankyou;
	
	
	public void Review() {
		name.sendKeys("test");
		email.sendKeys("qatest1@gmail.com");
		review.sendKeys("All products are good");
		submit.click();
	}
	public void ThankyouMessage() {
		boolean message=thankyou.isDisplayed();
		if(message) {
			System.out.println("'Thank you for your review.' is verified");
		}else {
			System.out.println("'Thank you for your review.' is notverified");
		}
	}

	public void BrandsView() {
		boolean brands=brand.isDisplayed();
		if(brands) {
			System.out.println("Brands are visible on left side bar");
		}else {
			System.out.println("Brands are not visible on left side bar");
		}
	}
	public void PoloBrand() {
		polobrand.click();
		boolean polobrandview=polobrandproducts.isDisplayed();
		if(polobrandview) {
			System.out.println("Polo brand products are displayed");
		}else {
			System.out.println("Polo brand products are not displayed");
		}
	}
	public void HMBrand() {
		HMbrand.click();
		boolean hmbrandview=HMbrandproducts.isDisplayed();
		if(hmbrandview) {
			System.out.println("H&M brand products are displayed");
		}else {
			System.out.println("H&M brand products are not displayed");
		}
	}
	public void AddToCartView() {
		addtoCart.click();
	}
	
	public void VerifyProducts() throws InterruptedException {
		
		boolean title=products.isDisplayed();
		if(title) {
			System.out.println("Navigated to ALL PRODUCTS page successfully");
		}else {
			System.out.println("Wrong page");
		}
		
		
	}
	public void Quantity() {
		quantity.clear();
		quantity.sendKeys("4");
		AddtoCart.click();
		Continuebtn.click();
	}
	public void ProductInformation() throws InterruptedException {
		
		viewproduct.click();
		List<WebElement> details=productinfo;
		for(int i=0;i<details.size();i++) {
			System.out.println(details.get(i).getText());
		}
	}
	public void SearchProduct() {
		searchproduct.sendKeys("Stylish Dress");
		submitbtn.click();
		boolean title=searchedproduct.isDisplayed();
		if(title) {
			System.out.println("Searched Products are visible");
		}else {
			System.out.println("Searched products are not visible");
		}
	}
	public void AddToCart() {
		Actions a = new Actions(driver);
		a.moveToElement(bluetop).build().perform();
		addtoCart.click();
		Continuebtn.click();
		a.moveToElement(menTshirt).build().perform();
		addtoCart.click();
		Continuebtn.click();
	}
	public void WomenProducts() {
		boolean categoryproduct=womencategoryproducts.isDisplayed();
		if(categoryproduct) {
			System.out.println("Women - Dress Products are verified");
		}else {
			System.out.println("Women - Dress Products are not verified");
		}
	}
	public void MenProducts() {
		boolean categoryproduct=mencategoryproducts.isDisplayed();
		if(categoryproduct) {
			System.out.println("Men - Tshirts Products are verified");
		}else {
			System.out.println("Men - Tshirts Products are not verified");
		}
	}
	public void ViewProduct() {
		viewproduct.click();
	}
}
