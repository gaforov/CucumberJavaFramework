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
				"pretty", "json:target/Regression-Reports/cucumber.json",  "html:target/Regression-Reports/HtmlReports", 
				"junit:target/Regression-Reports/JUnitReports/cucumber.xml"
		}
		,tags = "@Regression"
		)



public class RegressionRunner {

}
