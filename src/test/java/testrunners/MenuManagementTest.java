package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/linkedinlearning/cucumbercourse/features"},
        glue = {"stepdefinitions", /*"hooks"*/}, //don't need hooks file at the moment
        plugin = {  "pretty",
                    "html:target/SystemTestReports/html",
                    "json:target/SystemTestReports/json/report.json",
                    "junit:target/SystemTestReports/junit/report.xml"   }
        //tags = "not @NightlyBuildTest"
)
public class MenuManagementTest {
}
