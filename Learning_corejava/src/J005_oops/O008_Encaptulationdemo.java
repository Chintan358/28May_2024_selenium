package J005_oops;

public class O008_Encaptulationdemo {
	public static void main(String[] args) {
		
		Employee e  =new Employee();
		
		e.setId(10);
		System.out.println(e.getId());
		e.setName("Test");
		System.out.println(e.getName());
		
		
	}
}
