package PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	//object repositories
	
	
	@FindBy(id="txtUsername")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='txtPassword']")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='btnLogin']")
	private WebElement loginButton;
	
	
	
	//Intialise the weblement
	public LoginPage(WebDriver driver) {
		
	
		PageFactory.initElements(driver, this);
	}
	
	//actions on webelemnt
	public void login(String user, String pass) {
		
		username.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();
	}
	

}