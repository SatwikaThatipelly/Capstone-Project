package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.BaseClass;
import Base.ExtentReport;
import Pages.AddToCartPage;
import Pages.CheckOutPage;

public class CheckOutPageTestcase extends BaseClass {
	AddToCartPage acp;
	CheckOutPage cop;
	@Test 
	public void Tc1() {
		acp=new AddToCartPage(driver);
		// selecting the category phone and adding one of the products to the cart.
		acp.phone();
		// An alert appears when we add a product to cart we handle that alert.
		AlertHandling();
		//Navigating to home page.
		acp.backto();
		//viewing the cart page.
		acp.cartpage();
	}
	@Test
	public void checkout() throws IOException {
		cop=new CheckOutPage(driver);
		// clicking on place order button
		cop.clickPlaceOrder();
		// entering the user details.
		cop.enterPurchaseDetails(Name, Country, City, Creditcard, Month, Year);
		AlertHandling();
		// clicking on purchase button
		cop.confirmPurchase();
		//Taking a screenshot.
		screenshot();
		// clicking on ok button.
		cop.ok();
		ExtentReport.createTest("CheckOutPage").log(Status.PASS,"Checked out successfully");
	}
}
