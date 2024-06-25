package runners;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict = true,
		//features = "src\\test\\resources\\features    ",
		features = "classpath:features",
		tags = "@addAccountScenario1",
//		tags = "@AddAccountFeature",
//		tags = "@Scenario1 or @Scenario2",
		glue = "steps",
		monochrome = true,
		dryRun =false,
//		dryRun = true,
		plugin = {
			"pretty",
			"html:target/reports/cucumber.html",
			"json:target/reports/cucumber.json"
		}
		)
public class Runner {

}
