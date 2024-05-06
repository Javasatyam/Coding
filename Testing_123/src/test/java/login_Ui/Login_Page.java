package login_Ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Page {
	public static WebDriver driver;
	public static String browser = "chrome";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver =new ChromeDriver();
		}
	 else if (browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.7.2");
		driver.findElement(By.xpath("//*[@id=\"query\"]")).sendKeys("ca");
		driver.findElement(By.xpath("/html/body/header/div[2]/form/input[2]")).click();
	}

}