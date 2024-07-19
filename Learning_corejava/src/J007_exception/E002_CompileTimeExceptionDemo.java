package J007_exception;

class Demo
{
	public void disp() throws ClassNotFoundException
	{
		
			Class.forName("practice.Armstrong");
	}
}

public class E002_CompileTimeExceptionDemo {
	public static void main(String[] args) {
		
		
		Demo d = new Demo();
		try {
			d.disp();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
