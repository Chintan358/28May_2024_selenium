package J005_oops;

public class Access {
	protected int id = 10;
	String name = "test";
	private double PI = 3.14;
	
	void circleArea(int r)
	{
		double area = PI*r*r;
		System.out.println("Area of circleis : "+area);
	}
	
	public static void main(String[] args) {
		

		Access ac = new Access();
		ac.PI = 522;
		ac.circleArea(10);
	}
}
