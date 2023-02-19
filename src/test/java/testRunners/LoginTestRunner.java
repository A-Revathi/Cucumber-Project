package testRunners;

import org.junit.runner.RunWith;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue = "steps",
	//	tags = "@Login",
	//	tags = "@LoginScenario1,@OtherLoginScenario2 ", 
		tags = "@DBLoginScenario1",
		
		monochrome = true,
	//	dryRun = false,
		plugin = {
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json"
		}
		
		)
public class LoginTestRunner {

}
