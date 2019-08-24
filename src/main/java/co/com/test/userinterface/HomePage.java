package co.com.test.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.plazavea.com.pe/")
public class HomePage extends PageObject {
    public static final Target DROP_DOWN_ELECTRO_HOGAR = Target.the("Navigation bar, Electro y Hogar products").located(By.xpath("//a[text()='ELECTRO Y HOGAR']"));
    public static final Target LABEL_CONSOLAS = Target.the("PS, Nintendo").located(By.xpath("//a[text()='Consolas']"));
    public static final Target CHECK_BOX_NINTENDO = Target.the("Check NINTENDO").located(By.name("5020108"));
    public static final Target NINTENDO_SWITCH = Target.the("Nintendo Switch").located(By.xpath("//a[contains(text(),'NINTENDO SWITCH')]"));
    public static final Target BUTTON_ADD_CART = Target.the("Add product to the cart").located(By.id("ProductCard__add-to-cart"));
    public static final Target LABEL_NUM_PRODS_CART = Target.the("Number of products in the cart").located(By.className("cart__number"));
}
