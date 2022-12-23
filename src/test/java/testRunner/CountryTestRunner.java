package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"/Users/vanchinathanac/Desktop/CucumerSprint1/src/test/java/feature/countries.feature"},
glue = {"stepDefinitionFile"})
public class CountryTestRunner
{

}
