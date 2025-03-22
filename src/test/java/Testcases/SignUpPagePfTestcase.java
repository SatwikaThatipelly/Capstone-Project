package Testcases;

import org.testng.annotations.Test;
import Base.BaseClass;
import Pages.SignUpPagePf;

public class SignUpPagePfTestcase extends BaseClass {
	SignUpPagePf sipf;
	@Test
	public void Tc2() {
		sipf=new SignUpPagePf(driver);
		sipf.signuppage();
		sipf.userDetails(username, password);
		sipf.SignUpButton();
		AlertHandling();
	}
}
