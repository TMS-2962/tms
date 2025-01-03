package hooks;

import java.io.File;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utiles.configReader;
import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Myhooks {
	WebDriver driver;

	// This hook runs before each scenario to set up the environment
	@Before
	public void startUp() {

		Properties prop = configReader.intailzeProperties();
		DriverFactory.invokeBrowser(prop.getProperty("browser"));
		driver = DriverFactory.getdriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(prop.getProperty("url"));

	}

	// This hook runs after each scenario to clean up the environment
	@After
	public void endUp(Scenario scenario) {
		// Get the name of the scenario and replace any spaces (could be useful for
		// naming screenshots)
		String scenarioName = scenario.getName().replaceAll(" ", "_");

		// Capture a screenshot whether the scenario passed or failed
		byte[] srcScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

		// Attach the screenshot to the report
		scenario.attach(srcScreenshot, "image/png", scenarioName);

		// Close and quit the browser after the scenario is finished
		driver.quit();
	}
}
