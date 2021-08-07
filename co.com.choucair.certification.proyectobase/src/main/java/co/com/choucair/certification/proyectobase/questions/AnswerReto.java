package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.RetoTestingRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerReto implements Question<Boolean> {
    private String question;

    public AnswerReto(String question){
        this.question = question;
    }

    public static AnswerReto toThe(String question){
        return new AnswerReto(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse= Text.of(RetoTestingRegistroPage.INPUT_USER1).viewedBy(actor).asString();
        if (question.equals(nameCourse)){
            result= true;
        }else{
            result = false;
        }
        return null;
    }
}
