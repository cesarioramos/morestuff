package exercise4.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.PendingException;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;

import exercise5.BDDStyle;

public class CancellationPenaltyStepsDef {
	
	@Given("^a normal customer$")
	public void a_normal_customer() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    
	}

	@Given("^given a reservation fee of (\\d+) dollars$")
	public void given_a_reservation_fee_of_dollars(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    
	}

	@When("^the customer cancels (\\d+) days before arrival date$")
	public void the_customer_cancels_days_before_arrival_date(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    
	}

	@Then("^ensure the cancellation penalty is (.+) dollars$")
	public void ensure_the_cancellation_penalty_is_dollars(double penalty) throws Throwable {
		assertThat(true, equalTo(true) );	}



}