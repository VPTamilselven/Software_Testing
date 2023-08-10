package org.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testng10 extends baseClass{
	
	
	
	//1. To the test case in parallel methods
	
	
	@Test
	private void tc1() {
		System.out.println("tc1 : "+Thread.currentThread().getId());
		launchBrowser();
		launchUrl("https://www.redbus.in/");
		windowMaximize();
	}
	
	@Test
	private void tc3() {
		System.out.println("tc3 : "+Thread.currentThread().getId());
		launchBrowser();
		launchUrl("https://www.irctc.co.in/nget/train-search");
		windowMaximize();
		}
	
	@Test
	private void tc2() {
		System.out.println("tc2 : "+ Thread.currentThread().getId() );
		launchBrowser();
		launchUrl("https://www.instagram.com/accounts/login/");
		windowMaximize();
		WebElement id = driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d']"));
		id.sendKeys("rpchandru2002@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("9787425965");
		WebElement login = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		login.click();
	}

}
