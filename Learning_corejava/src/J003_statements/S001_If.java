package J003_statements;

public class S001_If {
	public static void main(String[] args) {
		
//		ex  :1
//		int age = 25;
//		if(age>18)
//		{
//			System.out.println("elegeble...");
//		}
//		else
//		{
//			System.out.println("Not elegeble for voting");
//		}
		
		
		//Ex :2 :nested 
		
		int a = 10;
		int b = 20;
		int c = 20;
		
//		if(a>b)
//		{
//			if(a>c)
//			{
//				System.out.println("a is greater");
//			}
//			else
//			{
//				System.out.println("c is greater");
//			}
//		}
//		else
//		{
//			if(b>c)
//			{
//				System.out.println("B is greater");
//			}
//			else
//			{
//				System.out.println("c is greater");
//			}
//		}
		
		
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else if(c>a && c>b)
		{
			System.out.println("c is greater");
		}
		else
		{
			System.out.println("Error");
		}
	}
}
