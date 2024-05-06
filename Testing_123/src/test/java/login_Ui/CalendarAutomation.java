package login_Ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		try 
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		}
		catch(Exception e)
		{
			System.out.println("Pop not foud");
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[3]")).click();
		String month;
		String year;
		String value1="October";
		String Value2="2024";
		
		 while(true)
		 {
          String text=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div")).getText();
          month=text.split("\\s")[0].trim();
          year=text.split("\\s")[1].trim();
          if(value1.equalsIgnoreCase(month)&&Value2.equalsIgnoreCase(year))
          {
        	  break;
          }
          else
          {
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
          }
		 } 
	}

}
