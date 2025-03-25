package Testcases;

import java.io.IOException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.BaseClass;
import Base.ExtentReport;
import Pages.LogInPage;

public class LoginPageTestcase extends BaseClass {
	LogInPage lip;
	@Test
	public void LoginPageMethod() throws IOException, InterruptedException {
		lip=new LogInPage(driver);
		//clicking on login.
		lip.loginPage();
		//Entering username and password.
		lip.loginDetails(username, password);
		//Clicking loginbutton.
		lip.loginButton();
		//Handling the alert if present.
		AlertHandling();
		//taking screen shot.
		screenshot();
		ExtentReport.createTest("Login").log(Status.PASS, "login Success");
	}
}
