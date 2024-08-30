package test;

public class Petten5 {
	public static void main(String[] args) {
		
		
//		    *
//		   * *
//		  * * *
//		 * * * *
//		* * * * *
		
		int lines = 10;
		int startCount = 1;
		int spaceCount = lines-1;
		for(int j=1;j<=lines;j++)
		{
			for(int k=1;k<=spaceCount;k++)
			{
				System.out.print(" ");
			}
			
			for(int i=1;i<=startCount;i++)
			{
				System.out.print("* ");
			}
			System.out.println();
			startCount++;
			spaceCount--;
		}
		
		
		
		
		
		
	}
}
