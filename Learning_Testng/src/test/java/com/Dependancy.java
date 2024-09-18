package com;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Dependancy {
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login...");
		//assertEquals(10, 20);
	}
	
	@Test(priority = 2,dependsOnMethods = "login")
	public void home()
	{
		System.out.println("Home...");
	}
	
	@Test(priority = 3,dependsOnMethods = "home")
	public void logout()
	{
		System.out.println("logout...");
	}
}
