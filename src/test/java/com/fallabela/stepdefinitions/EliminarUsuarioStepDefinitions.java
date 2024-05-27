package com.fallabela.stepdefinitions;

import com.fallabela.exceptions.UserAssertionErros;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.fallabela.exceptions.UserAssertionErros.USUARIO_NO_ELIMINADO;
import static com.fallabela.task.UserTasks.eliminarUsuarioId;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.core.IsEqual.equalTo;

public class EliminarUsuarioStepDefinitions {

    @When("elimina el usuario con el id {string}")
    public void eliminaElUsuarioConElId(int id) {
        theActorInTheSpotlight().attemptsTo(eliminarUsuarioId(id));
    }

    @Then("el usuario con nombre {string} y apellido {string} debe ser eliminado")
    public void elUsuarioConNombreYApellidoDebeSerEliminado(String nombre, String apellido) {
        theActorInTheSpotlight().should(
                seeThatResponse("El usuario se eliminó correctamente",
                        response -> response
                                .body("data.first_name", equalTo(nombre))
                                .body("data.last_name", equalTo(apellido)))
                        .orComplainWith(UserAssertionErros.class, USUARIO_NO_ELIMINADO)
        );
    }
}
