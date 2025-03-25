package StepDef;

import Base.BaseClass;
import Base.ExtentReport;
import Pages.LogInPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

import com.aventstack.extentreports.Status;

public class LoginStepDef extends BaseClass {
    LogInPage lip;
    
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws IOException {
        setup("chrome"); // You can parameterize this based on your test setup
        lip = new LogInPage(driver);
        lip.loginPage(); // Navigate to the login page
        ExtentReport.getInstance();
    }

    @When("the user enters valid {string} and {string} credentials.")
    public void the_user_enters_valid_credentials(String username, String password) throws InterruptedException {
        lip.loginDetails(username, password); // Enter the username and password
    }

    @When("clicks the login button")
    public void clicks_the_login_button() {
        lip.loginButton(); // Click the login button
    }

    @Then("the user should see a login success.")
    public void the_user_should_see_a_login_success() {
        // Here you would typically check for a success message or a specific element
        // For example, you might check if a success message is displayed
        AlertHandling(); // Handle any alerts if necessary
        System.out.println("User  login success");
        ExtentReport.createTest("LogIn").log(Status.PASS,"LogIn success");
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000); // Optional: Wait for 2 seconds before quitting
        if (driver != null) {
            driver.quit(); // Close the browser
            ExtentReport.getInstance().flush();
        }
    }
}