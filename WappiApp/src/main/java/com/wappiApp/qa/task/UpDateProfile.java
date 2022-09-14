package com.wappiApp.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.wappiApp.qa.userinterfaces.UpDateProfile.CLICK_UPDATE_PROFILE;

public class UpDateProfile implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CLICK_UPDATE_PROFILE));
    }
    public static UpDateProfile upDateProfile(){
        return Tasks.instrumented(UpDateProfile.class);
    }
}

