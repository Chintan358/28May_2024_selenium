package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Driverconnection;

public class Datadriven {

	WebDriver driver=null;
	@BeforeClass
	public void setUp()
	{
		driver = Driverconnection.connect("https://www.fb.com");
	}
	
	@Test(dataProvider = "dp")
	public void test(String userEmail, String userPass)
	{
		
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));
		
		email.clear();
		email.sendKeys(userEmail);
		pass.clear();
		pass.sendKeys(userPass);
		login.click();
		
		driver.navigate().back();
	}
	
	@DataProvider(name="dp")
	public Object[][] getData()
	{
		
		ExcellReader rd = new ExcellReader("C:\\Users\\pc\\Desktop\\Test\\28march.xlsx", "login");
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
