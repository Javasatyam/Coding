package sampleapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiTest {

	public static WebDriver driver;
	public static String browser = "chrome";
	public static String One_login_url="https://airbusval.onelogin.com/";
	public static String Dev_url="https://mytrainingauthoring-dev.airbus-v.com/";

	public static void main(String[] args) throws InterruptedException {
	
		
		// TODO Auto-generated method stub
        
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//(//*[@id="root"]/div/div[2]/div[1]/div[2]/form/div/div[3]/div/button)
		driver.get("https://mytrainingauthoring-dev.airbus-v.com/");
		String One_url= driver.getCurrentUrl();
		String One_suburl=One_url.substring(0,31);
		String My_url=driver.getCurrentUrl();
		String Submy_url=My_url.substring(0,31);
		if(Dev_url.equalsIgnoreCase(Submy_url))
		{
			
		}
		else if(One_login_url.equalsIgnoreCase(One_suburl))
		{
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("SSINO3YE");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[3]/form/div/div[3]/div/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Welcomesopra@958240");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[3]/form/div/div[3]/div/button")).click();
	      
			
		}
		// driver.findElement(By.linkText("Automobile")).click();
		driver.findElement(By.xpath(""));
		
		
        
	}

}
