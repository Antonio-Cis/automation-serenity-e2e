package com.nttdata.challengeqa.steps;

import com.nttdata.challengeqa.interfaces.PageShopping;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.junit.Assert;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Shopping implements Task {
    public static Shopping confirmPurchase(){
        return Tasks.instrumented(Shopping.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PageShopping.BUTTON_CONTINUE_THREE),
                Click.on(PageShopping.CHECK_TERMS),
                Click.on(PageShopping.BUTTON_CONTINUE_FOUR),
                Click.on(PageShopping.BUTTON_CONFIRM_ORDER)
        );
    }
}
