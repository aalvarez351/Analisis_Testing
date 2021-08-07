package co.com.choucair.certification.proyectobase.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/RetoTesting.feature",
        tags = "@stories1",
        glue = "co.com.choucair.certificacion.proyectobase.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTagsReto {
}

