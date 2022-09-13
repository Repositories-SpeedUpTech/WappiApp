package com.wappiApp.qa.stepdefinition;



import com.wappiApp.qa.question.ConfirmThePurchase;
import com.wappiApp.qa.task.Delivery;
import com.wappiApp.qa.task.DeliveryWithCoupon;
import com.wappiApp.qa.task.GoToPurchase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.apache.tools.ant.taskdefs.optional.ejb.BorlandGenerateClient;
import org.openqa.selenium.WebDriver;

import static com.wappiApp.qa.userinterfaces.Delivery.CONFIRM_REQUEST;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CreateDeliveryStepDefinition {
    @Managed
    private static WebDriver myBrowser;

    @Before
    public static void setUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Carolina Ceballos");
    }

    @When("^the user click on a product and on the request button$")
    public void theUserClickOnAProductAndOnTheRequestButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(Delivery.delivery());
    }

    @Then("^the user confirm the order(.*)$")
    public void theUserConfirmTheOrder(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ConfirmThePurchase.message(),org.hamcrest.Matchers.is(message)));

    }

    @When("^the user click on get coupon button$")
    public void theUserClickOnGetCouponButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(DeliveryWithCoupon.deliveryWithCoupon());
    }

    String Copy_Coupon;
    @When("^the user copy number coupon$")
    public void theUserCopyNumberCoupon() {
        com.wappiApp.qa.question.Delivery.message().answeredBy(theActorInTheSpotlight());
        Copy_Coupon = com.wappiApp.qa.question.Delivery.message().answeredBy(theActorInTheSpotlight());
        //guardo en una variable y lo llamo del otro step donde lo quiero pegar
        //theActorInTheSpotlight().remember("Copy_Coupon", List<String>);
        OnStage.theActorInTheSpotlight().attemptsTo(GoToPurchase.goToPurchase());

    }
    @When("^the user go to the purchase$")
    public void theUserGoToThePurchase() {
        theActorInTheSpotlight().recall(Copy_Coupon);
        //theActorInTheSpotlight().attemptsTo(Enter.class(Copy_Coupon));
        System.out.println(Copy_Coupon);
        theActorInTheSpotlight().attemptsTo(Click.on(CONFIRM_REQUEST));
    }
}

