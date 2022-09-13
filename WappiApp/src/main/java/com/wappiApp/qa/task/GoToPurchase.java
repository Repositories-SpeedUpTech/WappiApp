package com.wappiApp.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.wappiApp.qa.userinterfaces.Delivery.*;

public class GoToPurchase implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CLOSE_WINDOWS));
        actor.attemptsTo(Click.on(CLICK_IN_THE_HOME));
        actor.attemptsTo(Click.on(CLICK_REQUEST));
        actor.attemptsTo(Click.on(ENTER_CODE));
    }

    public static GoToPurchase goToPurchase() {
        return Tasks.instrumented(GoToPurchase.class);
    }
}

