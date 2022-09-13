package com.wappiApp.qa.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static com.wappiApp.qa.userinterfaces.UpDateProfile.CONFIRM_PURCHASE;

public class ConfirmThePurchase implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((CONFIRM_PURCHASE), WebElementStateMatchers.isVisible()));
        return Text.of(CONFIRM_PURCHASE).viewedBy(actor).asString();
    }

    public static ConfirmThePurchase message(){
        return new ConfirmThePurchase();
    }
}

