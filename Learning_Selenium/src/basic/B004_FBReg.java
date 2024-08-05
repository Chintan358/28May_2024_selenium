package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B004_FBReg {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chintan_work\\seleniumdata\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		WebElement signup =  driver.findElement(By.linkText("Create new account"));
//		signup.click();
		
		driver.findElement(By.linkText("Create new account")).click();
		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		driver.findElement(By.name("firstname")).sendKeys("Nikunj");
		driver.findElement(By.name("lastname")).sendKeys("Kava");
		driver.findElement(By.name("reg_email__")).sendKeys("9685968563");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test@123");
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("17");
		//days.selectByValue("17");
		//days.selectByIndex(16);
		
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByVisibleText("May");
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByVisibleText("2015");
		
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
//		System.out.println(gender.size());
		gender.get(1).click();
		
		driver.findElement(By.name("websubmit")).click();
		
	}
}
