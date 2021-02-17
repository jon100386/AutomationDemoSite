package co.com.automationtesting.tasks;

import co.com.automationtesting.model.DataFormRegister;
import co.com.automationtesting.userinterface.AutomationDemoSite;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.automationtesting.userinterface.FormRegisterAutomationTesting.*;


public class FirstStepRegister implements Task {
    AutomationDemoSite element;
    private List<DataFormRegister> data;
    private AutomationDemoSite automationDemoSite;


    public FirstStepRegister(List<DataFormRegister> data){
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String directory = System.getProperty("user.dir");
        String filepath = directory + "//src//test//resources//images//foto.jpg";
        PHOTO.resolveFor(actor).sendKeys(filepath);

        actor.attemptsTo(Enter.theValue(data.get(0).getFirstName()).into(FIRST_NAME));
        actor.attemptsTo(Enter.theValue(data.get(0).getLastName()).into(LAST_NAME));
        actor.attemptsTo(Enter.theValue(data.get(0).getAddress()).into(ADDRESS));
        actor.attemptsTo(Enter.theValue(data.get(0).getEmailaddress()).into(EMAIL));
        actor.attemptsTo(Enter.theValue(data.get(0).getPhone()).into(PHONE));
        actor.attemptsTo(Click.on(GENDER));
        actor.attemptsTo(Click.on(HOBBIES));

        JavascriptExecutor js = (JavascriptExecutor) automationDemoSite.getDriver();
      js.executeScript("window.scrollBy(0,500)");

        actor.attemptsTo(Click.on(LANGUAGES));

        for (WebElementFacade elementFacade : LANGUAGES1.resolveAllFor(actor)) {
            if (elementFacade.getText().contains(data.get(0).getLanguages())) {
                element.getDriver().findElement(By.linkText(data.get(0).getLanguages())).click();
                actor.attemptsTo(Click.on(SELECTLANGUAGES));
            }
        }

        actor.attemptsTo(Click.on(SKILLS));
        actor.attemptsTo(SelectFromOptions.byVisibleText(data.get(0).getSkills()).from(SKILLS));

        actor.attemptsTo(Click.on(COUNTRY));
        actor.attemptsTo(SelectFromOptions.byVisibleText(data.get(0).getCountry()).from(COUNTRY));

        actor.attemptsTo(Click.on(SELECT_COUNTRY));
        actor.attemptsTo(Enter.theValue(data.get(0).getSelectcountry()).into(SELECTCOUNTRY));
        SELECTCOUNTRY.resolveFor(actor).sendKeys(Keys.RETURN);

        actor.attemptsTo(Click.on(YEARBIRTH));
        actor.attemptsTo(SelectFromOptions.byVisibleText(data.get(0).getYearbirth()).from(YEARBIRTH));

        actor.attemptsTo(Click.on(MONTHBIRTH));
        actor.attemptsTo(SelectFromOptions.byVisibleText(data.get(0).getMonthbirth()).from(MONTHBIRTH));

        actor.attemptsTo(Click.on(DAYBIRTH));
        actor.attemptsTo(SelectFromOptions.byVisibleText(data.get(0).getDaybirth()).from(DAYBIRTH));

        actor.attemptsTo(Enter.theValue(data.get(0).getPassword()).into(PASSWORD));
        actor.attemptsTo(Enter.theValue(data.get(0).getPassword()).into(CONFIRMPASS));

        actor.attemptsTo(Click.on(SUBMIT));

    }
    public static FirstStepRegister fillForm(List<DataFormRegister> data) {
        return Tasks.instrumented(FirstStepRegister.class, data);
    }


}
