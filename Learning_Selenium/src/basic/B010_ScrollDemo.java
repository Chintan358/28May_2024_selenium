package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class B010_ScrollDemo {
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.connect("https://www.fb.com");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement abt = driver.findElement(By.linkText("About"));
		
		//js.executeScript("window.scrollBy(0,150)");
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView();", abt);
	}
}
