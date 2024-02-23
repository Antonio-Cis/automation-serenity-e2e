package com.nttdata.challengeqa.glue;

import com.nttdata.challengeqa.interfaces.PageShopping;
import com.nttdata.challengeqa.model.ModelCustomer;
import com.nttdata.challengeqa.steps.DataCustomer;
import com.nttdata.challengeqa.steps.Shopping;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ShoppingDefinition {

    @When("^Debe ingresar (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void insertDataCustomer(String firstname, String lastname, String email, String phone, String address1, String city, String postcode){
        ModelCustomer dataCustomer = new ModelCustomer(firstname, lastname, email, phone, address1, city, postcode);
        when(theActorInTheSpotlight()).attemptsTo(
                DataCustomer.sendPurchase(dataCustomer)
        );
    }

    @Then("Se visualiza el metodo de envio")
    public void sendPurchase(){
        then(theActorInTheSpotlight()).should(
                seeThat(the(PageShopping.BUTTON_CONTINUE_THREE), isVisible())
        );
        then(theActorInTheSpotlight()).attemptsTo(
                Shopping.confirmPurchase()
        );
    }

    @And("Compra realizada con exito")
    public void confirmPurchase() throws InterruptedException {
        Assert.assertEquals(String.valueOf(PageShopping.TXT_SUCCESS), "Your order has been placed!");
        Thread.sleep(5000);
    }

}
