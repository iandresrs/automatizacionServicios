package io.petstore.swagger.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Petstore.feature",
        glue = "io.petstore.swagger.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class PetstoreRunner {
}
