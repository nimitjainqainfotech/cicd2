package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", "html:target/cucumber-report.html"
				},
		features = "src/test/resources/features/"
		)
public class CucmberRunnerTest {

}
