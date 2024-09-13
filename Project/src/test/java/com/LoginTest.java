package com;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.LoginPage;
import utill.Base;
import utill.ExcellReader;

public class LoginTest extends Base {
	
	
	@Test(dataProvider = "dp")
	public void login(String uname,String pass,String expected)
	{
		driver = connect();
		LoginPage log = new LoginPage(driver);
		log.enterUsername(uname);
		log.enterPassword(pass);
		log.login();
		
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			alert.accept();
			assertEquals(expected, text);
			
		} catch (Exception e) {
			
			String actualTitle = driver.getTitle();
			assertEquals(expected, actualTitle);
		}
	}
	
	@DataProvider(name="dp")
	public Object[][] setData()
	{
		ExcellReader rd = new ExcellReader("C:\\Users\\pc\\Desktop\\Test\\banktest.xlsx", "login");
		int rows = rd.rowCount();
		int cols = rd.colCount();
		Object obj[][] = new Object[rows-1][cols];
		
		for(int i=1;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				String data = rd.getdata(i, j);
				obj[i-1][j] = data;
			}
		}
	
		return obj;
	}
	
}
