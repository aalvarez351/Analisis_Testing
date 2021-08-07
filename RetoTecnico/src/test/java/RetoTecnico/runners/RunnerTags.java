package RetoTecnico.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/RetoTesting.feature",
        tags = "@stories1",
        glue = "RetoTecnico.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
class RunnerTags {
}
