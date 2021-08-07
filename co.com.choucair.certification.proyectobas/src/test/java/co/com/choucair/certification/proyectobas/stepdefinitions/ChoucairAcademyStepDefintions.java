package co.com.choucair.certification.proyectobas.stepdefinitions;

import co.com.choucair.certification.proyectobas.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefintions {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast());}

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage());
    }


    @When("^he search for the course Recursos Automatizacion Bancolombia on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform() {

    }

    @Then("^he finds the coruse called resorces Recursos Automatizacion Bancolobia$")
    public void heFindsTheCoruseCalledResorcesRecursosAutomatizacionBancolobia() {

    }


}
