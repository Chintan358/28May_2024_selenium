package practice;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Please Enter Number For The Table :");
		int num =sc.nextInt();
		
		
		for(int i=1;i<=10;i++) 
		{
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		
	}
}
