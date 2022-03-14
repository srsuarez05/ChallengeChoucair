package co.com.choucair.certificarion.challenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import co.com.choucair.certificarion.challenge.userinterface.UTestPage;

public class OpenUp implements Task {
    private UTestPage uTestPage;
    public static OpenUp thePage(){
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(uTestPage));
    }
}
