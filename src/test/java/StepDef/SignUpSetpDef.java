package StepDef;

import Base.BaseClass;
import Base.ExtentReport;
import Pages.SignUpPagePf;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SignUpSetpDef extends BaseClass {
    SignUpPagePf signUpPage;

    @Given("the user is on the signup page")
    public void the_user_is_on_the_signup_page() throws Exception {
        setup("chrome"); // You can parameterize this
        signUpPage = new SignUpPagePf(driver);
        signUpPage.signuppage();
    }

    @When("the user enters valid username and password")
    public void the_user_enters_valid_username_and_password() {
        signUpPage.userDetails(username, password);
    }
    @When("clicks the signup button")
    public void clicks_the_signup_button() {
        signUpPage.SignUpButton();
    }
    @Then("the user should see a success message.")
    public void the_user_should_see_a_success_message() {
    	AlertHandling();
        System.out.println("StepDef success");
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000); // Optional: Wait for 2 seconds before quitting
        driver.quit();
        ExtentReport.getInstance().flush(); // If you are using Extent Reports
    }
}