package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.questions.AnswerReto;
import co.com.choucair.certification.proyectobase.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.mockito.stubbing.Answer;
import java.util.List;


public class RetoTestingStepDefinitions {
    private String  strUser;
    @Before
    public void setStage () { OnStage.setTheStage(new onlineCast()); }

    @Given("^that it is necessary to register on the page to register the challenge$")
    public void thatitisnecessarytoregisteronthepagetoregisterthechallenge() {
        this.strUser = strUser;
        OnStage.theActorCalled("strUser").wasAbleTo(OpenUp.thePage(), LoginRetoTesting.onThePage()));
    }


    @When("^computer activities for development continue$")
    public void computeractivitiesfordevelopmentcontinue(String reto) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchRetoTesting.the(reto));
    }

    @Then("^that we advance with developers in the field of testing$")
    public void thatweadvancewithdevelopersinthefieldoftesting(String question)  {
        OnStage.theActorInTheSpotlight().should((GivenWhenThen.seeThat(AnswerReto.toThe(question));
    }


}

