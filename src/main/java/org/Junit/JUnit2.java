package org.Junit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import mavenProject.baseClass;

public class JUnit2 extends baseClass {
	
	@Test
	public void tc5() {
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
		System.out.println("Test case :6");
		launchUrl("https://www.flipkart.com/");
	}
	
	@Ignore
	@Test
	public void tc2() {
		System.out.println("Test case :2");
		launchUrl("https://www.myntra.com/wishlist");
	}
	
	@AfterClass
	public static void CloseBrowser()
	{
		System.out.println("Close the Browser.....");
		closeEntirreBrowser();
	}
	@Test
	public void tc4() {
		System.out.println("Test case :4");
		launchUrl("https://www.google.com/");
	}
	@After
	public void endDate() {
		Date d= new Date();
		System.out.println(d);
	}
	
	@Test
	public void tc1() {
		System.out.println("Test case :1");
		launchUrl("https://www.facebook.com/login/");
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
		System.out.println("Test case :3");
		launchUrl("https://www.instagram.com/");
	}
}
