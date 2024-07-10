package J005_oops;

class Sample
{
	public void add(int a, int b)
	{
		int r  =a+b;
		System.out.println("addition is : "+r);
	}
	
	public void add(int a, int b, int c)
	{
		int r  =a+b+c;
		System.out.println("addition is : "+r);
	}
	
	public void add(int a, double b)
	{
		double r  =a+b;
		System.out.println("addition is : "+r);
	}
	
}

public class O009_MethodOverLoading {
	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.add(10, 20,60);
		
		
		
	}
}
