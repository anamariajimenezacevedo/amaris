package com.fallabela.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/eliminar_usuario.feature"},
        glue = {"com.fallabela.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class EliminarUsuarioTest {
}
