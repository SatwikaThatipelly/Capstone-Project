package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.google.common.io.Files;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public String username;
	public String password;
	public String url;
	//reading data from properties file.
	public void readData() throws IOException {
		FileInputStream fis=new FileInputStream("src\\main\\java\\Utilities\\data.properties");
		prop.load(fis);
		fis.close();
		ExtentReport.getInstance();
	}
	@BeforeClass
	@Parameters("browser")
	//invoking browser.
	public void setup(String browser) throws IOException {
		readData();
		username=prop.getProperty("username");
		password=prop.getProperty("password");
		url=prop.getProperty("url");
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("Please enter a valid browser name");
		}
		// common elements.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	//Handling alert method.
	public void AlertHandling() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
		System.out.println("The alert : "+alert.getText());
		alert.accept();
		}catch(Exception e) {
			System.out.println("No alert is present");
		}
	}
	//scrolling down. 
	public void scrolldown(int xaxis,int yaxis) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
	}
	// screenshot method.
	public void screenshot() throws IOException {
		File src2=null;
		src2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src2, new File("./screenshots1/"+"page"+System.currentTimeMillis()+".png"));
	}
	//closing the website.
	@AfterClass
	public void traedown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		ExtentReport.getInstance().flush();
	}
	
}
