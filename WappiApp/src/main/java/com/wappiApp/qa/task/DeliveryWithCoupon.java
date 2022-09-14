package com.wappiApp.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.wappiApp.qa.userinterfaces.Delivery.*;

public class DeliveryWithCoupon implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(GET_COUPON));
            }

    public static DeliveryWithCoupon deliveryWithCoupon() {
        return Tasks.instrumented(DeliveryWithCoupon.class);
    }
}

