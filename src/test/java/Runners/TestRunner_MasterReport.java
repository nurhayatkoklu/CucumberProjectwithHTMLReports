package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"},
        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}

)

public class TestRunner_MasterReport extends AbstractTestNGCucumberTests {



}
