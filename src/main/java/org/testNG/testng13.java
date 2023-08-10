package org.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testng13 extends baseClass{

	@Test
	private void tc1() {
		
		launchBrowser();
		launchUrl("https://www.redbus.in/");
		windowMaximize();
	}
	
	@Test
	private void tc3() {
		launchBrowser();
		launchUrl("https://in.bookmyshow.com/");
		windowMaximize();
		}
	
	@Test(retryAnalyzer = failed.class)
	private void tc2() {
		
		launchBrowser();
		launchUrl("https://www.instagram.com/accounts/login/");
		windowMaximize();
		String title = driver.getTitle();
		
		WebElement id = driver.findElement(By.xpath("//input[@id='email']"));
		id.sendKeys("rpchandru2002@gmail.com");
		Assert.assertEquals(title, "Facebook","check your page title");
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("9787425965");
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
	}
}
