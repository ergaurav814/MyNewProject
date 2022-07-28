package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(   // we dont have run function to run junit test so we will have to EXTEND teh current class
		features ="src/test/java/features/login.feature",
		glue="Stepdefinition",monochrome=true,plugin={
			"html:target/cucumber-html-report","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
