package utill;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Base {
	
		public static WebDriver driver = null;
		public WebDriver connect()
		{
			try {
				FileInputStream fis  =new FileInputStream("C:\\Chintan_work\\java\\28march_java\\Project_Test\\src\\main\\resources\\data.properties");
				Properties prop = new Properties();
				prop.load(fis);
				
				String browser = prop.getProperty("browser");
				String url = prop.getProperty("url");
				
				if(browser.equals("chrome"))
				{
					System.setProperty("webdriver.chrome.driver", "C:\\Chintan_work\\seleniumdata\\chromedriver-win64\\chromedriver.exe");
					 driver = new ChromeDriver();
				
					
				}
				else if(browser.equals("ff"))
				{
					System.setProperty("webdriver.gecko.driver", "C:\\Chintan_work\\seleniumdata\\geckodriver.exe");
					 driver = new FirefoxDriver();
					
					
				}
				else if(browser.equals("edge"))
				{
					System.setProperty("webdriver.edge.driver", "C:\\Chintan_work\\seleniumdata\\msedgedriver.exe");
					 driver = new EdgeDriver();
				}
				
				driver.get(url);
			
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
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
