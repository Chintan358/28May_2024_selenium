package J005_oops;

/*final*/ class X
{
	/* final */ public void disp()
	{
		
	}
}
class Y extends X
{
	@Override
	public void disp() {
		// TODO Auto-generated method stub
		super.disp();
	}
}

public class O013_Final {
	public static void main(String[] args) {
		
		
		final int a = 10;
		//a = 20;
		System.out.println(a);
		
	}
}
