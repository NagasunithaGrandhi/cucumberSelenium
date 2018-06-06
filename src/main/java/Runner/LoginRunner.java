package Runner;

import org.testng.annotations.Test;

//import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)

@CucumberOptions(features= "C:\\Users\\sunit_000\\Desktop\\testing\\cucumberProject\\src\\main\\java\\Features",
glue= {"StepDefinitions"},format= {"pretty","html:test-out","json:test-json/cucumber.json","junit:junit-xml/junit.xml"},
monochrome=true,//it will disply a pretty output in console
dryRun=false//
//strict=true
)
@Test
public class LoginRunner extends AbstractTestNGCucumberTests {

}
