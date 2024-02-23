package com.nttdata.challengeqa.interfaces;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class PageCheckout extends PageObject {
    public static final Target BUTTON_CHECKOUT = Target.the("BUTTON CHECKOUT").located(By.xpath("//*[@id='content']/div[3]/div[2]/a"));
    public static final Target LABEL_GUEST =  Target.the("LABEL GUEST CHECKOUT").located(By.xpath("//*[@id='collapse-checkout-option']/div/div/div[1]/div[2]/label"));
    public static final Target BUTTON_CONTINUE_ONE =  Target.the("BUTTON CONTINUE").located(By.id("button-account"));

}
