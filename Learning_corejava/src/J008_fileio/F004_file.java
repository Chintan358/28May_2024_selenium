package J008_fileio;

import java.io.File;
import java.io.IOException;

public class F004_file {
	public static void main(String[] args) throws IOException {
		
		
		
		File file = new File("C:\\Chintan_work\\Files\\test.txt");
		
//		file.mkdir();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		
//		if(file.exists())
//		{
//			System.out.println("file exists...");
//			file.delete();
//		}
//		else
//		{
//			System.out.println("file is not exists...");
//			file.createNewFile();
//		}
		
		
		
	}
}
