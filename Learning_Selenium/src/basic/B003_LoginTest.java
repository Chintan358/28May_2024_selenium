package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B003_LoginTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chintan_work\\seleniumdata\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		WebElement email =  driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));
		
		
		email.sendKeys("test@gmail.com");
		pass.sendKeys("test123");
		login.click();
		
		
	}
}
