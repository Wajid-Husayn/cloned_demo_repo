package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class tags {

	@Given("this is a")
	public void this_is_a() {
		System.out.println("this is a");

	}

	@When("this is b")
	public void this_is_b() {
		System.out.println("this is b");

	}

	@And("this is c")
	public void this_is_c() {
		System.out.println("this is c");

	}
}
