package page.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import page.Abstractcommanmenthod.Abstractcomponent;

public class LandingPage extends Abstractcomponent {
   
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Locater
	@FindBy(id="userEmail")
	WebElement Username;
	@FindBy(id="userPassword")
	WebElement Passowrd;
	@FindBy(id="login")
	WebElement Loginbutton;
	public ProductCatalog loginpage(String email, String pass)
	{
		Username.sendKeys(email);
		Passowrd.sendKeys(pass);
		Loginbutton.click();
		ProductCatalog ProductCatalog = new ProductCatalog(driver);
		return ProductCatalog;
	}
	public void Goto()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
}
