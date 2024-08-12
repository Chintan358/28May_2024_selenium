package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class B009_Tagname {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect("https://www.fb.com");
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement link : links)
		{
			System.out.println(link.getText());
		}
		
		
	}
}
