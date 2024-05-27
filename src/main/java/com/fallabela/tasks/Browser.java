package com.fallabela.tasks;

import com.fallabela.userinterface.Option;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
public class Browser implements Task {

    private final Option option;

    public Browser(Option option) {
        this.option = option;
    }

    @Override
    @Step("{0} navega en la opcion #option")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(option.url()));

    }
    public static Performable to(Option option) {
        return instrumented(Browser.class, option);
    }
}