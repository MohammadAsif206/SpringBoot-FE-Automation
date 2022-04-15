package com.ea.SpringBasic.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/com/ea/SpringBasic/features"},
        glue = "com.ea.SpringBasic.steps"
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
