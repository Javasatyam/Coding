package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basecase {
	public static WebDriver driver;
	@BeforeTest
	public void steup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
//	@BeforeClass
//	public static void dropdown_handel(WebElement staticdropdwon)
//	{
//		Select drop=new Select(staticdropdwon);
//		drop.selectByIndex(2);
//	}
	
	
//	public void run() throws InterruptedException
//	{
////		driver.get("https://www.moneycontrol.com/");
////		
////		String commdity [] = {"Gold","Silver","Crudeoil"};
////		for(String com : commdity)
////		{
////			Thread.sleep(1000);		
////		String xyz=driver.findElement(By.xpath("(//table[@class='rhsglTbl'])[13]/tbody/tr/td/a[contains(text(),'"+com+"')]//following::td[1]")).getText();
////		System.out.println(com+"--"+xyz);
////		}
//		
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.linkText("/account/login?ret=/")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//	}
	@AfterTest
	public void quit() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit(); 
	}
	
}
