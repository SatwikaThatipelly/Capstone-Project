package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPagePf {
	WebDriver driver;
	// constructor.
	public SignUpPagePf(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="signin2")WebElement signuppage;
	@FindBy(id="sign-username")WebElement userName;
	@FindBy(id="sign-password")WebElement Password;
	@FindBy(xpath="(//button[@class='btn btn-primary'])[2]")WebElement signupbutton;
	@FindBy(xpath="(//button[@class='btn btn-secondary'])[2]")WebElement closebutton;
	
	public void signuppage() {
		signuppage.click();
	}
	public void userDetails(String username,String password) {
		userName.sendKeys(username);
		Password.sendKeys(password);
	}
	public void SignUpButton() {
		signupbutton.click();
	}
	public void CloseButton() {
		closebutton.click();
	}
}
