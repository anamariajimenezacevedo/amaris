package com.fallabela.stepdefinitions;

import com.fallabela.tasks.Browser;
import com.fallabela.tasks.FallabelaHome;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.fallabela.userinterface.Option.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FallabelaTestStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Ana");
        theActorInTheSpotlight().wasAbleTo(Browser.to(FALLABELA));
    }

    @Given("^el usuario ingrese a las categorias$")
    public void elUsuarioIngreseALasCategorias(){
        theActorInTheSpotlight().wasAbleTo(
                FallabelaHome.to());
    }

    @When("^el usuario selecciona los articulos deportivos$")
    public void elUsuarioSeleccionaLosArticulosDeportivos(){
        theActorInTheSpotlight().attemptsTo(
        )
    }

    @Then("^validamos el valor total$")
    public void validamosElValorTotal(){

    }
}