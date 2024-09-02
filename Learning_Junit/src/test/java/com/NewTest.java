package com;

import org.junit.Ignore;
import org.junit.Test;

public class NewTest {
	
	@Test
	public void test1()
	{
		System.out.println("running test1.");
	}
	
	@Test
	public void test2()
	{
		System.out.println("running test2.");
	}
	
	@Ignore
	@Test
	public void test3()
	{
		System.out.println("running test3.");
	}
	
	@Test
	public void test4()
	{
		System.out.println("running test4.");
	}
}
