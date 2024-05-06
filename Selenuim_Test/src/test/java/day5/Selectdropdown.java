package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import day1.Basecase;

public class Selectdropdown extends Basecase {

	@Test
	public void staticdropdown() throws InterruptedException
	{
	 	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	 	WebElement staticdropdwon = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	 	Thread.sleep(2000);
//	 	Basecase.dropdown_handel(staticdropdwon);
	 	Select drop=new Select(staticdropdwon);
        drop.selectByIndex(2);
	}
	

}
