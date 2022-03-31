package Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageClass.LoginPage;

public class LoginTest extends BaseTest {


	public LoginPage lp;
	
	@Test 
	  public void login() throws InterruptedException {
	
		// WebDriver driver = null;
		lp=new LoginPage(driver);
			lp.login("Admin", "admin123");
			
	//	Assert.assertTrue(false);
	  }
	

}
