package basic;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Account {
	
	@Test(groups = "sanity")
	public void savingAccount()
	{
		assertTrue(false);
		System.out.println("runing saving acoount...");
	}
	
	@Test
	public void loanAccount()
	{
		System.out.println("running loan account...");
	}
	
	@Test(groups = {"smoke","sanity"})
	public void currentAcoount()
	{
		System.out.println("Running current account");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("runing before method...");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("runing after method..");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Runing before class");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("Running after class");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("runing before test");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Runing after test");
	}
	
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("runing before suit");
	}
	
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("runing after suit");
	}
}
