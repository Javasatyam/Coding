package login_Ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MMT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//String searchValue="induction";
		String Selmonth="November";
		String Seleyear="1996";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		//For scrolling down 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("first_date_picker")).click();
		while(true)
		{
			String month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			String year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(Selmonth.equalsIgnoreCase(month)&&Seleyear.equalsIgnoreCase(year))
			{
			    break;	
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
			}
		}
		driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='21']")).click();
		
	}
}
