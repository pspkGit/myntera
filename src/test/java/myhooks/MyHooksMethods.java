package myhooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import basic.LaunchBrowser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooksMethods extends LaunchBrowser {

	@Before
	public void launchhh() {
		LaunchBrowser.initialize();

	}

	@After
	public void closeBrowser(Scenario scenario) {
		String scenarioName = scenario.getName().replaceAll(" ", "_");
		if (scenario.isFailed()) {
			byte[] failedSS = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(failedSS, "image/png", scenarioName);
		}

		driver.close();
	}
}
