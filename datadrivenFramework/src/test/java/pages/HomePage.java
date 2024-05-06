package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class HomePage {
 
	@FindBy(xpath ="//p[@class='oxd-userdropdown-name']")
	WebElement ProfileICon; 
	
	@FindBy(xpath ="//a[normalize-space()='Logout']")
	WebElement Logout;
	
	public HomePage()
	{
		PageFactory.initElements(Base.driver,this);
	}
	public void ClickingonProfileICon()
	{
		ProfileICon.click();
	}
	public void Logout()
	{
		Logout.click();
	}
	

}
