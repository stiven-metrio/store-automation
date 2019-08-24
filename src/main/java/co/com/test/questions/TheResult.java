package co.com.test.questions;

import co.com.test.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResult implements Question<Integer> {
    public static TheResult is() {
        return new TheResult();
    }

    @Override
    public Integer answeredBy(Actor actor) {
        return Text.of(HomePage.LABEL_NUM_PRODS_CART).viewedBy(actor).asInteger();
    }
}
