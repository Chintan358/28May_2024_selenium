package utill;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReader {
	
	
		String path;
		String sheet;
		
		public ExcellReader(String path, String sheet) {
			super();
			this.path = path;
			this.sheet = sheet;
		}
		
		public int rowCount()
		{
			int row = 0;
			try {
				XSSFWorkbook workbook = new XSSFWorkbook(path);
				XSSFSheet worksheet = workbook.getSheet(sheet);
				row = worksheet.getPhysicalNumberOfRows();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return row;
		}
		
		
		public int colCount()
		{
			int col = 0;
			try {
				XSSFWorkbook workbook = new XSSFWorkbook(path);
				XSSFSheet worksheet = workbook.getSheet(sheet);
				col = worksheet.getRow(0).getPhysicalNumberOfCells();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return col;
		}
		
		public String getdata(int row, int col)
		{
			String data = null;
			try {
				XSSFWorkbook workbook = new XSSFWorkbook(path);
				XSSFSheet worksheet = workbook.getSheet(sheet);
				data = worksheet.getRow(row).getCell(col).getStringCellValue();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return data;
		}
	
}
