package mavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven2 {
	public static void main(String[] args) throws IOException {
		//1. Mention excel sheet path
		File f= new File("C:\\Users\\VPTam\\eclipse-workspace\\mavenProject\\Excel\\sample.xlsx");
		
		//2. To read the file
		FileInputStream fis =new FileInputStream(f);
		
		//3. To read .xlsx file format
		Workbook wb = new XSSFWorkbook(fis);
		
		//4.  get sheet from workbook
		Sheet mysheet = wb.getSheet("Data");
		
		//5. get row from sheet
		Row particularRow = mysheet.getRow(2);
		
		//6. Get cell from sheet
		Cell particularCell = particularRow.getCell(1);
		
		//7. print the particular data
		System.out.println(particularCell);
		
	}
}
