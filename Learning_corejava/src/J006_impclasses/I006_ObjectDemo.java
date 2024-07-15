package J006_impclasses;

class Sample
{
	public void display()
	{
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "tops";
	}
}

class Demo extends Sample
{
	
}
public class I006_ObjectDemo {
	public static void main(String[] args) {
		
		
		Sample s = new Sample();
		System.out.println(s);
		
		Demo d = new Demo();
		System.out.println(d);
	}
}
