package co.com.inacril.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/navegacion.feature",
        glue = {"co.com.inacril.stepdefinitions", "co.com.inacril.utills.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class NavegacionRunner {
}
