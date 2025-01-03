package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/LoginTMs.feature", // Path to your feature file
        glue = { "stepdefinitions", "hooks" }, // Path to your step definitions and hooks
        plugin = {
                "pretty", // For pretty console output
                "json:target/cucumber-reports/cucumber.json", // Generates a JSON report
                "html:target/cucumber-reports/cucumber.html" // Generates an HTML report
        },
        publish = true // Optional: Publish results to Cucumber cloud
)
public class TestRunnerLoginPlugin {
}
