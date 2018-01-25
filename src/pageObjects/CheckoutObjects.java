package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CheckoutObjects {
	protected WebDriver driver;

	public CheckoutObjects(WebDriver _driver) {
		this.driver = _driver;
	}

	@FindBy(xpath="//*[@id='menu-item-2213']/a")
	private WebElement linkWoman;
	
	@FindBy(xpath="//*[@id='menu-item-2235']/a")
	private WebElement linkJackets;
	
	@FindBy(xpath = "//*[@id='noo-site']/div[2]/div[2]/div[1]/div/div[1]/div/h3/a")
	private WebElement linkJacketItem;
	
	@FindBy(xpath = "//*[@id='product-1871']/div[1]/div[2]/form/div/div/button[2]/i")
	private WebElement iconIncreaseQuantity;
	
	@FindBy(xpath = "//*[@id='product-1871']/div[1]/div[2]/form/button")
	private WebElement btnAddToCart;
	
	@FindBy(xpath = "//*[@id='nav-menu-item-cart']/a/span/i")
	private WebElement iconCart;
	
	@FindBy(xpath = "//*[@id='nav-menu-item-cart']/div/div[3]/div[2]/a[2]")
	private WebElement btnCheckout;
	
	public void selectItem(){
		Actions action = new Actions(driver);
		action.moveToElement(linkWoman).build().perform();
		linkJackets.click();
		linkJacketItem.click();
	}
	
	public void increaseQuantity(){
		((JavascriptExecutor) driver).executeScript("scroll(0,300);");
		iconIncreaseQuantity.click();
	}
	
	public void clickAddToCartButton(){
		btnAddToCart.click();
	}

	public void checkout(){
		Actions action1 = new Actions(driver);
		action1.moveToElement(iconCart).build().perform();
		btnCheckout.click();
	}
}