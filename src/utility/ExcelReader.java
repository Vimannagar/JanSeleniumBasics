package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public void writeData() throws IOException
	{
String path = System.getProperty("user.dir")+"\\TestData.xlsx";
		
		File file = new File(path);
		
//		to perform Read operation we have to use file input stream class
		
		FileInputStream fis = new FileInputStream(file);
		
//		To locate the workbook
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
//		To locate the sheet
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		File fout = new File(path);
		
		FileOutputStream fos = new FileOutputStream(fout);
		
		sh1.getRow(2).getCell(0).setCellValue("Test write data");
		
		sh1.createRow(45).createCell(5).setCellValue("45th row data write");
		
		wb.write(fos);
		
		
		
		
	}
	
	public void readAllData() throws IOException
	{
String path = System.getProperty("user.dir")+"\\TestData.xlsx";
		
		File file = new File(path);
		
//		to perform Read operation we have to use file input stream class
		
		FileInputStream fis = new FileInputStream(file);
		
//		To locate the workbook
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
//		To locate the sheet
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		int rowcount = sh1.getLastRowNum()+1;
		
		System.out.println("Total number of rows "+ rowcount);
		
		int columncount = sh1.getRow(1).getLastCellNum();
	
		System.out.println("Total number of columns are "+columncount);
		
		
		for(int i=0; i<rowcount; i++)
		{
			for(int j=0; j<columncount; j++)
			{
				String data= sh1.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
	
//		String path = System.getProperty("user.dir")+"\\TestData.xlsx";
//		
//		File file = new File(path);
//		
////		to perform Read operation we have to use file input stream class
//		
//		FileInputStream fis = new FileInputStream(file);
//		
////		To locate the workbook
//		
//		XSSFWorkbook wb = new XSSFWorkbook(fis);
//		
////		To locate the sheet
//		
//		XSSFSheet sh1 = wb.getSheetAt(0);
//		
////		To locate the row and column
//		
//		String data = sh1.getRow(5).getCell(1).getStringCellValue();
//		
//		System.out.println(data);
//		
//		int rowcount = sh1.getLastRowNum();
//		
//		System.out.println("Total number of rows "+ rowcount);
//		
//		int columncount = sh1.getRow(1).getLastCellNum();
//	
//		System.out.println("Total number of columns are "+columncount);
		
		
		
		ExcelReader er = new ExcelReader();
//		
//		er.readAllData();
		
//		WAP to print the data from Excel sheet same as they appear in excel
		
		er.writeData();
		
		
	}

}
