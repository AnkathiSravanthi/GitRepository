xpackage samplepackage;

import org.junit.runner.RunWith;

import io.cucumber.core.plugin.PrettyFormatter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/samplepackage/Login.feature",glue= {""}plugin= {Pretty})
public class TestRunner {
  
	public static void main(String[] args) {
		

	}

}
