package mavenProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven5 {
	public static void main(String[] args) throws IOException {
		File f =new File("C:\\Users\\VPTam\\eclipse-workspace\\mavenProject\\Excel\\DataDriven5.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet newSheet = w.createSheet("Data");
		Row R1 = newSheet.createRow(0);
		Cell c1 = R1.createCell(0);
		c1.setCellValue("Name");
		Cell c2 = R1.createCell(1);
		c2.setCellValue("Age");
		Cell c3 = R1.createCell(2);
		c3.setCellValue("Phone NO");
		Row R2 = newSheet.createRow(1);
		Cell r2c1 = R2.createCell(0);
		r2c1.setCellValue("Tamil");
		Cell r2c2 = R2.createCell(1);
		r2c2.setCellValue(21);
		Cell r2c3 = R2.createCell(2);
		r2c3.setCellValue(986527352);
		Row r3 = newSheet.createRow(2);
		Cell r3c0 = r3.createCell(0);
		r3c0.setCellValue("Selvan");
		Cell r3c1 = r3.createCell(1);
		r3c1.setCellValue(22);
		Cell r3c2 = r3.createCell(2);
		r3c2.setCellValue(877807850);
		FileOutputStream fos =new FileOutputStream(f);
		w.write(fos);
		
		
		
	}
}
