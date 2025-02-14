package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver = null;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id = "pass")
	WebElement pass;
	
	@FindBy(name="login")
	WebElement login;
	
	
	public void enterEmail(String useremail)
	{
		email.sendKeys(useremail);
	}
	
	public void enterPass(String userPass)
	{
		pass.sendKeys(userPass);
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
}
