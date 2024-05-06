package demo_pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
//	    Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Satyam Singh");
//	    driver.findElement(By.id("userEmail")).sendKeys("name@gmail.com"); //
//	    driver.findElement(By.id("currentAddress")).sendKeys("New Delhi");
//	    driver.findElement(By.id("permanentAddress")).sendKeys("New Delhi");
//	    driver.findElement(By.id("submit")).click();
	    

	}

}
