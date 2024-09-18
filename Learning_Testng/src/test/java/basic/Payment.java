package basic;

import org.testng.annotations.Test;

public class Payment {

	@Test(groups = "sanity")
	public void debitCart()
	{
		System.out.println("Debitcard payment runinng....");
	}
	
	@Test(groups = "smoke")
	public void creditCard()
	{
		System.out.println("Credit card payment running....");
	}
	
	@Test
	public void Cod()
	{
		System.out.println("Cod payment running....");
	}
}
