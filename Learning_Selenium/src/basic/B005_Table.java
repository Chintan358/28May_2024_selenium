package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class B005_Table {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		
//		WebElement element =  driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[1]"));
//		System.out.println(element.getText());
		
//		List<WebElement> elements1 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
//		
//		for(WebElement ele  :elements1)
		
		
		
//		{
//			System.out.println(ele.getText());
//		}
//		
//		List<WebElement> elements = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
//		
//		for(WebElement ele  :elements)
//		{
//			System.out.println(ele.getText());
//		}
//		
	
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
		for(int i=2;i<=rows.size();i++)
		{
			List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td"));
			for(WebElement col  :cols)
			{
				System.out.print(col.getText()+" ");
			}
			System.out.println();
		}
		
		
	}
}
