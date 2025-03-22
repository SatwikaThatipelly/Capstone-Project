package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
	WebDriver driver;
	public LogInPage(WebDriver driver) {
		this.driver=driver;
	}
	//elements in login page.
	By loginPage=By.id("login2");
	By userName=By.id("loginusername");
	By password=By.id("loginpassword");
	By loginButton=By.xpath("(//button[@class='btn btn-primary'])[3]");
	By closeButton=By.xpath("(//button[@class='btn btn-secondary'])[3]");
	
	//methods to invoke these elements.
	public void loginPage() {
		driver.findElement(loginPage).click();
	}
	public void loginDetails(String username,String Password) throws InterruptedException {
		driver.findElement(userName).sendKeys(username);
		Thread.sleep(2000);		
		driver.findElement(password).sendKeys(Password);
		Thread.sleep(2000);
	}
	public void loginButton() {
		driver.findElement(loginButton).click();
	}
	public void closeButton() {
		driver.findElement(closeButton).click();
	}
}
