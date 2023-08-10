package mavenProject;

public class POM3Eg12 extends baseClass {
	public static void main(String[] args) {
		launchBrowser();
		launchUrl("https://www.facebook.com/login/");
		windowMaximize();
		
		POM3Eg1 fb = new POM3Eg1();
		
		passText("vpt",fb.getVarRef());
		passText("123",fb.getPassword());
		clickBtn(fb.getLoginBtn());
	}
}
