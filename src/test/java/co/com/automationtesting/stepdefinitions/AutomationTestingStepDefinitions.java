package co.com.automationtesting.stepdefinitions;

import co.com.automationtesting.model.DataFormRegister;
import co.com.automationtesting.tasks.FirstStepRegister;
import co.com.automationtesting.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutomationTestingStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^brandon opens the website for registration$")
    public void brandonOpensTheWebsiteForRegistration() {
        OnStage.theActorCalled("brandon").wasAbleTo(OpenUp.thePage());

    }

    @When("^brandon fills out the form for the respective registration$")
    public void brandonFillsOutTheFormForTheRespectiveRegistration(List<DataFormRegister> data) {
            theActorInTheSpotlight().attemptsTo(FirstStepRegister.fillForm(data));

    }

    @Then("^brandon finally completes his registration successfully$")
    public void brandonFinallyCompletesHisRegistrationSuccessfully() {


    }

}
