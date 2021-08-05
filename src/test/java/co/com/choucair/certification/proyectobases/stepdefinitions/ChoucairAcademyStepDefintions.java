package co.com.choucair.certification.proyectobases.stepdefinitions;

import co.com.choucair.certification.proyectobases.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefintions {
    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage());
    }


}
