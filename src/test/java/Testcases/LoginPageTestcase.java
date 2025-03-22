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
		ExtentReport.createTest("Login").log(Status.PASS, "login pass");
		lip=new LogInPage(driver);
		lip.loginPage();
		lip.loginDetails(username, password);
		lip.loginButton();
		AlertHandling();
		screenshot();
	}
}
