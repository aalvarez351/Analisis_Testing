package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.RetoTestingRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class SearchRetoTesting implements Task {
    private String reto;

    public SearchRetoTesting(String course) {
        this.reto = reto;
    }



    public static SearchRetoTesting the(String reto){
        return Tasks.instrumented(SearchRetoTesting.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RetoTestingRegistroPage.LOGIN_BUTTON),
                Enter.theValue(reto).into(RetoTestingRegistroPage.INPUT_USER1),
                Enter.theValue(reto).into(RetoTestingRegistroPage.INPUT_USER2),
                Enter.theValue(reto).into(RetoTestingRegistroPage.INPUT_USER3),
                Enter.theValue(reto).into(RetoTestingRegistroPage.INPUT_USER4),
                Enter.theValue(reto).into(RetoTestingRegistroPage.INPUT_USER5),
                Enter.theValue(reto).into(RetoTestingRegistroPage.ENTER_BUTTON),
                Enter.theValue(reto).into(RetoTestingRegistroPage.INPUT_USER6),
                Enter.theValue(reto).into(RetoTestingRegistroPage.INPUT_USER7),
                Enter.theValue(reto).into(RetoTestingRegistroPage.INPUT_BUTTON1),
                Enter.theValue(reto).into(RetoTestingRegistroPage.INPUT_BUTTON2),
                Enter.theValue(reto).into(RetoTestingRegistroPage.INPUT_BUTTON3),
                Enter.theValue(reto).into(RetoTestingRegistroPage.INPUT_BUTTON4),
                Enter.theValue(reto).into(RetoTestingRegistroPage.INPUT_BUTTON5),
                Enter.theValue(reto).into(RetoTestingRegistroPage.INPUT_BUTTON6),
                Enter.theValue(reto).into(RetoTestingRegistroPage.ENTER_BUTTON),
                Enter.theValue(reto).into(RetoTestingRegistroPage.INPUT_PASSWORD),
                Enter.theValue(reto).into(RetoTestingRegistroPage.INPUT_PASSWORD),
                Enter.theValue(reto).into(RetoTestingRegistroPage.INPUT_BUTTON7),
                Enter.theValue(reto).into(RetoTestingRegistroPage.ENTER_BUTTON),
                Enter.theValue(reto).into(RetoTestingRegistroPage.INPUT_BUTTON9),
                Enter.theValue(reto).into(RetoTestingRegistroPage.INPUT_BUTTON10)
        );


    }
}
