package runnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = { "myntraStepDefinitions",
		"myhooks" }, plugin = { "pretty", "html:cucumberReports.html" } 

)
public class MyRunnrr extends AbstractTestNGCucumberTests {

}
