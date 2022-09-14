package com.wappiApp.qa.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.wappiApp.qa.userinterfaces.Login.CONFIRM_MESSAGE;

public class Login implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((CONFIRM_MESSAGE), WebElementStateMatchers.isVisible()));
        return Text.of(CONFIRM_MESSAGE).viewedBy(actor).asString();
    }
    public static Login message(){
        return new Login();
    }
}

