package swiching;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Driverconnection;

public class S003_windowSwitching {
	public static void main(String[] args) {
		
		
		WebDriver driver  = Driverconnection.connect("https://demo.guru99.com/popup.php");
		
		String mainWin = driver.getWindowHandle();
		//System.out.println("Main : "+mainWin);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> wins =  driver.getWindowHandles();
		for(String win : wins)
		{
			if(!win.equals(mainWin))
			{
				driver.switchTo().window(win);
			}
		}
		
		driver.findElement(By.name("emailid")).sendKeys("test@gmial.com");
		
		driver.findElement(By.name("btnLogin")).click();
		
//		driver.close();
//		driver.switchTo().window(mainWin);
//		driver.close();
		
		driver.quit();
	}
}
