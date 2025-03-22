package myrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\satwi\\eclipse-workspace\\Capstone\\src\\test\\java\\feature\\Login.feature",
        glue = "StepDef",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        tags="@Login",
        monochrome=true
)
public class LoginRunner  {

}
