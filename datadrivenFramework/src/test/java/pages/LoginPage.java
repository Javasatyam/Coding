package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

import base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class LoginPage  {

	
		// TODO Auto-generated method stub
		@FindBy(name ="username")
		WebElement userNameTextBox;
		
		@FindBy(name ="password")
		WebElement passwordTextTextBox;
		
		@FindBy(xpath ="//button[@type='submit']")
		WebElement loginbutton;
		
		@FindBy(xpath ="//span[text()='Required']")
		WebElement passwordErrmassage;
		
		public  LoginPage()
		{
			PageFactory.initElements(Base.driver,this);
			
		}
		
		public String EnteringTheuserName(String userName)
		{
			userNameTextBox.sendKeys(userName);
			loginbutton.click();
			return passwordErrmassage.getText();
		}


}
