package co.com.test.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.sodimac.com.pe")
public class HomePage extends PageObject {

    private static final Target campoDeBusqueda =
            Target.the("Campo de busqueda de Tienda BestBuy").located(By.xpath("//input[@id='textInputSearch']"));

    public static Target getCampoDeBusqueda() {
        return campoDeBusqueda;
    }

}
