package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/feature/SeleniumCucumber_Project3.feature"},
glue = {"stepDefinition"}
)

public class SeleniumProjectRunner2 {

}




