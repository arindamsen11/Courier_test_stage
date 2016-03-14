package cucumberController;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
			features={"src/test/resources/Features"},
			tags={"@Test1"},
			glue={"testCases"},
			monochrome= true,
			strict=true,
			plugin = {
								"pretty",
								"html:target/cucmber",
								"junit:target_junit/cucumber.xml"
								}
		)



public class CucumberDriver {

}
