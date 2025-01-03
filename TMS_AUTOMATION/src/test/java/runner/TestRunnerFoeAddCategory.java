package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/CategoryGrop.feature", publish = true, glue = {
		"stepdfination", "hooks" }, plugin = { "pretty", "html:target/CucumberReports/CucumberReports.html" })
public class TestRunnerFoeAddCategory {

}
