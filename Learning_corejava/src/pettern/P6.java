package pettern;

public class P6 {
	public static void main(String[] args) {
		
//		    *
//		   ***
//		  *****
//		 *******
//		*********
		
		
		int lines = 5;
		int startcount = 1;
		int spaceCount = lines-1;
		for(int j=1;j<=lines;j++)
		{
			for(int k=1;k<=spaceCount;k++)
			{
				System.out.print(" ");
			}
			
			for(int i=1;i<=startcount;i++)
			{
				System.out.print(j);
			}
			System.out.println();
			startcount += 2;
			spaceCount--;
		}
		
	}
}
