package exercise4;

import fitnesse.ContextConfigurator;
import fitnesse.FitNesseContext;
import fitnesse.junit.JUnitHelper;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class JUnitHelperExampleTest {
  JUnitHelper helper;

  @Before
  public void prepare() {
    helper = new JUnitHelper("src/test/fitnesse/",
     new File(System.getProperty("java.io.tmpdir"), "fitnesse").getAbsolutePath());
      
  }

  @Test
  public void exampleTestingaSingleTest() throws Exception {
    String testName = "AgiliX.AcceptanceTestDrivenDevelopment.LearningTheWiki.SprintZero.HelloWorld";
    helper.assertTestPasses(testName);    
  }

  @Test
  public void exampleTestingASuite() throws Exception {
    helper.assertSuitePasses("AgiliX.AcceptanceTestDrivenDevelopment.LearningTheWiki.SprintZero");
    
    String[] tests = new String[] { 
    		"AgiliX.AcceptanceTestDrivenDevelopment.LearningTheWiki.SprintZero.HelloWorld",
    		"AgiliX.AcceptanceTestDrivenDevelopment.LearningTheWiki.SprintZero.SimpleAtm",
    		"AgiliX.AcceptanceTestDrivenDevelopment.LearningTheWiki.SprintZero.SimpleCalculatorSpecification",
    };
    
  }


}