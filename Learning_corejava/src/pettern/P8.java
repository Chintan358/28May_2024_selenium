package pettern;

public class P8 {
	public static void main(String[] args) {
		
//		0
//		10
//		010
//		1010
//		01010
		

		
			int lines = 5;
			int startcount = 1;
			for(int j=1;j<=lines;j++)
			{
				for(int i=1;i<=startcount;i++)
				{
					System.out.print((i+j)%2);
				}
				System.out.println();
				startcount++;
			}
		
	}
}
