package mavenProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM3Eg1 extends baseClass{
	
	//1. Non parameterized Constructor
		public POM3Eg1() {
			PageFactory.initElements(driver, this);
		}
		
		//2. Private Web elements
		//WebElement email = driver.findElement(By.id("email"));
		
		//@FindAll
		
		@FindAll({
			@FindBy(xpath ="//input[@id='email']"),
			@FindBy(xpath ="//input[@name='email']"),
			@FindBy(xpath ="//input[@data-tested='royal_email']")
		})
		private WebElement varRef;

		
		
		@FindBy(xpath = "//input[@aria-label='Password']")
		private WebElement password;
		
		@FindBy(name ="login")
		private WebElement loginBtn;
		
		
		public WebElement getVarRef() {
			return varRef;
		}
		
		//3. Getters to access webelement outside the class
		public WebElement getPassword() {
			return password;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}
}
