package org.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testng9 extends baseClass {
	
	
	
	//1.HardAssert && SoftAssert
	
	
	
	@Test
	private void tc1() {
		launchBrowser();
		launchUrl("https://www.facebook.com/login/");
		String title = pageTitle();
		WebElement id = driver.findElement(By.xpath("//input[@id='email']"));
		id.sendKeys("vptamilselven@gmail.com");
		
		//HardAssert
		
		Assert.assertTrue(title.contains("facebook"), "Check your URL");
		
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("9865273529");
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();	
		}
	
	@Test
	private void tc2() {
		launchUrl("https://www.facebook.com/login/");
		String title = pageTitle();
		WebElement id = driver.findElement(By.xpath("//input[@id='email']"));
		id.sendKeys("rpchandru2002@gmail.com");
		
		
		
		//SoftAssert
		
		
		SoftAssert s=new SoftAssert();
		s.assertTrue(title.contains("facebook"), "Check your URL");
		
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("9787425965");
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();	
		}
}
