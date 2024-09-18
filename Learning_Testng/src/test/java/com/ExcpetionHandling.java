package com;

import org.testng.annotations.Test;

public class ExcpetionHandling {

	@Test(expectedExceptions = ArithmeticException.class)
	public void test()
	{
		int i = 10;
		int j = i/0;
	}
	
	@Test(expectedExceptions = Exception.class)
	public void test1()
	{
		int a[] = new int[5];
		a[6] = 10;
	}
}
