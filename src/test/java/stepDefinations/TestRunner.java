package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = { "stepDefinations" }, monochrome = true, 
plugin = { "pretty","json:target/cucumber.json" })
public class TestRunner {

}
