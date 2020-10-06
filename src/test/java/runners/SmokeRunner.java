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
				"pretty", "json:target/cucumber.json"
		}
		,tags = "@Smoke" //logical operator is case sensitive, only lower.
		)



public class SmokeRunner {

}
