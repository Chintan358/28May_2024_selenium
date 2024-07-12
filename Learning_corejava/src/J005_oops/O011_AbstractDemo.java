package J005_oops;

abstract class Abs
{
	public abstract void show();
	
	public void display()
	{
		System.out.println("running display");
	}
}
class Abs1
{
	
}
class AbsImpl extends Abs
{

	@Override
	public void show() {
	
		System.out.println("show calling..");
	}
	
}

public class O011_AbstractDemo {
	public static void main(String[] args) {
		
		
		//Abs a = new Abs();
		AbsImpl a = new AbsImpl();
		a.show();
		
	}
}
