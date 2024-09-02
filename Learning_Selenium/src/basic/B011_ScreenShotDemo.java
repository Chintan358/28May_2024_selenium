package basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import util.Driverconnection;

public class B011_ScreenShotDemo {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.connect("https://www.amazon.in");
		
		Driverconnection.screenShot(driver, "home");
		
		driver.findElement(By.linkText("Sell")).click();
		
		Driverconnection.screenShot(driver, "sell");
		
	}
}
