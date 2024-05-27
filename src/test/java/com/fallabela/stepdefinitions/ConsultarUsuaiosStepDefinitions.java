package com.fallabela.stepdefinitions;

import com.fallabela.exceptions.UserAssertionErros;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.fallabela.exceptions.UserAssertionErros.LISTA_INCOMPLETA;
import static com.fallabela.questions.UserQuestions.allTheExpectedUsers;
import static com.fallabela.task.UserTasks.listaTodosUsuarios;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.hasSize;

public class ConsultarUsuaiosStepDefinitions {

    @When("liste todos los usuarios")
    public void listeTodosLosUsuarios() {
        theActorInTheSpotlight().attemptsTo(listaTodosUsuarios());
    }

    @Then("todos los usuarios {int} esperados deben de ser listados")
    public void todosLosUsuariosEsperadosDebenDeSerListados(int usuarios) {
        theActorInTheSpotlight().should(
                seeThat("todos los usuarios deben de ser listados",
                        allTheExpectedUsers(), hasSize(usuarios))
                        .orComplainWith(UserAssertionErros.class, LISTA_INCOMPLETA)
        );
    }
}