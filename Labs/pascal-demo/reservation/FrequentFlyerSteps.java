package reservation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.PendingException;
import java.util.Map;

public class FrequentFlyerSteps {

  @Given("^a frequent flyer \"([^\"]*)\"$")
  public void aFrequentFlyer(String name) throws Throwable {
      // Write code here that turns the phrase above into concrete actions
      System.out.println("Name = " + name);
  }

  @Given("^given a reservation of (\\d+) dollar$")
  public void givenAReservationOfDollar(int arg1) throws Throwable {
      // Write code here that turns the phrase above into concrete actions
  }

  @When("^the reservation is cancelled$")
  public void theReservationIsCancelled() throws Throwable {
      // Write code here that turns the phrase above into concrete actions
  }

  @Then("^the frequent flyer gets (\\d+) dollar back$")
  public void theFrequentFlyerGetsDollarBack(int arg1) throws Throwable {
      // Write code here that turns the phrase above into concrete actions
  }

  @Then("^the frequent flyer gets (\\d+\\.\\d+) dollar back$")
public void the_frequent_flyer_gets_dollar_back(double amount) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Amount = " + amount);

}
}
