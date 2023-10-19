package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="cart_info_table")
	WebElement table;
	@FindBy (id="product-1")
	WebElement product1;
	@FindBy (id="product-2")
	WebElement product2;
	@FindBy (xpath="//*[text()='Shopping Cart']")
	WebElement shoppingcart;
	@FindBy(xpath="//a[text()='Proceed To Checkout']")
	WebElement checkout;
	@FindBy (xpath="//a[text()='Register / Login']")
	WebElement register;
	@FindBy (xpath="//h2[text()='Address Details']")
	WebElement addressdetails;
	@FindBy (xpath="//h2[text()='Review Your Order']")
	WebElement reviewurorder;
	@FindBy (xpath="//td[@class='cart_quantity']")
	WebElement quantity;
	@FindBy (name="message")
	WebElement message;
	@FindBy (xpath="//a[text()='Place Order']")
	WebElement placeorder;
	@FindBy (xpath="//td[@class='cart_delete']/a")
	WebElement delete;
	@FindBy (xpath="//b[text()='Cart is empty!']")
	WebElement cartisempty;
	
	public void ProductDetails() {
		System.out.println(product1.getText());
		System.out.println(product2.getText());
		
	}
	public void Quantity() {
		
		System.out.println(quantity.getText());
	}
	public void VerifyShoppingCart() {
		boolean shopping=shoppingcart.isDisplayed();
		if(shopping) {
			System.out.println("Cart page is displayed");
		}else {
			System.out.println("Cart page is not displayed");
		}
	}
	public void ProceedToCheckout() {
		checkout.click();
	}
	public void Register() {
		register.click();
	}
	public void AddressDetails() {
		boolean address=addressdetails.isDisplayed();
		if(address) {
			System.out.println("Address Details verified");
		}else {
			System.out.println("Wrong address details");
		}
	}
	public void ReviewurOrder() {
		boolean order=reviewurorder.isDisplayed();
		if(order) {
			System.out.println("Order details verified");
		}else {
			System.out.println("Order details not verified");
		}
	}
	public void Message() {
		message.sendKeys("Products are good");
	}
	public void PlaceOrder() {
		placeorder.click();
	}
	public void DeleteProduct() {
		delete.click();
	}
	public void CartisEmpty() {
		boolean message=cartisempty.isDisplayed();
		if(message) {
			System.out.println("Cart is empty,product is removed");
		}else {
			System.out.println("Cart is not empty,product is available");
		}
				
	}
	
}
