package J005_oops;

class Demo
{
	static int count = 0;
	Demo()
	{
		//System.out.println("calling..");
		count++;
		//System.out.println(count);
	}
}

public class O003_Objects {
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		Demo d4 = new Demo();
		Demo d5 = new Demo();
		
		System.out.println("Total objects : "+Demo.count);
		
		
	}
}
