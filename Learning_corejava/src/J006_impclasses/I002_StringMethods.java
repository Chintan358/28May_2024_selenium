package J006_impclasses;

public class I002_StringMethods {
	public static void main(String[] args) {
		
		String str = "Sun rises in East";
		String s = "hello";
		String s1 = "hello";
		
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.indexOf('r'));
		System.out.println(str.charAt(10));
		System.out.println(str.substring(4,11));
		System.out.println(str.replace('i', 'Y'));
		System.out.println(str.concat("Hello"));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s == s1);
		
		System.out.println("**********************************");
		
		
		String ar[] =  str.split(" ");
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		System.out.println("********************************");
		
		 
		
		System.out.println("*****************************");
		
		
		byte b[] = str.getBytes();
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		
	}
}
