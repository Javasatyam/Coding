package page.Abstractcommanmenthod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstractcomponent {
	WebDriver driver;
      public Abstractcomponent(WebDriver driver) {
		// TODO Auto-generated constructor stub
    	  this.driver=driver;
	}
	public void waitforelement(By FindBy)
      {
    	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
    	  wait.until(ExpectedConditions.visibilityOfElementLocated(FindBy));
      }
	public void waitForElementToDisappear(WebElement ele) throws InterruptedException
	{
		//Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.invisibilityOf(ele));

	}
}
