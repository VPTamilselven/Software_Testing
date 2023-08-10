package mavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven4 {
	public static void main(String[] args) throws IOException {
		
		//1 Mention the Data Sheet path
		File f= new File("C:\\Users\\VPTam\\eclipse-workspace\\mavenProject\\Excel\\DataDriven4.xlsx");
		
		//2. To  read the file
		FileInputStream fis =new FileInputStream(f);
		
		//3. To read .xlsx file format
		Workbook wb = new XSSFWorkbook(fis);
		
		//4. To get sheet from workbook
		Sheet mySheet = wb.getSheet("Data");
		
		
		//5.To iterate all Rows and Cell
		
		for (int i = 0; i <mySheet.getPhysicalNumberOfRows(); i++)
		{
			Row r = mySheet.getRow(i);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) 
			{
				Cell c = r.getCell(j);
				int cellType = c.getCellType();
				
				// cellType ==1 --> string cell bu default
				// cellType !=1 --> date cell / number
				
				if(cellType==1)
				{
					String value = c.getStringCellValue();
					System.out.println(value);	
				}
				
				else if (DateUtil.isCellDateFormatted(c));
				{
					Date dd = c.getDateCellValue();
					SimpleDateFormat s =new SimpleDateFormat("dd-MMM-yy");
					String value = s.format(dd);
					System.out.println(value);
				}
				
				
			}
		}	
		
	}

}
