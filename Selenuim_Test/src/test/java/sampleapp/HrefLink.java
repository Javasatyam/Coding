package sampleapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HrefLink {
	public static WebDriver driver;
	public static String browser = "chrome";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		driver.get("http://sampleapp.tricentis.com/101/index.php");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		 for( WebElement x : link)
		 {
			System.out.println(x.getAttribute("href")); 
		 }

	}

}
