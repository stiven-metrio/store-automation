package co.com.test.tasks;

import co.com.test.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Searching implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Click.on(HomePage.DROP_DOWN_ELECTRO_HOGAR));
       actor.attemptsTo(Click.on(HomePage.LABEL_CONSOLAS));
       actor.attemptsTo(Click.on(HomePage.CHECK_BOX_NINTENDO));
       actor.attemptsTo(Click.on(HomePage.NINTENDO_SWITCH));
       actor.attemptsTo(Click.on(HomePage.BUTTON_ADD_CART));
    }

    public static Searching selectProduct() {
        return Tasks.instrumented(Searching.class);
    }
}
