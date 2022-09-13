package com.wappiApp.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.wappiApp.qa.userinterfaces.Delivery.CLICK_REQUEST;
import static com.wappiApp.qa.userinterfaces.Delivery.CONFIRM_REQUEST;

public class Delivery implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CLICK_REQUEST));
        actor.attemptsTo(Click.on(CONFIRM_REQUEST));
    }

    public static Delivery delivery(){
        return Tasks.instrumented(Delivery.class);
    }
}

