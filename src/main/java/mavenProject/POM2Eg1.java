package mavenProject;

public class POM2Eg1 extends baseClass{
	public static void main(String[] args) {
		launchBrowser();
		launchUrl("https://www.facebook.com/login/");
		windowMaximize();
		POM1Eg1 f = new POM1Eg1();
		passText("vptamilselven@gmail.com",f.getEmail());
		passText("8778078505",f.getPassword());
		//clickBtn(f.getShowBtn());
		
		
		// referesh page
		driver.navigate().refresh();
		
		passText("rpchandru2002@gmail.com",f.getEmail());
		passText("9787425965",f.getPassword());
		clickBtn(f.getLoginBtn());
	}

}
