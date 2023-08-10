package org.Junit;

import java.util.Date;

import javax.xml.xpath.XPath;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import mavenProject.POM1Eg1;

public class JUnit3 extends baseClass{
	@Test
	public void tc5() {
		launchBrowser();
		windowMaximize();
		System.out.println("Test case :5");
		launchUrl("https://www.amazon.in/log-in/s?k=log+in");
	}
	
	@Before
	public void startDate()
	{
		
		Date d=new Date();
		System.out.println(d);
		
	}
	@Test
	public void tc6() {
		launchBrowser();
		windowMaximize();
		System.out.println("Test case :6");
		launchUrl("https://www.flipkart.com/");
	}
	
	@Ignore
	@Test
	public void tc2() {
		launchBrowser();
		windowMaximize();
		System.out.println("Test case :2");
		launchUrl("https://www.myntra.com/wishlist");
	}
	
	@AfterClass
	public static void CloseBrowser()
	{
		System.out.println("Close the Browser.....");
		
	}
	@Test
	public void tc4() {
		launchBrowser();
		windowMaximize();
		System.out.println("Test case :4");
		launchUrl("https://www.google.com/");
	}
	@After
	public void endDate() {
		Date d= new Date();
		System.out.println(d);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void tc1() {
		System.out.println("Test case :1");
		launchUrl("https://www.facebook.com/login/");
		WebElement id = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		// Assert.assertTrue("Message", condition);
		id.sendKeys("vptamilselven");
		//Assert.assertTrue(false);
		WebElement pass = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		pass.sendKeys("9787425965");
	}
	
	@BeforeClass
	public static void launchinBrowser()
	{
	
		launchBrowser();
		windowMaximize();
		System.out.println("Browser Launch.........");
	}
	@Test
	public void tc3() {
		launchBrowser();
		windowMaximize();
		System.out.println("Test case :3");
		launchUrl("https://www.instagram.com/");
	}

}
