package util;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Driverconnection {
	public static WebDriver driver;
	public static WebDriver connect(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chintan_work\\seleniumdata\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		return driver;
	}
	
	
	public static void screenShot(String name)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source =  ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Chintan_work\\Files\\"+name+".png");
		
		try {
			Files.copy(source, dest);
			System.out.println("screenshot taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
