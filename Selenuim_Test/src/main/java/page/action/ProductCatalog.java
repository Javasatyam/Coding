package page.action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import page.Abstractcommanmenthod.Abstractcomponent;

public class ProductCatalog extends Abstractcomponent {
   
	WebDriver driver;
	public ProductCatalog(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Locater
	@FindBy(css=".mb-3")
	List<WebElement> product;
	@FindBy(css = ".ng-animating")
	WebElement spinner;

	
	By productBy=By.cssSelector(".mb-3");
	By productsBy = By.cssSelector(".mb-3");
	By addToCart = By.cssSelector(".card-body button:last-of-type");
	By toastMessage = By.cssSelector("#toast-container");

	public List<WebElement> getProductList()
	{
		waitforelement(productBy);
		return product;
		
	}
	public WebElement getProductByName(String productName)
	{
		WebElement prod =	getProductList().stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		return prod;
	}
	public void addProductToCart(String productName) throws InterruptedException
	{
		WebElement prod = getProductByName(productName);
		prod.findElement(addToCart).click();
		waitforelement(toastMessage);
		waitForElementToDisappear(spinner);


	}
	
	
}
