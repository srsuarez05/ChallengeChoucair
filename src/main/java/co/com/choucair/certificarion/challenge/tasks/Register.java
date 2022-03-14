package co.com.choucair.certificarion.challenge.tasks;

import co.com.choucair.certificarion.challenge.userinterface.UTestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String birthMonth;
    private String birthDay;
    private String birthYear;
    private String postalCode;
    private String password;
    private String confirmPassword;
    private String textRegisterSuccess;

    public Register(String firstName, String lastName, String email, String birthMonth, String birthDay, String birthYear, String postalCode, String password, String confirmPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.postalCode = postalCode;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static Register onThePage(String firstName, String lastName, String email, String birthMonth, String birthDay, String birthYear, String postalCode, String password, String confirmPassword){
        return Tasks.instrumented(Register.class, firstName, lastName, email, birthMonth, birthDay, birthYear, postalCode, password, confirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestRegisterPage.REGISTER_BUTTON),
                Enter.theValue((firstName)).into(UTestRegisterPage.INPUT_FIRST_NAME),
                Enter.theValue((lastName)).into(UTestRegisterPage.INPUT_LAST_NAME),
                Enter.theValue(email).into(UTestRegisterPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(birthMonth).from(UTestRegisterPage.SELECT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(birthDay).from(UTestRegisterPage.SELECT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(birthYear).from(UTestRegisterPage.SELECT_BIRTH_YEAR),
                Click.on(UTestRegisterPage.NEXT_LOCATION_BUTTON),
                Enter.theValue(postalCode).into(UTestRegisterPage.INPUT_ZIP_OR_POSTAL_CODE),
                Click.on(UTestRegisterPage.NEXT_DEVICES_BUTTON),
                Click.on(UTestRegisterPage.NEXT_LAST_STEP_BUTTON),
                Enter.theValue(password).into(UTestRegisterPage.INPUT_PASSWORD),
                Enter.theValue(confirmPassword).into(UTestRegisterPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UTestRegisterPage.APPROVE_TERMS),
                Click.on(UTestRegisterPage.ACCEPT_POLICY),
                Click.on(UTestRegisterPage.COMPLETE_SETUP_BUTTON)
                );
    }
}
