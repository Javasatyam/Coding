package ui;
import java.time.Duration;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Ui_Test {
	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/index.html#");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//a[@id='login2']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("Satyam");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
		alert.accept();
		 options.addArguments("--disable-notifications");
		try
		{
		   	
		}
		catch(Exception e)
		{
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//a[contains(text(),'Sony vaio i5')]")).click();
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
	   
	     
//		WebElement e=driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
//		Actions action=new Actions(driver);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		action.moveToElement(e).click().perform();
}
}
