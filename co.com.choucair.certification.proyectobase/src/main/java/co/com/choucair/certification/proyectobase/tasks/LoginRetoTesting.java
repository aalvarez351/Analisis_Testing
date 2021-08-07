package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.RetoTestingRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginRetoTesting implements Task {
    private Object firstName;
    private String LastName;
    private String email;
    private String birthMonth;
    private String birthDay;
    private String birthYear;
    private String city;
    private String zip;
    private String dispositivos;
    private String computadoras;
    private String version;
    private Object idioma;
    private String dispositivoMovil;
    private String modelo;
    private Object sistemaOperativo;
    private String password;
    private String cofirmacionPassword;
    private Object strdispositivos;
    private Object strcomputadoras;
    private Object strLastName;
    private Object stremail;
    private Object strmodelo;
    private Object strbirthYear;
    private Object strbirthDay;
    private Object strcity;
    private Object strcofirmacionPassword;
    private Object strzip;
    private Object strbirthMonth;
    private Object strversion;
    private Object strdispositivoMovil;
    private Object strpassword;
    private Object strterminosYcondiciones;

    public Login(String firstName, String lasttName, String email, String birthMonth, String birthDay, String birthYear, String city, String zip, String dispositivos, String computadoras, String version, String idioma, String dispositivoMovil, String modelo, String sistemaOperativo, String password, String cofirmacionPassword, String strPassword){
        this.strfirstName = strfirstName;
        this.strLastName = strLastName;
        this.stremail = stremail;
        this.strbirthMonth = strbirthMonth;
        this.strbirthDay = strbirthDay;
        this.strbirthYear = strbirthYear;
        this.strcity = strcity;
        this.strzip = strzip;
        this.strdispositivos = strdispositivos;
        this.strcomputadoras = strcomputadoras;
        this.strversion = strversion;
        this.stridioma = stridioma;
        this.strdispositivoMovil = strdispositivoMovil;
        this.strmodelo = strmodelo;
        this.strsistemaOperativo = strsistemaOperativo;
        this.strpassword = strpassword;
        this.strcofirmacionPassword = strcofirmacionPassword;
        this.strterminosYcondiciones = strterminosYcondiciones;

    }
    public static Login onThePage(String firstName, String LastName, String email, String birthMonth, String birthDay, String birthYear, String city, String zip, String dispositivos, String computadoras,  String version,  String idioma, String dispositivoMovil,  String modelo,  String sistemaOperativo, String password, String cofirmacionPassword, String strterminosYcondiciones){
        return  Tasks.instrumented(Login.class, strfirstName, strLastName, stremail, strbirthMonth, strbirthDay, strbirthYear, strcity, strzip, strdispositivos, strcomputadoras, strversion, stridioma, strdispositivoMovil, strmodelo, strsistemaOperativo, strpassword, strcofirmacionPassword, strterminosYcondiciones);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(RetoTestingRegistroPage.INPUT_BUTTON1),

                Enter.theValue("strfirstName").into(RetoTestingRegistroPage.INPUT_USER1),
                Enter.theValue("strLastName").into(RetoTestingRegistroPage.INPUT_USER2),
                Enter.theValue("stremail").into(RetoTestingRegistroPage.INPUT_USER3),
                Enter.theValue("strbirthMonth").into(RetoTestingRegistroPage.INPUT_USER4),
                Enter.theValue("strbirthDay").into(RetoTestingRegistroPage.INPUT_USER5),
                Enter.theValue("strbirthYear;").into(RetoTestingRegistroPage.INPUT_USER6),
                Enter.theValue("strcity").into(RetoTestingRegistroPage.INPUT_USER7),
                Enter.theValue("strzip").into(RetoTestingRegistroPage.INPUT_USER),
                Enter.theValue("strdispositivos").into(RetoTestingRegistroPage.INPUT_USER),
                Enter.theValue("strcomputadoras").into(RetoTestingRegistroPage.INPUT_USER),
                Enter.theValue("strversion").into(RetoTestingRegistroPage.INPUT_USER2),
                Enter.theValue("stridioma").into(RetoTestingRegistroPage.INPUT_USER2),
                Enter.theValue("strdispositivoMovil").into(RetoTestingRegistroPage.INPUT_USER2),
                Enter.theValue("strmodelo").into(RetoTestingRegistroPage.INPUT_USER2),
                Enter.theValue("strsistemaOperativo").into(RetoTestingRegistroPage.INPUT_USER2),
                Enter.theValue("strpassword").into(RetoTestingRegistroPage.INPUT_USER2),
                Enter.theValue("strcofirmacionPassword").into(RetoTestingRegistroPage.INPUT_USER2),
                Enter.theValue("strterminosYcondiciones").into(RetoTestingRegistroPage.INPUT_USER2),
                Click.on(RetoTestingRegistroPage.ENTER_BUTTON));

    }

}




