package org.testNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class testng1 {
		
	
	//1. @Test
//	
//	@Test
//	private void tc9() {
//		System.out.println("Test case 9");
//
//	}
//	
//	@Test
//	private void tc2() {
//		System.out.println("Test case 2");
//
//	}
//	
//	@Test
//	private void tc3() {
//		System.out.println("Test case 3");
//
//	}
//	
//	@Test
//	private void tc1() {
//		System.out.println("Test case 1");
//
//	}
	
	
	
	
	
	
	
	
	//2. @Before Class & @After Class
	
	
//	@Test
//	private void tc9() {
//		System.out.println("Test case 9");
//
//	}
//	
//	@Test
//	private void tc2() {
//		System.out.println("Test case 2");
//
//	}
//	@BeforeClass
//	private void launchBrowser() {
//		System.out.println("LaunchBrowser......");
//
//	}
//	@Test
//	private void tc3() {
//		System.out.println("Test case 3");
//
//	}
//	@AfterClass
//	private void close() {
//		System.out.println("Close Browser...........");
//	}
//	@Test
//	private void tc1() {
//		System.out.println("Test case 1");
//
//	}

	
	
	
	
	
	
	
	//3.@BeforeMethod && @AfterMethod
	
	@AfterMethod
	private void MethoAfter() {
		System.out.println("Ending Date && Time");
	}
	@Test
	private void tc9() {
		System.out.println("Test case 9");

	}
	
	@Test
	private void tc2() {
		System.out.println("Test case 2");
	}
	@BeforeClass
	private void launchBrowser() {
		System.out.println("LaunchBrowser......");
	}
	@BeforeMethod
	private void MethodBefore() {
		System.out.println("Starting Date && Time");
	}
	@Test
	private void tc3() {
		System.out.println("Test case 3");

	}
	@AfterClass
	private void close() {
		System.out.println("Close Browser...........");
	}
	@Test
	private void tc1() {
		System.out.println("Test case 1");

	}	
}
