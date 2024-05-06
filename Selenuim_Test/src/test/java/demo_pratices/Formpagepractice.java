package demo_pratices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Formpagepractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/automation-practice-form");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Satyam");
			driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("singh");
			driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("satyam@gimal.com");
			Thread.sleep(6000);
			//Gender selection
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
			
			WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")));
			element.click();
			//calendar dateOfBirthInput
			WebElement element1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dateOfBirthInput\"]")));
			element1.click();
       //			month selection
//			WebElement staticdropdwon = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
//		 	Thread.sleep(2000);
//
//		 	Select month=new Select(staticdropdwon);
//		 	month.selectByIndex(10);
	      // year selection
//	     WebElement staticdropdwon1 = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
//	        Select year=new Select(staticdropdwon1);
//	        year.selectByValue("1996");
//	        Thread.sleep(2000);
//	        driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[5]")).click();
	        String month;
	        String year;
			String value1="November"; 
			String value2="1996";
			 while(true)
			 {
	          String text=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]")).getText();
	          month=text.split("\\s")[0].trim();
	          year=text.split("\\s")[1].trim();
	          if(value1.equalsIgnoreCase(month)&&value2.equalsIgnoreCase(year))
	          {
	        	  break;
	          }
	          else
	          {
	            driver.findElement(By.xpath("document.querySelector(\"#dateOfBirth > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > button.react-datepicker__navigation.react-datepicker__navigation--previous\")")).click();
	          }
			 } 
			
			Thread.sleep(2000);
			driver.quit();
			
			
		
		
    


	
	}

}
