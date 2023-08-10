package org.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.annotations.Test;

import mavenProject.POM1Eg1;

public class testng3 extends baseClass{

	@Test
	private void tc5() {
		launchUrl("https://www.flipkart.com/");
	}
	
	@Test
	private void tc4() {
		launchUrl("https://www.myntra.com/login");
	}	
	
	@Test
	private void tc1() {
		launchBrowser();
		windowMaximize();
		launchUrl("https://www.facebook.com/login/");
//		POM1Eg1 f=new POM1Eg1();
//		passText("rpchandru2002@gmail.com", f.getEmail());
//		passText("9787425965", f.getPassword());
//		clickBtn(f.getLoginBtn());
		WebElement id = driver.findElement(By.xpath("//input[@id='email']"));
		id.sendKeys("rpchandru2002@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("9787425965");
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
		
	}
	
	
	//to ignore the test case
	@Test(enabled = false)
	private void tc2() {
	
		launchUrl("https://www.amazon.in/log-in/s?k=log+in");
	}
	
	//to run the test case multiple time
	@Test(invocationCount =3)
	private void tc3() {
		launchUrl("https://www.instagram.com/");
	}
	
	
}
