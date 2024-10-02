package utill;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReader {
	
	
	
	String filepath;
	String filename;
	
	
	
	public ExcellReader(String filepath, String filename) {
		super();
		this.filepath = filepath;
		this.filename = filename;
	}

	public int rowcount()
	{
		int row = 0;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filepath);
			XSSFSheet sheet = workbook.getSheet(filename);
			
			row = sheet.getPhysicalNumberOfRows();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}
	
	public int colcount()
	{
		int col = 0;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filepath);
			XSSFSheet sheet = workbook.getSheet(filename);
			
			col = sheet.getRow(0).getPhysicalNumberOfCells();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return col;
	}
	
	
	public String getData(int row, int col)
	{
		String data = null;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filepath);
			XSSFSheet sheet = workbook.getSheet(filename);
			
			data = sheet.getRow(row).getCell(col).getStringCellValue();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
}
