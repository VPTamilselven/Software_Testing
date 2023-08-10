package org.testNG;

import org.testng.annotations.Test;

public class testng11 extends baseClass{
	
	
	//2.To run the test cases in parallel class
	
	@Test
	private void tc3() {
		launchBrowser();
		launchUrl("https://www.swiggy.com/");
		windowMaximize();
	}
	
	@Test
	private void tc5() {
		launchBrowser();
		launchUrl("https://www.pnbindia.in/");
		windowMaximize();
		}
	
	@Test
	private void tc1() {
		launchBrowser();
		launchUrl("https://www.google.co.in/");
		windowMaximize();
	}

}

