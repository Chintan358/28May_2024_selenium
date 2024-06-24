package J002_operators;

public class O002_Unary {
	 public static void main(String[] args) {
		
		 
		 //++pre, --pre, post++,post--
		 
		 
		 int a = 10;
		 int b = a-- + a-- - ++a + a++ - a++;
		       
		         
		        
		 System.out.println("a : "+a); //11 10
		 System.out.println("b : "+b); //47 7

		 
		 
	}
}
