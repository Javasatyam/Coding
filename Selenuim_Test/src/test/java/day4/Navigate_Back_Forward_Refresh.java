package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import day1.Basecase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_Back_Forward_Refresh extends Basecase {
	
	
	
	@Test
	public void Test() throws InterruptedException
	{
      driver.get("https://www.flipkart.com/");
      Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobile");
      driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
      Thread.sleep(3000);
      driver.navigate().back();
      Thread.sleep(3000);
      driver.navigate().forward();
      Thread.sleep(3000);
      driver.navigate().refresh();
	}
	
}
