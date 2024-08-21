package swiching;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class S004_Frame1 {
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.connect("https://demo.automationtesting.in/Frames.html");
		
		
		//List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		//System.out.println(frames.size());
		
		//driver.switchTo().frame(1);
		//driver.switchTo().frame("name");
		
		WebElement frame = driver.findElement(By.id("singleframe"));
		//driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("test");
	}
}
