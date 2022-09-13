package com.wappiApp.qa.stepdefinition;

import com.wappiApp.qa.models.UpDateData;
import com.wappiApp.qa.task.OpenBrowser;
import com.wappiApp.qa.task.PersonalInformation;
import com.wappiApp.qa.task.UpDateProfile;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

import static com.wappiApp.qa.userinterfaces.UpDateProfile.*;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class UpdateProfileStepDefinition {
    @Managed
    private static WebDriver myBrowser;

    @Before
    public static void setUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Carolina Ceballos");
    }

    @When("^Open profile$")
    public void openProfile() {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenBrowser.browser());
    }

    @When("^the user click on personal information$")
    public void theUserClickOnPersonalInformation() {
        OnStage.theActorInTheSpotlight().attemptsTo(UpDateProfile.upDateProfile());
        myBrowser.findElement(UPDATE_PHOTO).sendKeys("C:\\Users\\Estudio\\Pictures\\Saved Pictures\\juan.jpg");
    }
    @When("^the user type data$")
    public void theUserTypeData(List<UpDateData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(PersonalInformation.personalInformation(data.get(0)));
        Select menu1 = new Select(myBrowser.findElement(COUNTRY_PROFILE));
        menu1.selectByIndex(3);
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(SAVE_PROFILE));
    }
    @Then("^Confrim the information$")
    public void confrimTheInformation() {
    }
}

