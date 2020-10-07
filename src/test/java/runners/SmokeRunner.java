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
				"pretty", "html:target/cucumber-html-report", "json:target/cucumber-reports/cucumber.json", 
				"junit:target/cucumber-reports/cucumber.xml", //"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		,tags = "@Smoke" //logical operator is case sensitive, only lower.
		)



public class SmokeRunner {

}
