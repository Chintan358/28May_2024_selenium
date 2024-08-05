package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B002_TitleCheck {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chintan_work\\seleniumdata\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "FaceBook | Login";
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
		Thread.sleep(5000);   
		
		
		
		
		driver.close();
		
		
	}
}
