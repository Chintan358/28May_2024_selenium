package J005_oops;

//Parent, base, super
class Pen1
{
	int price = 50;
	String color = "Red";
	String company = "Cello";
	
	
	public void toWrite()
	{
		System.out.println(price+" "+color+" "+company);
	}
	
}

//Child ,derived, sub
class Notebook extends Pen1
{
	
	int pages = 50;
	
	public void todisplay()
	{
		price = 100;
		color = "white";
		company="Navneet";
		System.out.println(price+" "+color+" "+company+" "+pages);
	}
}
 
class Slate extends Pen1
{
	
}

public class O005_InheritanceDemo {
	public static void main(String[] args) {
		
		Pen1 p = new Pen1();
		p.toWrite();
		
		
		Notebook nb  =new Notebook();
		nb.todisplay();
		
		
	}
}


