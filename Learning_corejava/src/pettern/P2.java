package pettern;

public class P2 {
	public static void main(String[] args) {
		
//		*
//		**
//		***
//		****
//		*****
		
//		int lines = 5;
//		for(int j=1;j<=lines;j++)
//		{
//			for(int i=1;i<=j;i++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}	
		
		
			int lines = 5;
			int startcount = 1;
			for(int j=1;j<=lines;j++)
			{
				for(int i=1;i<=startcount;i++)
				{
					System.out.print("*");
				}
				System.out.println();
				startcount++;
			}
		
	}
}
