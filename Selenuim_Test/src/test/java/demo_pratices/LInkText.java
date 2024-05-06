package demo_pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LInkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='simpleLink']")).click();
		String newTitle=driver.getTitle();
		System.out.println(newTitle);

	}

}
