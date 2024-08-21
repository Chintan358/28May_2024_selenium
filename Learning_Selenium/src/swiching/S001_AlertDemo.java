package swiching;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Driverconnection;

public class S001_AlertDemo {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = Driverconnection.connect("https://demo.automationtesting.in/Alerts.html");
		
//		driver.findElement(By.id("OKTab")).click();
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
//		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
//		driver.findElement(By.id("CancelTab")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
		
		
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.id("Textbox")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Nikunj");
		Thread.sleep(5000);
		alert.accept();
		
	}
	
}
