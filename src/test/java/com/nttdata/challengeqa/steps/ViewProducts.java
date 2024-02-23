package com.nttdata.challengeqa.steps;

import com.nttdata.challengeqa.interfaces.PageCheckout;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ViewProducts implements Task {
    public static ViewProducts viewProductsToCart(){
        return Tasks.instrumented(ViewProducts.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PageCheckout.BUTTON_CHECKOUT)
        );
    }
}
