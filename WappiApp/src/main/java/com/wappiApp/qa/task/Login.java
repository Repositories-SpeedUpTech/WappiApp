package com.wappiApp.qa.task;

import com.wappiApp.qa.models.CredentialData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.wappiApp.qa.userinterfaces.Login.*;

public class Login implements Task {

    private CredentialData credentialData;

    public Login(CredentialData credentialData){
        this.credentialData = credentialData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credentialData.getUsername()).into(ENTER_USER_NAME));
        actor.attemptsTo(Enter.theValue(credentialData.getUsername()).into(ENTER_PASSWORD));
        actor.attemptsTo(Click.on(ENTER_LOGIN));
    }
    public static Login withData(CredentialData credentialData){
        return new Login(credentialData);
    }
}

