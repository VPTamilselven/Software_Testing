package org.Junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
public static WebDriver driver;
	
	public static void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void windowMaximize() 
	{
		driver.manage().window().maximize();	
	}
	
	public static void launchUrl(String url)
	{
		driver.get(url);
	}
	
	public static String pageTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public static String pageUrl()
	{
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public static void passText(String txt, WebElement ele)
	{
		ele.sendKeys(txt);
	}
	
	public static void closeEntirreBrowser()
	{
		driver.quit();
	}
	
	public static void clickBtn(WebElement ele)
	{
		ele.click();
	}
	
//	public static void newtab()
//	{
//		 
//	}
	public static void screenShot(String imgName)throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\VPTam\\eclipse-workspace\\mavenProject\\ScreenShot\\inmgName.png");
		FileUtils.copyFile(image, f);
	}
	
	public static Actions a;
	
	
	public static void moveTheCursor(WebElement targetWebElement)
	{
		a=new Actions(driver);
		a.moveToElement(targetWebElement).perform();
	}
	
	public static void dragDrop(WebElement dragWebElement, WebElement dropElement)
	{
		a= new Actions(driver);
		a.dragAndDrop(dragWebElement, dropElement).perform();
	}
	
	public static JavascriptExecutor js;
	
	
	public static void scrollThePage(WebElement tarWebEle)
	{
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments(0).scrollIntoView(false)",tarWebEle);
	}
	
	public static void scroll(WebElement element)
	{
		js=(JavascriptExecutor)driver;
		js.executeAsyncScript("arguments(0).scrollIntoView(false)",element);
	}
	
	public static void createNewExcelFile(int rowNum, int cellNum, String newData) throws IOException
	{
		File f = new File("C:\\Users\\VPTam\\eclipse-workspace\\mavenProject\\Excel\\NewFile.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet newSheet = wb.createSheet("BaseClass");
		Row newRow = newSheet.createRow(rowNum);
		Cell newCell = newRow.createCell(cellNum);
		newCell.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	
	public static void createCell(int rowNum, int cellNum, String newData) throws IOException
	{
		File f = new File("C:\\Users\\VPTam\\eclipse-workspace\\mavenProject\\Excel\\NewFile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Baseclass");
		Row r = s.getRow(rowNum);
		Cell c = r.getCell(cellNum);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	
	public static void createRow(int creRow, int creCell, String newData) throws IOException
	{
		File f = new File("C:\\Users\\VPTam\\eclipse-workspace\\mavenProject\\Excel\\NewFile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Baseclass");
		Row r = s.getRow(creRow);
		Cell c = r.getCell(creCell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	
	public static void updateDataToParticularCell(int getTheRow, int getTheCell, String existingData, String writtenData) throws IOException
	{
		File f = new File("C:\\Users\\VPTam\\eclipse-workspace\\mavenProject\\Excel\\NewFile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Baseclass");
		Row r = s.getRow(getTheRow);
		Cell c = r.getCell(getTheCell);
		String str = c.getStringCellValue();
		if(str.equals(existingData))
		{
			c.setCellValue(writtenData);
		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
}
