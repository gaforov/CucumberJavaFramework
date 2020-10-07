package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features"
		,glue = "steps"
		,monochrome = true
		,plugin = {
				"pretty", "json:target/cucumber.json",  "html:target/HtmlReports",
				"json:target/JSONReports/report.json"
		}
		,tags = "@Regression"
		)



public class RegressionRunner {

}
