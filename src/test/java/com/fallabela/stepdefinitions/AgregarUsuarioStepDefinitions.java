package com.fallabela.stepdefinitions;

import com.fallabela.exceptions.UserAssertionErros;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.fallabela.exceptions.UserAssertionErros.ESTADO_NO_CORRECTO;
import static com.fallabela.exceptions.UserAssertionErros.USUARIO_NO_REGISTRADO;
import static com.fallabela.questions.UserQuestions.theExpectedUser;
import static com.fallabela.task.UserTasks.agregarUsuario;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.text.IsEmptyString.isEmptyString;

public class AgregarUsuarioStepDefinitions {

    @When("agrega un usuario con nombre {string} apellido {string} correo {string}")
    public void agregaUnUsuario(String firstName, String lastName, String email) {
        theActorInTheSpotlight().attemptsTo(agregarUsuario( firstName, lastName, email));
    }

    @Then("responda el estado {int}")
    public void respondaElEstado(int status) {
        theActorInTheSpotlight().should(
                seeThatResponse("El estado es correcto",
                        response -> response.statusCode(status))
                        .orComplainWith(UserAssertionErros.class, ESTADO_NO_CORRECTO)
        );
    }

    @Then("el usuario se guarda correctamente")
    public void elUsuarioSeGuardaCorrectamente() {
        theActorInTheSpotlight().should(
                seeThat("el usuario es agregado correctamente",
                        theExpectedUser(), not(isEmptyString())).orComplainWith(UserAssertionErros.class, USUARIO_NO_REGISTRADO)
        );
    }
}