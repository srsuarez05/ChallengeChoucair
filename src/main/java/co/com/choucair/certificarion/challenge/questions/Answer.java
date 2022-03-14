package co.com.choucair.certificarion.challenge.questions;

import co.com.choucair.certificarion.challenge.userinterface.UTestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question = question;
    }

    public static Question<Boolean> toThe(String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String textRegistration =  Text.of(UTestRegisterPage.TEXT_REGISTER_SUCCESS).viewedBy(actor).asString();
        return (question.equals(textRegistration)) ? true : false;
    }
}
