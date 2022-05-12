package co.com.choucair.pruebasrest.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/crear_un_usuario.feature"},
        glue = {"co.com.choucair.pruebasrest.stepdefinitions",
                "co.com.choucair.pruebasrest.utils"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RestCreateUser {
}
