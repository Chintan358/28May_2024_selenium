package J004_array;

public class A001_ArrayDemo {
	public static void main(String[] args) {
		
		//int a = 10;
		
		//declaration
		int a[] = new int[10];
		
		//initialization
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[6] = 50;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		System.out.println("*****************************");
		
		
		int b[] = {1,2,3,4,5,6};
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println("***************************");
		
		String[] sub = {"java","selenium","android","python"};
		
		for (int i = 0; i < sub.length; i++) {
			System.out.println(sub[i]);
		}
		
		System.out.println("******************");
		
		char ch[] = {'a','b','c','d'};
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
	}
}
