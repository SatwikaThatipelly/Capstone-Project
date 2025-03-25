package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {
	WebDriver driver;
	public AddToCartPage(WebDriver driver) {
		this.driver=driver;
	}
	//categories in the page.
	By phone=By.xpath("(//a[@id='itemc'])[1]");
	By laptops=By.xpath("(//a[@id='itemc'])[2]");
	By monitors =By.xpath("(//a[@id='itemc'])[3]");
	
	//selecting products.
	By selectedphone=By.partialLinkText("galaxy s6");
	By selectedlaptop=By.partialLinkText("vaio i5");
	By selectedmonitors=By.partialLinkText("monitor 24");
	
	//Adding to cart.
	By addtocart=By.xpath("//a[@class='btn btn-success btn-lg']");
	
	//Deleting an element from cart.
	By deleting=By.partialLinkText("Delete");
	
	//navigating to CartPage.
	By cartpage=By.id("cartur");
	
	//methods for selecting categories and selecting the product.
	public void phone() {
		driver.findElement(phone).click();
		driver.findElement(selectedphone).click();
		driver.findElement(addtocart).click();
	}
	public void laptops() {
		driver.findElement(laptops).click();
		driver.findElement(selectedlaptop).click();
		driver.findElement(addtocart).click();
	}
	public void monitors() {
		driver.findElement(monitors).click();
		driver.findElement(selectedmonitors).click();
		driver.findElement(addtocart).click();
	}
	//Navigate back to home page.
	public void backto() {
		driver.navigate().back();
		driver.navigate().back();
	}
	//Deleting the product from cart.
	public void deletingFromCart() {
		driver.findElement(deleting).click();
	}
	//Navigating to cart page.
	public void cartpage() {
		driver.findElement(cartpage).click();
	}
}
