package com.homeoffice.demo.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile",
        glue = "com/homeoffice/demo",
        tags = "@smoke",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)
public class SmokeTestRunner {
}
