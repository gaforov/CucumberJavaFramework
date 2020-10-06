package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/FeatureWithTags"
		,glue = {"runners"} //<==runner package, not steps, careful here. 
		,monochrome = true
		,plugin = {"pretty", "html:target/HtmlReports" , "json:target/JSONReports/report.json"
				            ,"junit:target/JUnitReports/report.xml"}
		,tags = {"not @regression"} //<== Tags are case-sensitive, For example, @Smoke and @smoke are two different tags. 
		)
public class TestRunner_RunWithSingleTag {

}
 