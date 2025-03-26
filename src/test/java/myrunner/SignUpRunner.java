package myrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\satwi\\eclipse-workspace\\Capstone\\src\\test\\java\\feature\\SignUp.feature",
        glue = "StepDef",
        plugin = {"pretty", "html:target/cucumber-reports.html"},monochrome=true,tags = "@signup"
)
public class SignUpRunner {

}