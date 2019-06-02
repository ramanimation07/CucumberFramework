package myrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\welcome\\eclipse-workspace\\CucumberFramework\\src\\main\\java\\features\\Login.feature"
 ,glue={"stepdefinitions"}
 )

public class TestRunner {

}
