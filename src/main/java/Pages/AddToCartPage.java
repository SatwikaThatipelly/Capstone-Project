package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage {
	WebDriver driver;
	public AddToCartPage(WebDriver driver) {
		this.driver=driver;
	}

	/*
	 * //navigating to home page. By home=By.xpath("(//a[@class='nav-link'])[1]");
	 */
	//categories in the page.
	By phone=By.xpath("(//a[@id='itemc'])[1]");
	By laptops=By.xpath("(//a[@id='itemc'])[2]");
	By monitors =By.xpath("(//a[@id='itemc'])[3]");
	
	//selecting productes.
	By selectedphone=By.partialLinkText("galaxy s6");
	//By selectedlaptop=By.partialLinkText("vaio i5");
	By selectedmonitors=By.partialLinkText("monitor 24");
	
	//Adding to cart.
	By addtocart=By.xpath("//a[@class='btn btn-success btn-lg']");
	
	//navigating to CartPage.
	By cartpage=By.id("cartur");
	
	//methods for calling categories.
	public void phone() {
		driver.findElement(phone).click();
		driver.findElement(selectedphone).click();
		driver.findElement(addtocart).click();
	}
	public void laptops() {
		driver.findElement(laptops).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("vaio i5"))).click();;
		//driver.findElement(selectedlaptop).click();
		driver.findElement(addtocart).click();
	}
	public void monitors() {
		driver.findElement(monitors).click();
		driver.findElement(selectedmonitors).click();
		driver.findElement(addtocart).click();
	}
	public void backto() {
		driver.navigate().back();
		driver.navigate().back();
	}
	
	/*
	 * //Selecting products public void selectingphone() {
	 * driver.findElement(selectedphone).click(); } public void selectinglaptops() {
	 * driver.findElement(selectedlaptop).click(); } public void selectingmonitors()
	 * { driver.findElement(selectedmonitors).click(); }
	 */
	
	/*
	 * //Adding to the cart public void adding_to_cart() {
	 * driver.findElement(addtocart).click(); }
	 */
	
	//navigating to cart page
	public void cartpage() {
		driver.findElement(cartpage).click();
	}
}
