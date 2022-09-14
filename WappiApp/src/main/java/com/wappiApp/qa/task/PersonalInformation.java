package com.wappiApp.qa.task;

import com.wappiApp.qa.models.UpDateData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.wappiApp.qa.userinterfaces.UpDateProfile.*;

public class PersonalInformation implements Task {

    private UpDateData upDateData;


    public PersonalInformation(UpDateData data){
        this.upDateData = data;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(upDateData.getName()).into(NAME_PROFILE));
        actor.attemptsTo(Enter.theValue(upDateData.getLastname()).into(LAST_NAME_PROFILE ));
        actor.attemptsTo(Enter.theValue(upDateData.getDate()).into(DATE_PROFILE));
        /*actor.attemptsTo(Click.on(COUNTRY_PROFILE));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(SELECT_COUNTRY));*/

    }
    public static PersonalInformation personalInformation(UpDateData dateData){
        return new PersonalInformation(dateData);
    }
}

