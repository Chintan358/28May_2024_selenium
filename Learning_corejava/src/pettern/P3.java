package pettern;

public class P3 {
	
	public static void main(String[] args) {
		
//		*****
//		****
//		***
//		**
//		*
		
		int lines = 5;
		int startcount = lines;
		for(int j=1;j<=lines;j++)
		{
			for(int i=1;i<=startcount;i++)
			{
				System.out.print("*");
			}
			System.out.println();
			startcount--;
		}
		
	}
}
