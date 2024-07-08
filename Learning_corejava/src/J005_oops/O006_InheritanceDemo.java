package J005_oops;

class Bike
{
	double average;
	String color;
}

class RacingBike extends Bike
{
	public void getInfo()
	{
		average=45;
		color = "black";
		System.out.println(average+" "+color);
	}
}

class sportBike extends Bike
{
	public void getInfo()
	{
		average=60;
		color = "red";
		System.out.println(average+" "+color);
	}
}



public class O006_InheritanceDemo {
	public static void main(String[] args) {
		
		
		RacingBike rb = new RacingBike();
		rb.getInfo();
		
		
		sportBike sb = new sportBike();
		sb.getInfo();
		
	}
}
