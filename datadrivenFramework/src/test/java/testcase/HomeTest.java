package testcase;

import org.testng.annotations.Test;

import pages.HomePage;

public class HomeTest {
	@Test
	public void LogoutfromPage() throws InterruptedException
	{
		HomePage s=new HomePage();
		Thread.sleep(2000);
		s.ClickingonProfileICon();
		s.Logout();
		
	}

}
