package demo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.PendingException;
import java.util.Map;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class DemoSteps {

int nr1, nr2, result;

  @Given("^number (\\d+)$")
public void number(int arg1) throws Throwable {
  nr1 = arg1;
}

@Given("^given number (\\d+)$")
public void given_number(int arg1) throws Throwable {
  nr2 = arg1;
}

@When("^I add them$")
public void i_add_them() throws Throwable {
  result = nr1 + nr2;
}

@Then("^the total should be (\\d+)$")
public void the_total_should_be(int arg1) throws Throwable {
  assertThat(arg1, equalTo(result) );	
}
}
