package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/feature/GoogleLaunch.feature"},
glue = {"stepDefinition"},
//tags = {"@mayuri"}//Execution of one tag 
//tags = {"@sanity", "@regression"}//and condition 
//tags = {"@mayuri,@sanity"}
tags = {"@full", "~@mayuri"}//execute feature with full tag except mayuri tag
)



public class TestRunner {

}
