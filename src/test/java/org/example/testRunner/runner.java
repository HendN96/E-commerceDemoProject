package org.example.testRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features="src/main/resources/features",
        glue={"org.example.stepDefinitions"},
        plugin={  "pretty",
        "html:target/cucumber.html",
        "json:target/cucumber.json",
        "junit:target/cukes.xml",
        "rerun:target/rerun.txt"},
        tags="@smoke"
        )

public class runner extends AbstractTestNGCucumberTests {
}
