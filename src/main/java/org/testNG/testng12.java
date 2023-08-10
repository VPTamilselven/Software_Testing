package org.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng12{
	
	
	//3. Cross Browser checking
	
	@Parameters("browser")
	@Test
	private void tc1(String browsername){
		WebDriver driver;
		if(browsername.equals("chromebrowser")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(browsername.equals("firefoxbrowser")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		}
		
		else {
			WebDriverManager.edgedriver();
			driver=new EdgeDriver();
		}
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
	
	
}}