package com.wappiApp.qa.stepdefinition;

import com.wappiApp.qa.models.CredentialData;
import com.wappiApp.qa.task.Login;
import com.wappiApp.qa.task.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginStepDefinition {

    @Managed
    private static WebDriver myBrowser;

    @Before
    public static void setUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Carolina Ceballos");
    }
    @Given("^the user is on the Wappi page$")
    public void theUserIsOnTheWappiPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }
    @When("^the user enter username and password$")
    public void theUserEnterUsernameAndPassword(List<CredentialData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.withData(data.get(0)));
    }
    @Then("^the user should see the name(.*)$")
    public void theUserShouldSeeTheName(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(com.wappiApp.qa.question.Login.message(), org.hamcrest.CoreMatchers.is(message)));
    }
}

