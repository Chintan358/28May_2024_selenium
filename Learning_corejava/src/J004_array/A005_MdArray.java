package J004_array;

public class A005_MdArray {
	public static void main(String[] args) {
		
		
//		int a[][] = new int[3][5];
//		a[0][0] = 10;
//		a[0][1] = 12;
//		a[0][2] = 10;
//		a[0][3] = 12;
//		a[0][4] = 10;
//		
//		a[1][0] = 10;
		
//		a[1][1] = 12;
//		a[1][2] = 10;
//		a[1][3] = 12;
//		a[1][4] = 10;
//		
//		a[2][0] = 10;
//		a[2][1] = 12;
//		a[2][2] = 10;
//		a[2][3] = 12;
//		a[2][4] = 10;
//		
		
		int a[][] = {{10,20,30,40,50},{1,2,3,4,5},{01,02,03,04,05}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
