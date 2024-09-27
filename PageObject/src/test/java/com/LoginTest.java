package com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LoginPageFactory;
import util.Driverconnection;

public class LoginTest {
	
	
		@Test
		public void test()
		{
			WebDriver driver = Driverconnection.connect("https://www.fb.com");
			//LoginPage lg = new LoginPage(driver);
			LoginPageFactory lg = new LoginPageFactory(driver);
			lg.enterEmail("test@gmail.com");
			lg.enterPass("test");
			lg.login();
		}
	
	
}
