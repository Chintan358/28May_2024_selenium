package practice;

import java.util.Scanner;

class InvalidageException extends Exception
{
	
}

class Validation
{
		public void check(int age) throws InvalidageException
		{
			if(age>18)
			{
				System.out.println("You are eligible for vote");
			}
			else
			{
				throw new InvalidageException();
			}	
		}
}

public class AgeExceptiondemo
{
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your age : ");
		int age=sc.nextInt();
		
		Validation v = new Validation();
		try {
			v.check(age);
		} catch (InvalidageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
