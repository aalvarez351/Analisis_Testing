package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RetoTestingRegistroPage extends PageObject{

    public static final Target LOGIN_BUTTON = Target.the("Join Today").located(By.xpath("//div[@class='unauthenticated-nav-bar__dropdown-menu-sign']//strong[contains(text(),'Join Today')]"));
    public static final Target INPUT_USER1 = Target.the("name").located(By.id("firstName"));
    public static final Target INPUT_USER2 = Target.the("lastName").located(By.id("lastName"));
    public static final Target INPUT_USER = Target.the("email").located(By.id("email"));
    public static final Target INPUT_USER3 = Target.the("birthMonth").located(By.id("birthMonth"));
    public static final Target INPUT_USER4 = Target.the("birthDay").located(By.id("birthDay"));
    public static final Target INPUT_USER5 = Target.the("birthYear").located(By.id("birthYear"));
    public static final Target ENTER_BUTTON = Target.the("Siguiente: Ubicacion").located(By.xpath("//button[contains(@class,'btn btn_primary')]"));
    public static final Target INPUT_USER6 = Target.the("city").located(By.id("city"));
    public static final Target INPUT_USER7 = Target.the("zip").located(By.id("zip"));
    public static final Target INPUT_BUTTON1 = Target.the("driverss").located(By.xpath("//div[@class='btn btn-default form-control ui-select-toggle']//strong[contains(text(),'dispositivos')]"));
    public static final Target INPUT_BUTTON2 = Target.the("pcs").located(By.xpath("//div[@class='ui-select-match-text pull-left ui-select-allow-clear']//strong[contains(text(),'computadora')]"));
    public static final Target INPUT_BUTTON3 = Target.the("version").located(By.xpath("//div[@class='ui-select-match-text pull-left ui-select-allow-clear']//strong[contains(text(),'version')]"));
    public static final Target INPUT_BUTTON4 = Target.the("idioma").located(By.xpath("//div[@class='ui-select-match-text pull-left ui-select-allow-clear']//strong[contains(text(),'idioma')]"));
    public static final Target INPUT_BUTTON5 = Target.the("dispositivo movil").located(By.xpath("//div[@class='ui-select-match-text pull-left ui-select-allow-clear']//strong[contains(text(),'dispositivo movil')]"));
    public static final Target INPUT_BUTTON6 = Target.the("model").located(By.xpath("//div[@class='ui-select-match-text pull-left ui-select-allow-clear']//strong[contains(text(),'modelo')]"));
    public static final Target INPUT_BUTTON7 = Target.the("system operativo").located(By.xpath("//div[@class='ui-select-match-text pull-left ui-select-allow-clear']//strong[contains(text(),'sistema operativo')]"));
    public static final Target ENTER_BUTTON8 = Target.the("Siguiente: ultimo paso").located(By.xpath("//button[contains(@class,'btn btn_primary')]"));
    public static final Target INPUT_PASSWORD = Target.the("password").located(By.id("Password"));
    public static final Target INPUT_PASSWORD1 = Target.the("confirmacion password").located(By.id("confirmPassword"));
    public static final Target INPUT_BUTTON9 = Target.the("terminos y conficiones").located(By.xpath("//div[@class='checkmark signup-consent__checkbox']//strong[contains(string(),'true')]"));
    public static final Target INPUT_BUTTON10 = Target.the("terminos y conficiones").located(By.xpath("//div[@class='input-check-box signup-consent']//strong[contains(string(),'true')]"));
    public static final Target ENTER_BUTTON1 = Target.the("Siguiente: ultimo paso").located(By.xpath("//button[contains(@class,'btn btn_primary')]"));
    public static final Target ENTER_BUTTON2 = Target.the("Configuracion Completa").located(By.xpath("//button[contains(@class,'btn btn_blue')]"));

}