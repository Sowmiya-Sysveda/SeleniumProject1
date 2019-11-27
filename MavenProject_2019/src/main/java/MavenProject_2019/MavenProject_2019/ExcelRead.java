package MavenProject_2019.MavenProject_2019;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

@Test
public class ExcelRead {

	/*public static void main(String[] args) throws IOException */{
		FileInputStream fis;
		
		XSSFWorkbook wbook;
		try {
			fis = new FileInputStream("D://TC_001_CreateLead.xlsx");
			wbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = wbook.getSheet("Sheet1");//Entering sheet
			System.out.println("success");

			 /*Row row = sheet.getRow(0);
			 Cell cell = row.getCell(0);*/
			//sheetname
			 System.out.println(sheet.getSheetName());
			 
			 	int rowcount = sheet.getLastRowNum();//Getting row count
				System.out.println("Row Count"+rowcount);
				int colCount = sheet.getRow(0).getLastCellNum();//Getting cell count for Header row
				System.out.println("Column Count"+colCount);
				for (int i = 0; i < rowcount+1; i++) 
				{
			        Row row = sheet.getRow(i);
			        //Create a loop to print cell values in a row
			        for (int j = 0; j < row.getLastCellNum(); j++) 
			        {
			            //Print Excel data in console
			            System.out.print(row.getCell(j).getStringCellValue()+"|| ");
			        }
				}
		}
		
		 catch (IOException e) 
		{
			 e.printStackTrace();
		}
		
		
	}

}
