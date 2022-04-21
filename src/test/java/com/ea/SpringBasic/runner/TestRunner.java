package com.ea.SpringBasic.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = {"src/test/java/com/ea/SpringBasic/features"},
       // plugin = {"json:target/cucumber-report.json", "pretty"},
        plugin = {"target/cucumber-report-html/cucumber-report","pretty"},
        glue = "com.ea.SpringBasic.steps",
        tags = "@PAGE"
)
public class TestRunner extends AbstractTestNGCucumberTests {

    //Single execution
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
