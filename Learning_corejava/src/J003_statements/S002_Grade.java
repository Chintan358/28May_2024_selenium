package J003_statements;

import java.util.Scanner;

public class S002_Grade {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int marks = sc.nextInt();
		//91-100 : A
		//71 - 90 : B
		//51 - 70 : C
		//35 - 50 : D
		//0 - 35 : F
		//Invalid marks
		
		
		if(marks>91 && marks<=100)
		{
			System.out.println("A");
		}
		else if(marks<=90 && marks>71 )
		{
			System.out.println("B");
			
		}
		else if(marks<=70 && marks>51)
		{
			System.out.println("C");
		}
		else if(marks<=50 && marks>35)
		{
			System.out.println("D");
		}
		else if(marks<=35 && marks>0)
		{
			System.out.println("F");
		}
		else
		{
			System.out.println("Invalid Marks");
		}
	}
}
