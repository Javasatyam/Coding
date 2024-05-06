package dropDwon;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class Base
{
	public void xyz()
	{
		System.out.print("I am Base class");
	}
}
public class Staticdropdown  {
	
	public void xyz()
	{
		System.out.print("I am child class");
	}

	public static void main(String[] args) {
		
		
		Base s1=new Base();
		s1.xyz();
	}

}
