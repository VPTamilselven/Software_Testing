package org.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng6 extends baseClass{

	
	
	
	//1.@Parameters notation
	
	
//		@Test
//	private void tc1() {
//		launchBrowser();
//		windowMaximize();
//		launchUrl("https://www.flipkart.com/");
//	}
//	
//	@Test
//	private void tc3() {
//		launchUrl("https://www.myntra.com/login");
//	}
//	
//	@Parameters({"userid","password"})
//	@Test
//	private void tc5(String e,String w) {
//		
//		launchUrl("https://www.facebook.com/login/");
////		POM1Eg1 f=new POM1Eg1();
////		passText("rpchandru2002@gmail.com", f.getEmail());
////		passText("9787425965", f.getPassword());
////		clickBtn(f.getLoginBtn());
//		WebElement id = driver.findElement(By.xpath("//input[@id='email']"));
//		id.sendKeys(e);
//		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
//		pass.sendKeys(w);
//		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
//		login.click();	
//	}
	
	
	
	
	
	
	
	
	//2. @Optional notation
	
	
	@Test
	private void tc1() {
	launchBrowser();
	windowMaximize();
	launchUrl("https://www.flipkart.com/");
	}
	@Test
	private void tc3() {
	launchUrl("https://www.myntra.com/login");
	}

	@Parameters({"user","pass"})
	@Test
	//parameter will mismatch the optional notation will execute
	private void tc5(@Optional("vptamilselven@gmail.com")String e,@Optional("9865273529")String w) {
	
		launchUrl("https://www.facebook.com/login/");
		//	POM1Eg1 f=new POM1Eg1();
		//	passText("rpchandru2002@gmail.com", f.getEmail());
		//	passText("9787425965", f.getPassword());
		//	clickBtn(f.getLoginBtn());
		WebElement id = driver.findElement(By.xpath("//input[@id='email']"));
		id.sendKeys(e);
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys(w);
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();	
		}
	
	
	
	
	
}
