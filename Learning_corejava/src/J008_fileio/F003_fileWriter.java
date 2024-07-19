package J008_fileio;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class F003_fileWriter {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name : ");
		String name = sc.next();
		System.out.println("enter email : ");
		String email = sc.next();
		
		FileWriter fos=null;
		try {
			
			 fos = new FileWriter("C:\\Chintan_work\\Files\\"+name+".txt");
			fos.write(email);
			fos.flush();
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
