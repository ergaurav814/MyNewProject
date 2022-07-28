
package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/features",
		glue="Stepdefinition",stepNotifications=true) // Step notification will show output on level basis

public class TestRunner {

}

