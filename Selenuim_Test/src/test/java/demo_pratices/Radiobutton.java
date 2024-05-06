package demo_pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//label[@class='custom-control-label']"));
		ele.click();
        String s=driver.findElement(By.xpath("//span[@class='text-success']")).getText();
        System.out.print(s);
	    if(s.equalsIgnoreCase("yes"))
	    {
	    	System.out.println("IF");
	    	driver.findElement(By.xpath("(//label[@for='impressiveRadio'])")).click();
	    }
	   

	}

}
