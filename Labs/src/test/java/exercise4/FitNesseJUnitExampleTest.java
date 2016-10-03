package exercise4;

import org.junit.Test;
import org.junit.runner.RunWith;

import fitnesse.junit.FitNesseSuite;
import fitnesse.junit.FitNesseSuite.FitnesseDir;
import fitnesse.junit.FitNesseSuite.Name;
import fitnesse.junit.FitNesseSuite.OutputDir;

@RunWith(FitNesseSuite.class)
@Name("AgiliX.AcceptanceTestDrivenDevelopment.LearningTheWiki.SprintZero")
@FitnesseDir("src/test/fitnesse/")
@OutputDir(systemProperty = "java.io.tmpdir", pathExtension = "fitnesse")

public class FitNesseJUnitExampleTest {
	 
	@Test
	public void dummy() {
	    
	  }
}
