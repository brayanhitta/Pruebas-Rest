package co.com.choucair.pruebasrest.stepdefinitions;

import co.com.choucair.pruebasrest.model.ModelCreateUserRest;
import co.com.choucair.pruebasrest.questions.LastResponseStatusCode;
import co.com.choucair.pruebasrest.task.CreateUserRest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static co.com.choucair.pruebasrest.utils.Constant.VALUE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitionRestCreateUser {

    @When("^you create an user$")
    public void youCreateAnUser(List<ModelCreateUserRest> modelCreateUserRests) {
        theActorInTheSpotlight()
                .attemptsTo(
                        CreateUserRest
                                .with(modelCreateUserRests));
    }

    @Then("^I shoul see the user created$")
    public void iShoulSeeTheUserCreated() {
        theActorInTheSpotlight()
                .should(
                        seeThat(LastResponseStatusCode.is(VALUE)));
    }
}
