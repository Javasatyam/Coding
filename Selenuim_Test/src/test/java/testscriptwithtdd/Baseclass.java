package testscriptwithtdd;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.action.CartPage;
import page.action.CheckoutPage;
import page.action.LandingPage;
import page.action.ProductCatalog;

public class Baseclass extends BaseTest {

	@Test
	public void submitOrder() throws IOException, InterruptedException
	{
		// TODO Auto-generated method stub
		String productName="ZARA COAT 3";
		WebDriverManager.chromedriver().setup();
		
		
		LandingPage Loging=lunchaningapp();
		ProductCatalog productCatalog=Loging.loginpage("sat.s96.singh@gmail.com","91821692@Sa");
		
		List<WebElement> product =productCatalog.getProductList();
		productCatalog.addProductToCart(productName);
		
		CartPage cart=new CartPage(driver);
		Boolean match=cart.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		
   // CheckoutPage checkoutPage = CartPage.goToCheckout();
	}

}
