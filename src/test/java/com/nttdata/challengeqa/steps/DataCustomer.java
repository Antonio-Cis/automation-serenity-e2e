package com.nttdata.challengeqa.steps;

import com.nttdata.challengeqa.interfaces.PageShopping;
import com.nttdata.challengeqa.model.ModelCustomer;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DataCustomer implements Task {
    private final ModelCustomer data;
    public DataCustomer(ModelCustomer data){
        this.data = data;
    }
    public static DataCustomer sendPurchase(ModelCustomer data){
        return Tasks.instrumented(DataCustomer.class, data);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.getFirstname()).into(PageShopping.INPUT_FIRST_NAME),
                Enter.theValue(data.getLastname()).into(PageShopping.INPUT_LAST_NAME),
                Enter.theValue(data.getEmail()).into(PageShopping.INPUT_EMAIL),
                Enter.theValue(data.getPhone()).into(PageShopping.INPUT_TELEPHONE),
                Enter.theValue(data.getAddress1()).into(PageShopping.INPUT_ADDRESS_1),
                Enter.theValue(data.getCity()).into(PageShopping.INPUT_CITY),
                Enter.theValue(data.getPostcode()).into(PageShopping.INPUT_POST_CODE),
                Click.on(PageShopping.INPUT_COUNTRY),
                Click.on(PageShopping.LABEL_COUNTRY),
                Click.on(PageShopping.INPUT_STATE),
                Click.on(PageShopping.LABEL_STATE),
                Click.on(PageShopping.BUTTON_CONTINUE_TWO)
        );
    }
}
