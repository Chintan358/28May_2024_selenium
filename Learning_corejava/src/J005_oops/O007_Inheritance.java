package J005_oops;

class A
{
	int id = 10;	
	public void display()
	{
		System.out.println("runing display");
	}	
}
class B extends A
{
	int id = 50;
	public void show()
	{
		int id = 100;
		System.out.println("id : "+id);
		System.out.println("id : "+this.id);
		System.out.println("Id : "+super.id);
		System.out.println("runing show");
	}
}

public class O007_Inheritance {
	public static void main(String[] args) {
		
		B b  = new B();
		b.show();
		
		

		
	}
}
