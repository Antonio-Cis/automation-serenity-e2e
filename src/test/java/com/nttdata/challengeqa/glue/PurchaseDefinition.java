package com.nttdata.challengeqa.glue;

import com.nttdata.challengeqa.interfaces.PagePurchase;
import com.nttdata.challengeqa.steps.AddProducts;
import com.nttdata.challengeqa.steps.OptionsCheckout;
import com.nttdata.challengeqa.steps.ViewProducts;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PurchaseDefinition {

    @Given("El {actor} ingresa a la pagina inicial")
    public void openHomePage(Actor actor) {
        givenThat(actor).attemptsTo(
                Open.browserOn().the(PagePurchase.class)
        );
    }

    @When("Selecciona los productos a comprar")
    public void addProducts(){
        when(theActorInTheSpotlight()).attemptsTo(
                AddProducts.addProductsToCart()
        );
    }

    @Then("Se agregan los productos en el icono del carrito")
    public void clickIconCart(){
    }

    @And("Dar click en ver productos")
    public void clickViewCart(){
    }

    @Then("Se deben mostrar los productos seleccionados")
    public void viewProducts(){
        then(theActorInTheSpotlight()).attemptsTo(
                ViewProducts.viewProductsToCart()
        );
    }

    @And("Dar click en la opcion de pago")
    public void clickCheckout(){
        then(theActorInTheSpotlight()).attemptsTo(
                OptionsCheckout.clickOptionsCheckout()
        );
    }

}
