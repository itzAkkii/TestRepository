package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions 
        (
		   features = ".//src/test/resources//feature//Login5.feature",
		   glue = "stepDefinations",
		   dryRun = false, 
		   monochrome = true,
		   plugin = {"pretty", "html:test"}
		)

public class RunTest {

}
