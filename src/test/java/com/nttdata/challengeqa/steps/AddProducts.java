package com.nttdata.challengeqa.steps;

import com.nttdata.challengeqa.interfaces.PagePurchase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddProducts implements Task {
    public static AddProducts addProductsToCart(){
        return Tasks.instrumented(AddProducts.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PagePurchase.BUTTON_ADD_CART_1),
                Click.on(PagePurchase.BUTTON_ADD_CART_2),
                Click.on(PagePurchase.BUTTON_ICON_CART),
                Click.on(PagePurchase.BUTTON_VIEW_CART)
        );

    }
}
