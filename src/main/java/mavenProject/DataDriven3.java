package mavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven3 {
	public static void main(String[] args) throws IOException {
		//1. Mention excel sheet path
		File f= new File("C:\\Users\\VPTam\\eclipse-workspace\\mavenProject\\Excel\\sample.xlsx");
		
		//2. To read the file
		FileInputStream fis =new FileInputStream(f);
		
		//3. To read .xlsx file format
		Workbook wb = new XSSFWorkbook(fis);
		
		//4.  get sheet from workbook
		Sheet mysheet = wb.getSheet("Data");
		
		//5. no of rows
		for(int i=0;i<mysheet.getPhysicalNumberOfRows();i++)
		{
			Row iterateRow = mysheet.getRow(i); // from 0 to 3ed index position 
			
			for(int j=0;j<iterateRow.getPhysicalNumberOfCells();j++)
			{
				Cell iterateCell = iterateRow.getCell(j);
				System.out.println(iterateCell);
			}
		}
		
	}

}
