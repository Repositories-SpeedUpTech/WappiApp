package com.wappiApp.qa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "classpath:feature/upDateProfile.feature"
        , glue = "classpath:com.wappiApp.qa.stepdefinition"
        , snippets = SnippetType.CAMELCASE)

public class UpDateProfileRunner {
}

