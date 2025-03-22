package Testcases;

import java.io.IOException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.BaseClass;
import Base.ExtentReport;
import Pages.AddToCartPage;

public class CartPageTestcase extends BaseClass {
	AddToCartPage acp;
	@Test
	public void Tc1() throws IOException, InterruptedException {
		ExtentReport.createTest("AddToCartPage").log(Status.PASS,"Cart pass");
		acp=new AddToCartPage(driver);
		//scrolldown(0,20);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		acp.phone();
		AlertHandling();
		acp.backto();
		acp.cartpage();
		Thread.sleep(2000);
		screenshot();
	}
}
