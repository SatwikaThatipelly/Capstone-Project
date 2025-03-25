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
		acp=new AddToCartPage(driver);
		// selecting the category laptops and adding one of the products to the cart.
		acp.phone();
		// An alert appears when we add a product to cart we handle that alert.
		AlertHandling();
		//Navigating to home page.
		acp.backto();
		//viewing the cart page.
		acp.cartpage();
		//Waiting until the elements are visible in cart page.
		Thread.sleep(2000);
		//taking a screenshot.
		screenshot();
		ExtentReport.createTest("AddToCartPage").log(Status.PASS,"Cart pass");
	}
}
