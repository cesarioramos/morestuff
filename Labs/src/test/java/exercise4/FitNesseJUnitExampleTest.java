package exercise4;

import org.junit.Test;
import org.junit.runner.RunWith;

import fitnesse.junit.FitNesseRunner;
import org.junit.runner.RunWith;

@RunWith(FitNesseRunner.class)
@FitNesseRunner.Suite("AgiliX.AcceptanceTestDrivenDevelopment.LearningTheWiki.SprintZero")
@FitNesseRunner.FitnesseDir("src/test/fitnesse/")
@FitNesseRunner.OutputDir(systemProperty = "java.io.tmpdir", pathExtension = "fitnesse")
public class FitNesseJUnitExampleTest {
	 
	@Test
	public void dummy() {
	    
	  }
}



