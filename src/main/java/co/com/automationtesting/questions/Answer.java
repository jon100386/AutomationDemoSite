package co.com.automationtesting.questions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.automationtesting.userinterface.HomePageAutomationTesting.ANSWER_LABEL;

public class Answer implements Question<String>{

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ANSWER_LABEL).viewedBy(actor).asString();
    }


}