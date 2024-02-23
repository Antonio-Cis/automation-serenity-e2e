package com.nttdata.challengeqa.steps;

import com.nttdata.challengeqa.interfaces.PageCheckout;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OptionsCheckout implements Task {
    public static OptionsCheckout clickOptionsCheckout(){
        return Tasks.instrumented(OptionsCheckout.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PageCheckout.LABEL_GUEST),
                Click.on(PageCheckout.BUTTON_CONTINUE_ONE)
        );
    }
}
