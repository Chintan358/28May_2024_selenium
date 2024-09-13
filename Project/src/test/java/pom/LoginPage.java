package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By username = By.name("uid");
	By password = By.name("password");
	By login = By.name("btnLogin");
	
	
	public void enterUsername(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void login()
	{
		driver.findElement(login).click();
	}
	
	
}
