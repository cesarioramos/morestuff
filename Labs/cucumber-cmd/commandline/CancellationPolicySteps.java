package commandline;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.PendingException;
import java.util.Map;

public class CancellationPolicySteps {

@Given("^a normal customer$")
public void aNormalCustomer() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^given a reservation fee of (\\d+) dollars$")
public void givenAReservationFeeOfDollars(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^the customer cancels (\\d+) days before arrival date$")
public void theCustomerCancelsDaysBeforeArrivalDate(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^ensure the cancellation penalty is (\\d+)\\.(\\d+) dollars$")
public void ensureTheCancellationPenaltyIsDollars(int arg1, int arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^a list$")
public void aList(Map<String, Integer> arg1) throws Throwable {
    throw new PendingException();
}


}
