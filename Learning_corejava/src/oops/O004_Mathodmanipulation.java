package oops;

import java.util.Arrays;
import java.util.Iterator;

class Calc
{
	public void display()
	{
		System.out.println("Running display...");
	}
	
	public void mesaage(String name)
	{
		System.out.println("Hiii..."+name);
	}
	
	public void add(int a, int b)
	{
		System.out.println("Addition is : "+(a+b));
	}
	
	public int square(int a)
	{
		int sq = a*a;
		return sq;
	}
	
	public String data()
	{
		return "Hello";
	}
	
	public void arrayAdd(int a[])
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum +a[i];
		}
		System.out.println("sum : "+sum);
	}
	
	
	public int[] revArray(int a[])
	{
		int b[] = new int[a.length];
		int count = 0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[count] = a[i];
			count++;
		}
		
		return b;
	}
	
	
	public void all(int...a)
	{
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
}

public class O004_Mathodmanipulation {
	public static void main(String[] args) {
		
		
		Calc c = new Calc();
//		c.display();
//		c.mesaage("Tejas");
//		c.mesaage("Nikunj");
//		c.add(10, 20);
//		
//		int sq =  c.square(10);
//		System.out.println(sq);
//		System.out.println(c.square(50));
//		
//		String r = c.data();
//		System.out.println(r);
		
//		int r = c.square(20);
//		c.add(20, r);
		
//		int a[] = {10,20,30,40,50};
//		int b[] = {1,2,3,4,5,60};
//		//c.arrayAdd(a);
		//c.arrayAdd(b);
		
//		int r[] = c.revArray(b);
//		System.out.println(Arrays.toString(r));
		
		
		c.all(10,20,30,60,70);
		
	}
}
