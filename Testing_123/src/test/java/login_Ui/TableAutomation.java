package login_Ui;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TableAutomation {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> allheader=driver.findElements(By.xpath("//table[@class='dataTable']/descendant::th"));
		List<WebElement> allrow=driver.findElements(By.xpath("//table[@class='dataTable']/descendant::tr/td"));
//		System.out.print(allheader.size());
//		System.out.print(allrow.size());
		int x=allheader.size();
		int y=5;

		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		for(WebElement e:allheader)
		{
			
		}
		
	}
}
