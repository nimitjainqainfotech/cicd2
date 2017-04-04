package runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinations {

	@Given("^I am on the maven project$")
	public void i_am_on_the_maven_project() throws Throwable {
		System.out.println("1");
	}

	@Then("^I run it using maven$")
	public void i_run_it_using_maven() throws Throwable {
		System.out.println("1");

	}

	@Then("^result comes$")
	public void result_comes() throws Throwable {
		System.out.println("1");

	}
}
