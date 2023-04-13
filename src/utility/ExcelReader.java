package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	
	public static void main(String[] args) throws IOException {
	
		String path = System.getProperty("user.dir")+"\\TestData.xlsx";
		
		File file = new File(path);
		
//		to perform Read operation we have to use file input stream class
		
		FileInputStream fis = new FileInputStream(file);
		
//		To locate the workbook
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
//		To locate the sheet
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
//		To locate the row and column
		
		String data = sh1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data);
		
		int rowcount = sh1.getLastRowNum();
		
		System.out.println("Total number of rows "+ rowcount);
		
		int columncount = sh1.getRow(1).getLastCellNum();
	
		System.out.println("Total number of columns are "+columncount);
		
		
		
		
		
		
		
	}

}
