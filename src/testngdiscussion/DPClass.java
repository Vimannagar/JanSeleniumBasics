package testngdiscussion;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DPClass {
	
	@DataProvider(name="testdata")
	public static String[][] readData() throws IOException
	{
String path = System.getProperty("user.dir")+"\\DataProviderSheet.xlsx";
		
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
		
		String[][] data = new String[rowcount][columncount] ;
		
		
		for(int i=0; i<rowcount; i++)
		{
			for(int j=0; j<columncount; j++)
			{
				 data[i][j]= sh1.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}
		
		return data;
	}

}
