package demo_pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadTHeFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		
//		driver.findElement(By.xpath("//input[@id='file-upload']")).click();
		Thread.sleep(1000);
		WebElement uploadElement=driver.findElement(By.xpath("//input[@id='file-upload']"));
		Thread.sleep(1000);
		uploadElement.sendKeys("C:\\Users\\ssanjay\\Downloads\\Rajsircartax.pdf");
		

	}

}
