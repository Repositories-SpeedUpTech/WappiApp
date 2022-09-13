package com.wappiApp.qa.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static com.wappiApp.qa.userinterfaces.Delivery.COPY_COUPON;

public class Delivery implements Question<String>{

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(COPY_COUPON).getText();
    }

    public static Delivery message(){
        return new Delivery();
    }
}

