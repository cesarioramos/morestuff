package exercise5;

import java.io.File;
import org.junit.Before;
import org.junit.Test;

import fitnesse.junit.JUnitHelper;

public class BDDStyleTest {
  JUnitHelper helper;

  @Before
  public void prepare() {
    helper = new JUnitHelper("src/test/fitnesse/",
      new File(System.getProperty("java.io.tmpdir"), "fitnesse").getAbsolutePath());
  }

  @Test
  public void exampleTestingaSingleTest() throws Exception {
    String testName = "AgiliX.AcceptanceTestDrivenDevelopment.BddStyle";
    helper.assertTestPasses(testName);
  }
}
