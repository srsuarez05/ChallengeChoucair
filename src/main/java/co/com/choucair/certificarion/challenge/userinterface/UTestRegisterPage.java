package co.com.choucair.certificarion.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestRegisterPage extends PageObject {

    public static final Target REGISTER_BUTTON = Target.the("Button that shows us the form to register")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the first name")
            .located(By.xpath("//input[@type='text' and @id='firstName' and @name='firstName']"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.name("email"));
    public static final Target SELECT_BIRTH_MONTH = Target.the("where do we select the birth Month")
            .located(By.id("birthMonth"));
    public static final Target SELECT_BIRTH_DAY = Target.the("where do we select the birth Day")
            .located(By.id("birthDay"));
    public static final Target SELECT_BIRTH_YEAR = Target.the("where do we select the birth Year")
            .located(By.id("birthYear"));
    public static final Target NEXT_LOCATION_BUTTON = Target.the("Button that shows us the form to Next Location")
            .located(By.xpath("//a[@class='btn btn-blue' and @role='button']//span[contains(text(), 'Next: Location')]"));
    public static final Target INPUT_ZIP_OR_POSTAL_CODE = Target.the("where do we write the zip or postal code")
            .located(By.id("zip"));
    public static final Target NEXT_DEVICES_BUTTON = Target.the("Button that shows us the form to Next Devices")
            .located(By.xpath("//a[@class='btn btn-blue pull-right' and @role='button' and @aria-label='Next step - select your devices']"));
    public static final Target SELECT_YOUR_COMPUTER = Target.the("where do we select the your computer")
            .located(By.xpath("//div[@ng-bind-html='device.name | highlight: $select.search']"));
    public static final Target SELECT_VERSION = Target.the("where do we select the version")
            .located(By.xpath("//span[@class='btn btn-default form-control ui-select-toggle' and @aria-label='Select a Version']"));
    public static final Target SELECT_LENGUAGE = Target.the("where do we select the Lenguage")
            .located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select OS language']"));
    public static final Target NEXT_LAST_STEP_BUTTON = Target.the("Button that shows us the form to Next Last Step")
            .located(By.xpath("//div[@class='pull-right next-step']"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where do we write the confirm password")
            .located(By.id("confirmPassword"));
    public static final Target APPROVE_TERMS = Target.the("where do we approve the terms")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target ACCEPT_POLICY = Target.the("where do we approve the policy")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_SETUP_BUTTON = Target.the("Button that shows us the form to Complete Setup")
            .located(By.xpath("//a[@class='btn btn-blue' and @id='laddaBtn']//span[contains(text(), 'Complete Setup')]"));
    public static final Target TEXT_REGISTER_SUCCESS = Target.the("where the description of the record appears")
            .located(By.xpath("//b[contains(text(), 'First, please check your email inbox')]"));
}
