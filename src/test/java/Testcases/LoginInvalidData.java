package Testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import Base.BaseClass;
import Base.ExtentReport;
import Pages.LogInPage;
import Utilities.ExcelReader;

public class LoginInvalidData extends BaseClass {
	LogInPage lip;
	ExcelReader er;
	@Test
	public void LoginInvalid() throws IOException, InterruptedException {
		// getting data from 
		String username1=er.getData(1,0);
		String password1=er.getData(1, 1);
		lip=new LogInPage(driver);
		//clicking on login.
		lip.loginPage();
		//Entering username and password.
		lip.loginDetails(username1, password1);
		//Clicking loginbutton.
		lip.loginButton();
		//Handling the alert if present.
		AlertHandling();
		//taking screen shot.
		screenshot();
		ExtentReport.createTest("LoginInvalid").log(Status.PASS, "login failed for invalid data");
		
	}
}
