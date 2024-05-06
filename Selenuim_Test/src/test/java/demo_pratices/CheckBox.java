package demo_pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");
		WebElement checkbox=driver.findElement(By.xpath("//span[@class='rct-node-icon']"));
		if(!checkbox.isSelected())
		{
			checkbox.click();
		}
		else
		{
			System.out.println("Test");
		}
	     

	}

}
