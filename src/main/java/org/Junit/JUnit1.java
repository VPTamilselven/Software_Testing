package org.Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnit1 {
	
	//1. @Test
//	@Test
//	public void tc5() {
//		System.out.println("Test case :5");
//	}
//	
//	@Test
//	public void tc6() {
//		System.out.println("Test case :6");
//	}
//	
//	@Test
//	public void tc2() {
//		System.out.println("Test case :2");
//	}
//	
//	@Test
//	public void tc4() {
//		System.out.println("Test case :4");
//	}
//	
//	@Test
//	public void tc1() {
//		System.out.println("Test case :1");
//	}
//	
//	@Test
//	public void tc3() {
//		System.out.println("Test case :3");
//	}
	
	
	
	
	
	
	
	
	
	//2. @Before
	
//	@Test
//	public void tc5() {
//		System.out.println("Test case :5");
//	}
//	
//	@Before
//	public void startDate()
//	{
//		System.out.println("Test case Start Date and Time");
//	}
//	@Test
//	public void tc6() {
//		System.out.println("Test case :6");
//	}
//	
//	@Test
//	public void tc2() {
//		System.out.println("Test case :2");
//	}
//	
//	@Test
//	public void tc4() {
//		System.out.println("Test case :4");
//	}
//	
//	@Test
//	public void tc1() {
//		System.out.println("Test case :1");
//	}
//	
//	@Test
//	public void tc3() {
//		System.out.println("Test case :3");
//	}
	
	
	
	
	
	
	
	
	
	//3.  @After
	
//	@Test
//	public void tc5() {
//		System.out.println("Test case :5");
//	}
//	
////	@Before
////	public void startDate()
////	{
////		System.out.println("Test case Start Date and Time");
////	}
//	@Test
//	public void tc6() {
//		System.out.println("Test case :6");
//	}
//	
//	@Test
//	public void tc2() {
//		System.out.println("Test case :2");
//	}
//	
//	@Test
//	public void tc4() {
//		System.out.println("Test case :4");
//	}
//	@After
//	public void endDate() {
//		System.out.println("Test Case End Date and Time");
//	}
//	
//	@Test
//	public void tc1() {
//		System.out.println("Test case :1");
//	}
//	
//	@Test
//	public void tc3() {
//		System.out.println("Test case :3");
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//4.@BeforeClass  &&  @AftreClass
	
	@Test
	public void tc5() {
		System.out.println("Test case :5");
	}
	
	@Before
	public void startDate()
	{
		System.out.println("Test case Start Date and Time");
	}
	@Test
	public void tc6() {
		System.out.println("Test case :6");
	}
	
	
	@Test
	public void tc2() {
		System.out.println("Test case :2");
	}
	
	@AfterClass
	public static void CloseBrowser()
	{
		System.out.println("Close the Browser.....");
	}
	@Test
	public void tc4() {
		System.out.println("Test case :4");
	}
	@After
	public void endDate() {
		System.out.println("Test Case End Date and Time");
	}
	
	@Test
	public void tc1() {
		System.out.println("Test case :1");
	}
	
	@BeforeClass
	public static void launchBrowser()
	{
		System.out.println("Browser Launch.........");
	}
	@Test
	public void tc3() {
		System.out.println("Test case :3");
	}
	
	
	
	
	
	
	//5.@ignore
	
//	@Test
//	public void tc5() {
//		System.out.println("Test case :5");
//	}
//	
//	@Test
//	public void tc6() {
//		System.out.println("Test case :6");
//	}
//	
//	@Test
//	public void tc2() {
//		System.out.println("Test case :2");
//	}
//	
//	@Test
//	public void tc4() {
//		System.out.println("Test case :4");
//	}
//	
//	@Test
//	public void tc1() {
//		System.out.println("Test case :1");
//	}
//	@Ignore
//	@Test
//	public void tc3() {
//		System.out.println("Test case :3");
//	}
	
}
