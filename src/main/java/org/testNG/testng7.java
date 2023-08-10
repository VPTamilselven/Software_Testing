package org.testNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng7 extends baseClass {
	
	
	@Test(dataProvider = "Data1")
	private void tc6(String t) throws AWTException {
		launchUrl("https://www.flipkart.com/");
		WebElement scrBox = driver.findElement(By.xpath("//input[@name='q']"));
	scrBox.sendKeys(t);
	
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	@DataProvider(name="Data1")
	private Object[][] data1() {
		return new Object[][] {
			{"pen"},
			{"Shoe"},
			{"cycle"},
			{"Sandal wood"},
			{"smart chrew"}
		};

	}
	
	
	@Test
	private void tc1() {
		launchBrowser();
		windowMaximize();
	launchUrl("https://www.myntra.com/login");
	}

	
	
	
	
	@DataProvider(name ="Sample Data")
	private Object[][] data() {
	return new Object[][] {
		{"Tamil","123"},
		{"Manoj","1236547"},
		{"Mohan","798456"},
		{"sabari","74185263"}
	};	
	}
	
	@Test(dataProvider = "Sample Data")
	//parameter will mismatch the optional notation will execute
	private void tc5(String e, String w) {
	
		launchUrl("https://www.facebook.com/login/");
		//	POM1Eg1 f=new POM1Eg1();
		//	passText("rpchandru2002@gmail.com", f.getEmail());
		//	passText("9787425965", f.getPassword());
		//	clickBtn(f.getLoginBtn());
		WebElement id = driver.findElement(By.xpath("//input[@id='email']"));
		id.sendKeys(e);
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys(w);
//		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
//		login.click();	
		}
}
