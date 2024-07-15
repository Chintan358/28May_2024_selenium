package J006_impclasses;

public class I005_WrapperDemo {
	public static void main(String[] args) {
		
		
		int a = 10;
		
		//boxing
		Integer b = new Integer(a);
		//auto-boxing
		Integer c = a;
		
		
		Integer k = 50;
		//un-boxing
		int l = k.intValue();
		//auto un-boxing
		int m = k;
		
		
		
		int ch  = 5665659;
		Integer ch1 = ch;
		int length = ch1.toString().length();
		System.out.println(length);
		
	}
}
