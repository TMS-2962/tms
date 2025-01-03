package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/LoginTMs.feature", // Path to your feature file(s)
		glue = { "stepdefinitions", "hooks" }, // Path to your step definitions and hooks (if any)
		plugin = { "pretty", // Print console output in a readable format
				"html:target/CucumberReports/CucumberReports.html", // Generate HTML report in the specified location
				"json:target/cucumber-report/cucumber.json" // Optional: Generate JSON report for further analysis or
															// integration
		}, publish = true // Publish the test results to a remote server (optional, depends on the CI
							// setup)
)
public class TestRunnerLogin1 {
}
