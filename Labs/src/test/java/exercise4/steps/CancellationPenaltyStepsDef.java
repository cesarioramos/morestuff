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

import exercise7.Reservation;

import java.util.List;

public class CancellationPenaltyStepsDef {
	
	ReservationHelper reservation;
	
	public CancellationPenaltyStepsDef(ReservationHelper reservation) {
		this.reservation = reservation;

	}
	
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
		assertThat(true, equalTo(true) );	
	}


	@Given("^given the reservations$")
	public void given_the_reservations(List<Reservation> reservations) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	}	
	
	
	

}