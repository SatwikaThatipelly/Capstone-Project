package Testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import Base.BaseClass;
import Base.ExtentReport;
import Pages.SignUpPage;


public class SignUpPageTestcase extends BaseClass {
	SignUpPage sip;
	@Test
	public void SignUpPageMethod() throws IOException {
		sip=new SignUpPage(driver);
		sip.signuppage();
		sip.SignUpPageDetails(username,password);
		sip.SignUpButton();
		AlertHandling();
		screenshot();
		ExtentReport.createTest("SignUp").log(Status.PASS, "SignUp pass");
	}
}
