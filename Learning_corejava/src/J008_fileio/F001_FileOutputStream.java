package J008_fileio;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class F001_FileOutputStream {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name : ");
		String name = sc.next();
		System.out.println("enter email : ");
		String email = sc.next();
		
		FileOutputStream fos=null;
		try {
			
			 fos = new FileOutputStream("C:\\Chintan_work\\Files\\"+name+".txt");
		
			//String str = "Sun rises in east...";
		
			byte b[] = email.getBytes();
			
			fos.write(b);
			System.out.println("done...");
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
