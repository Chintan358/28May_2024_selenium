package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hybrid {

			WebDriver driver = null;
	.
			@Test(dataProvider = "dp")
			public void test(String function,String keyword, String locator, String location, String data)
			{
//				System.out.println(function+" "+keyword+" "+locator+" "+location+" "+data);
				
				if(keyword.equals("browser"))
				{
					if(data.equals("chrome"))
					{
						System.setProperty("webdriver.chrome.driver", "C:\\Chintan_work\\seleniumdata\\chromedriver-win64\\chromedriver.exe");
						 driver = new ChromeDriver();
					
						
					}
					else if(data.equals("ff"))
					{
						System.setProperty("webdriver.gecko.driver", "C:\\Chintan_work\\seleniumdata\\geckodriver.exe");
						 driver = new FirefoxDriver();
						
						
					}
					else if(data.equals("edge"))
					{
						System.setProperty("webdriver.edge.driver", "C:\\Chintan_work\\seleniumdata\\msedgedriver.exe");
						 driver = new EdgeDriver();
					}
				}
				else if(keyword.equals("url"))
				{
					driver.get(data);
				}
				else if(keyword.equals("type"))
				{
					if(locator.equals("id"))
					{
						driver.findElement(By.id(location)).sendKeys(data);
					}
					else if(locator.equals("name"))
					{
						driver.findElement(By.name(location)).sendKeys(data);
					}
					else if(locator.equals("xpath"))
					{
						driver.findElement(By.xpath(location)).sendKeys(data);
					}
				}
				else if(keyword.equals("click"))
				{
					if(locator.equals("id"))
					{
						driver.findElement(By.id(location)).click();
					}
					else if(locator.equals("name"))
					{
						driver.findElement(By.name(location)).click();
					}
					else if(locator.equals("xpath"))
					{
						driver.findElement(By.xpath(location)).click();
					}
				}
				else if(keyword.equals("select"))
				{
					if(locator.equals("id"))
					{
						
					 new Select(driver.findElement(By.id(location))).selectByVisibleText(data);

					}
					else if(locator.equals("name"))
					{
						new Select(driver.findElement(By.name(location))).selectByVisibleText(data);
					}
					else if(locator.equals("xpath"))
					{
						new Select(driver.findElement(By.xpath(location))).selectByVisibleText(data);
					}
				}
				
				
				
				
			}
			
			
			@DataProvider(name="dp")
			public Object[][] getData()
			{
				
				ExcellReader rd = new ExcellReader("C:\\Users\\pc\\Desktop\\Test\\28march.xlsx", "erp");
				int row = rd.rowcount();
				int col = rd.colcount();
				Object obj[][] = new Object[row-1][col];
				
				for(int i=1;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
						String data = rd.getData(i, j);
						obj[i-1][j] = data;
					}
				}
				
				return obj;
			}
}
