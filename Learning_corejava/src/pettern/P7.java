package pettern;

public class P7 {
	public static void main(String[] args) {
		
//		    *
//		   ***
//		  *****
//		   ***
//		    *
		
		
		int lines = 9;
		int startcount = 1;
		int spaceCount = lines-1;
		int mid = (lines/2)+1;
		for(int j=1;j<=lines;j++)
		{
			for(int k=1;k<=spaceCount;k++)
			{
				System.out.print(" ");
			}
			
			for(int i=1;i<=startcount;i++)
			{
				if(i==startcount-1 || i==startcount || j==mid || j==mid+1 || j==mid-1)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			if(j<mid)
			{
			startcount += 2;
			spaceCount--;
			}
			else
			{	startcount -= 2;
				spaceCount++;
			}
		}
		
	}
}
