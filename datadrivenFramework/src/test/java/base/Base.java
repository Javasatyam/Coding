package base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static Properties p=new Properties();
	public static FileReader fs;
	public static WebDriver driver; 
	@BeforeSuite
	public void SetUp() throws IOException, InterruptedException
	{
		
			FileReader fs=new FileReader(System.getProperty("user.dir")+"/src/test/resources/configfiles/config.properties");
			Properties p=new Properties();
	        p.load(fs);
		
		if(p.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssanjay\\Downloads\\New folder (2)\\chromedriver.exe");
			 driver=new ChromeDriver();
			
			 driver.get(p.getProperty("testurl"));
			 Thread.sleep(5000);
		}
		else if(p.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssanjay\\Downloads\\New folder (2)\\chromedriver.exe");
			 driver=new FirefoxDriver();
			driver.get(p.getProperty("testurl"));
		}
		
	}
	@AfterSuite
	public void TearDown()
	{
		driver.quit();
		System.out.println("Tear Down");
	}
}
