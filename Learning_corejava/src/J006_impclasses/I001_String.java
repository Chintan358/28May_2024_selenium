package J006_impclasses;

public class I001_String {
	public static void main(String[] args) {
		
		//string literal
		//String name = "Nikunj";
		//by object
		//String str = new String("Tejas");
		
		//String nname = name.concat("Kava");
		
		//System.out.println(nname);
		
		
		String s1 = new String("java");
		String s2 = new String("kava");
		String s3 = new String("java");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
		
		System.out.println("*********************************");
		
		String st1 = "java";
		String st2 = "kava";
		String st3 = "java";
		
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1 == st3);
		
		
	}
}
