package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class CheckOutPage {
    WebDriver driver;

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By placeorder = By.xpath("//button[@class='btn btn-success']");
    By namefield = By.id("name");
    By countryfield = By.id("country");
    By cityfield = By.id("city");
    By creditcardfield = By.id("card");
    By monthfiels = By.id("month");
    By yearfiels = By.id("year");
    By purchase = By.xpath("(//button[@class='btn btn-primary'])[3]");
    By ok = By.xpath("//button[@class='confirm btn btn-lg btn-primary']");

    // Fluent Wait method
    private WebElement fluentWait(By locator) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30)) // Set the maximum wait time
                .pollingEvery(Duration.ofSeconds(5)) // Set the polling interval
                .ignoring(NoSuchElementException.class); // Ignore specific exceptions

        return wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
    }

    // Method to click the place order button
    public void clickPlaceOrder() {
        fluentWait(placeorder).click();
    }

    // Method to enter purchase details
    public void enterPurchaseDetails(String name, String country, String city, String creditcard, String month, String year) {
        fluentWait(namefield).sendKeys(name);
        fluentWait(countryfield).sendKeys(country);
        fluentWait(cityfield).sendKeys(city);
        fluentWait(creditcardfield).sendKeys(creditcard);
        fluentWait(monthfiels).sendKeys(month);
        fluentWait(yearfiels).sendKeys(year);
    }

    // Method to confirm purchase
    public void confirmPurchase() {
        fluentWait(purchase).click();
    }

    // Method to click the OK button
    public void ok() {
        fluentWait(ok).click();
    }
}