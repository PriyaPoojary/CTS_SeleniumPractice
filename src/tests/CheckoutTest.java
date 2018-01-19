package tests;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import pageObjects.CheckoutObjects;
import testdata.InitializeBrowser;

public class CheckoutTest extends InitializeBrowser {
	
	@Test
	public void ChooseItemAndCheckoutTest(){
		CheckoutObjects hpo = PageFactory.initElements(driver, CheckoutObjects.class);
		hpo.selectItem(driver);
		hpo.increaseQuantity(driver);
		hpo.clickAddToCartButton();
		hpo.checkout(driver);
	}
}