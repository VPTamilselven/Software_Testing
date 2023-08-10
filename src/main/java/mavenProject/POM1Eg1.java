package mavenProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1Eg1 extends baseClass{
	
	//1. Non parameterized Constructor
	public POM1Eg1() {
		PageFactory.initElements(driver, this);
	}
	
	//2. Private Web elements
	//WebElement email = driver.findElement(By.id("email"));
	@FindBy(xpath="//input[@name='email']")
	public WebElement email;
	
	@FindBy(xpath = "//input[@name='pass']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@name='login']")
	public WebElement loginBtn;
	
	@FindBy(xpath = "//div[@id='u_0_4_Uv']")
	public WebElement showBtn;

	
	
	

	//3. Getters to access web element outside the class
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public WebElement getShowBtn() {
		return showBtn;
	}
}
