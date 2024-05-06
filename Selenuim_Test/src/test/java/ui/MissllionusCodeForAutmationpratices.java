package ui;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MissllionusCodeForAutmationpratices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//		driver.get("https://jqueryui.com/dialog/");
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//button[@title='Close']")).click();
//		driver.switchTo().defaultContent();
		// Nasseted Frame 
//        driver.get("https://the-internet.herokuapp.com/nested_frames");
//        driver.switchTo().frame("frame-top");
//        driver.switchTo().frame("frame-middle");
//        WebElement e=driver.findElement(By.xpath("//div[@id='content']"));
//        System.out.println(e.getText());
//        driver.switchTo().parentFrame();
//        driver.switchTo().defaultContent();
		//Multipal Window Handel 
		driver.get("https://the-internet.herokuapp.com/windows");
		String current =driver.getWindowHandle();
		driver.findElement(By.linkText("Click Here"));
		
		      Set<String> allwindow = driver.getWindowHandles();
		for(String s2:allwindow)
		{
			if(!s2.equalsIgnoreCase(current))
			{
				driver.switchTo().window(s2);
			}
		}
		driver.findElement(By.className("example")).click();
		
        
        
        
	}

}
