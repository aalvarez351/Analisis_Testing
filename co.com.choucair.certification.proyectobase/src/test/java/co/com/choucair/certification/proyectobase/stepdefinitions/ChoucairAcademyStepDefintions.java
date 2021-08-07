package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.mockito.stubbing.Answer;

import java.util.List;


public class ChoucairAcademyStepDefintions {
    @Before
    public void setStage () { OnStage.setTheStage(new onlineCast()); }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> AcademyChocairData) throws Exception {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),Login.onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0),getStr.Password()));
    }


    @When("^he search for the course (.*) on the Choucair academy platform$")
   public void heSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> AcademyChocairData) throws Exception {
       OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^she finds the course called$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolobia(List<AcademyChoucairData> AcademyChocairData) throws Exception {
        OnStage.theActorInTheSpotlight().should((GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }


}
