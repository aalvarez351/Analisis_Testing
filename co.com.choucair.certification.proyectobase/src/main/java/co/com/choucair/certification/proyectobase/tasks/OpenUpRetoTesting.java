package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.RetoTestingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class OpenUpRetoTesting implements Task {
    private RetoTestingPage retoTestingPage;

    public static OpenUpRetoTesting thePage() {
        return Tasks.instrumented(OpenUpRetoTesting.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(retoTestingPage));

    }
}
