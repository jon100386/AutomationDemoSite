package co.com.automationtesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageAutomationTesting {

    public static final Target ANSWER_LABEL = Target.the("Answer").located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]"));

}
