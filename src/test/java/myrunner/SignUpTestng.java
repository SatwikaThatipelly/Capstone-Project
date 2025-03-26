package myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\satwi\\eclipse-workspace\\Capstone\\src\\test\\java\\feature\\SignUp.feature",
        glue = "StepDef",
        plugin = {"pretty", "html:target/cucumber-reports.html"},monochrome=true, tags = "@signup"
)
public class SignUpTestng extends AbstractTestNGCucumberTests{

}
