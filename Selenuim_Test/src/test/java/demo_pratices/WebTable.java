
package demo_pratices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
//	public static WebDriver driver;

	void rowPriting()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		List<WebElement> value=driver.findElements(By.xpath("//div[@class='rt-resizable-header-content']"));
		for(WebElement web:value)
		{
			System.out.println(web.getText());
		}
		
	}
	void SearchProduct() {
	
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("Satyam");
		Thread.sleep(2000);
		String value=driver.findElement(By.xpath("(//div[@class='rt-tr-group'])[4]/child::div/child::div/child::span")).getText();
		System.out.println(value);
		
		//input[@id='searchBox']
//		WebTable call=new WebTable();
//		call.SearchProduct();
	

	}

}
