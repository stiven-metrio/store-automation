package co.com.test.stepdefinitions;

import co.com.test.questions.TheResult;
import co.com.test.tasks.GetInto;
import co.com.test.tasks.Searching;
import co.com.test.userinterface.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.Matchers.greaterThan;
import org.openqa.selenium.WebDriver;

public class ProductsPurchaseStepsDefinitions {
    Actor user = Actor.named("User");
    HomePage homePage;

    @Managed(driver = "chrome")
    WebDriver hisBrowser;

   @Before
   public void setUp(){
        user.can(BrowseTheWeb.with(hisBrowser));
        hisBrowser.manage().window().maximize();
   }

    @Given("^that a user entered plazavea website$")
    public void thatAUserEnteredPlazaveaWebsite() {
        user.attemptsTo(GetInto.webSite(homePage));
    }

    @When("^he finds the wanted product$")
    public void heFindsTheWantedProduct() {
        user.attemptsTo(Searching.selectProduct());
    }

    @Then("^The product is added to the shopping cart$")
    public void theProductIsAddedToTheShoppingCart() {
        user.should(seeThat(TheResult.is(), greaterThan(0)));
    }

}
