package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.Plugin;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue = "org.stepdefinition",
monochrome = true,
dryRun = false,
tags = {"@Sanity"},
plugin ={"html:report1", "junit:report1\\junitreport.xml", "json:report1\\jsonreport.json"}
)

public class TestRunner {
}
