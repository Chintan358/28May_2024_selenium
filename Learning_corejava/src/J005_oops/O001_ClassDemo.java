package J005_oops;

class Pen
{
	//data member
	String color = "red";
	String company = "cello";
	static int price = 10;
	
	//function member
	void toWrite()
	{
		System.out.println(color+" "+company+" "+price);
	}
	
	public static void display()
	{
		System.out.println("display calling..");
	}
}


public class O001_ClassDemo
{
	public static void main(String[] args) {
		
		Pen.price = 80;
		
		Pen p2 = new Pen();
		p2.toWrite();
		
		Pen p1 = new Pen();
		p1.toWrite();
		
		
		
		Pen p3 = new Pen();
		p3.toWrite();
		
		Pen.display();
	}
}
