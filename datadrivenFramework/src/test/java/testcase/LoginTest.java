package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import pages.LoginPage;

public class LoginTest extends Base {
  @Test
	public void LoginwithValidPassword()
	{
		LoginPage s=new LoginPage();
		String error_massage=s.EnteringTheuserName("Admin");
		Assert.assertEquals(error_massage, "Required");
	}
}
