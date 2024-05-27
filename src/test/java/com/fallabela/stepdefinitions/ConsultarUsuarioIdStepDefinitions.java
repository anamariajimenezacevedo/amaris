package com.fallabela.stepdefinitions;

import com.fallabela.exceptions.UserAssertionErros;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.fallabela.exceptions.UserAssertionErros.USUARIO_NO_ENCONTRADO;
import static com.fallabela.task.UserTasks.consultarUsuarioId;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.core.IsEqual.equalTo;

public class ConsultarUsuarioIdStepDefinitions {

    @When("encuentra el usuario con el id {string}")
    public void encuntraElUsuarioConElId(int id) {
        theActorInTheSpotlight().attemptsTo(consultarUsuarioId(id));
    }

    @Then("el usuario con nombre {string} y apellido {string} debe ser correcto")
    public void elUsuarioConNombreYApellidoDebeSerCorrecto(String nombre, String apellido) {
        theActorInTheSpotlight().should(
                seeThatResponse("Los datos del usuario son correctos",
                        response -> response
                                .body("data.first_name", equalTo(nombre))
                                .body("data.last_name", equalTo(apellido)))
                        .orComplainWith(UserAssertionErros.class, USUARIO_NO_ENCONTRADO)
        );
    }

}