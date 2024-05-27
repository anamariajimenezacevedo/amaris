package com.fallabela.tasks;

import net.serenitybdd.screenplay.Task;

import static com.fallabela.userinterface.HomePage.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Wait;
import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.NoSuchElementException;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FallabelaHome implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    Wait.until(WebElementQuestion.the(TITULO_NO_GRACIAS),WebElementStateMatchers.isEnabled()
                    ).forNoLongerThan(30).seconds(),
                    Click.on(TITULO_NO_GRACIAS),
                    Click.on(TITULO_MENU),
                    Click.on(CATEGORIA_CELULAR),
                    Click.on(CATEGORIA_INFINIX));
        } catch (
                NoSuchElementException e) {
            throw new ElementException(ElementException.MESSAGE_FAILED, e);
        }

    }
    public static FallabelaHome to() {
        return instrumented(FallabelaHome);
    }
}