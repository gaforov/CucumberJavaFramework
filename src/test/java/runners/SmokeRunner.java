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
				"pretty", "json:target/Smoke-Reports/cucumber.json",  "html:target/Smoke-Reports/HtmlReports", 
				"junit:target/Smoke-Reports/JUnitReports/cucumber.xml", //"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		,tags = "@Smoke" //logical operator is case sensitive, only lower.
		)



public class SmokeRunner {

}
