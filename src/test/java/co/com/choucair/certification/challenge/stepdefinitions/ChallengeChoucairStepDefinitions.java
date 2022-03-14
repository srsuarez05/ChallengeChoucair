package co.com.choucair.certification.challenge.stepdefinitions;

import co.com.choucair.certificarion.challenge.model.ChallengeChoucairData;
import co.com.choucair.certificarion.challenge.questions.Answer;
import co.com.choucair.certificarion.challenge.tasks.OpenUp;
import co.com.choucair.certificarion.challenge.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChallengeChoucairStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Sergio is on the UTest Home page$")
    public void thatSergioIsOnTheUTestHomePage() {
        OnStage.theActorCalled("Sergio").wasAbleTo(OpenUp.thePage());
    }

    @When("^he enters all required registration fields$")
    public void heEntersAllRequiredRegistrationFields(List<ChallengeChoucairData> challengeChoucairData) throws Exception {
        OnStage.theActorCalled("Sergio").attemptsTo(Register.onThePage(
                challengeChoucairData.get(0).getFirstName(),
                challengeChoucairData.get(0).getLastName(),
                challengeChoucairData.get(0).getEmail(),
                challengeChoucairData.get(0).getBirthMonth(),
                challengeChoucairData.get(0).getBirthDay(),
                challengeChoucairData.get(0).getBirthYear(),
                challengeChoucairData.get(0).getPostalCode(),
                challengeChoucairData.get(0).getPassword(),
                challengeChoucairData.get(0).getConfirmPassword()
        ));
    }

    @Then("^a UTest account is created$")
    public void aUTestAccountIsCreated(List<ChallengeChoucairData> challengeChoucairData) throws Exception {
        String question = challengeChoucairData.get(0).getTextRegisterSuccess();
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
