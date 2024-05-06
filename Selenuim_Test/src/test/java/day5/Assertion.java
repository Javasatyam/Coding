package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import day1.Basecase;

public class Assertion extends Basecase {
	
	@Test
	public void asset()
	{
		 driver.get("https://www.google.com/");
		 WebElement se = driver.findElement(By.xpath("(//center/input)[3]"));
		 Assert.assertTrue(se.isDisplayed(), "Button is not display");
		 System.out.println("Is the button Display ?" +se.isDisplayed());
	}
	

}
