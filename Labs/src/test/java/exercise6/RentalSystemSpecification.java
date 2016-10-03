package exercise6;

import java.io.File;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import fitnesse.junit.JUnitHelper;

public class RentalSystemSpecification {
  JUnitHelper helper;

  @Before
  public void prepare() {
    helper = new JUnitHelper("src/test/fitnesse/",
      new File(System.getProperty("java.io.tmpdir"), "fitnesse").getAbsolutePath());
  }

  @Test
  public void exampleTestingaSingleTest() throws Exception {
    String testName = "AgiliX.AcceptanceTestDrivenDevelopment.CashRentals";
    helper.assertTestPasses(testName);
  }
}