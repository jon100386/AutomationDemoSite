package co.com.automationtesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormRegisterAutomationTesting {

    public static final Target PHOTO = Target.the("Upload file").located(By.id("imagesrc"));
    public static final Target FIRST_NAME = Target.the("First name").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
    public static final Target LAST_NAME = Target.the("last name").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
    public static final Target ADDRESS = Target.the("Address").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
    public static final Target EMAIL = Target.the("Email").located(By.xpath("//*[@id=\"eid\"]/input"));
    public static final Target PHONE = Target.the("Phone").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
    public static final Target GENDER = Target.the("Gender").located(By.xpath("//input[@value=\"Male\"]"));
    public static final Target HOBBIES = Target.the("Hobbies").located(By.id("checkbox2"));

    public static final Target LANGUAGES = Target.the("Campo donde se ingresa el idioma").located(By.xpath("//*[@id=\"msdd\"]"));
    public static final Target LANGUAGES1 = Target.the("Campo donde se ingresa el idioma").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul"));
    public static final Target SELECTLANGUAGES = Target.the("Campo donde se ingresa el idioma").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[6]"));

    public static final Target SKILLS = Target.the("Skills").located(By.id("Skills"));
    public static final Target COUNTRY = Target.the("Country").located(By.id("countries"));
    public static final Target SELECT_COUNTRY = Target.the("Selec country combobox").located(By.xpath("//span[@role=\"combobox\"]"));
    public static final Target SELECTCOUNTRY = Target.the("Selec country option").located(By.xpath("//input[@role=\"textbox\"]"));
    public static final Target YEARBIRTH = Target.the("Year birth").located(By.id("yearbox"));
    public static final Target MONTHBIRTH = Target.the("Month birth").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
    public static final Target DAYBIRTH = Target.the("Day birth").located(By.id("daybox"));
    public static final Target PASSWORD = Target.the("Password").located(By.id("firstpassword"));
    public static final Target CONFIRMPASS = Target.the("confirm password").located(By.id("secondpassword"));

    public static final Target SUBMIT = Target.the("Upload Register").located(By.id("submitbtn"));



}
