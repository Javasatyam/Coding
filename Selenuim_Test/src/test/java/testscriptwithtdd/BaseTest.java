package testscriptwithtdd;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import page.action.CartPage;
import page.action.CheckoutPage;
import page.action.LandingPage;
import page.action.ProductCatalog;

public class BaseTest {
	 WebDriver driver;
	public WebDriver initializeDriver() throws IOException 
	  {
		Properties prop = new Properties();
	    FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
	            + "//src//test//java//resources//Golbal.properties");
	    
	    WebDriverManager.chromedriver().setup();
	    prop.load(fis);
	    String browser = prop.getProperty("browser");

	    if (browser.equalsIgnoreCase("chrome")) { // Corrected the browser comparison
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	    } else if (browser.equalsIgnoreCase("firefox")) {
	        WebDriverManager.firefoxdriver().setup(); // Use WebDriverManager for Firefox
	        driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	    }

	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    return driver;
}
	public LandingPage lunchaningapp() throws IOException
	{
		driver= initializeDriver();
		LandingPage page=new LandingPage(driver);
		page.Goto();
		return page;
	}
		
}


