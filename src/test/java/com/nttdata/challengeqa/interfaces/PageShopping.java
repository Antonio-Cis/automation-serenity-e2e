package com.nttdata.challengeqa.interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageShopping extends PageObject {
    public static final Target INPUT_FIRST_NAME =  Target.the("INPUT FIRST NAME").located(By.id("input-payment-firstname"));
    public static final Target INPUT_LAST_NAME =  Target.the("INPUT LAST NAME").located(By.id("input-payment-lastname"));
    public static final Target INPUT_EMAIL =  Target.the("INPUT EMAIL").located(By.id("input-payment-email"));
    public static final Target INPUT_TELEPHONE =  Target.the("INPUT TELEPHONE").located(By.id("input-payment-telephone"));
    public static final Target INPUT_ADDRESS_1 =  Target.the("INPUT ADDRESS 1").located(By.id("input-payment-address-1"));
    public static final Target INPUT_CITY =  Target.the("INPUT CITY").located(By.id("input-payment-city"));
    public static final Target INPUT_POST_CODE =  Target.the("INPUT POST CODE").located(By.id("input-payment-postcode"));
    public static final Target INPUT_COUNTRY =  Target.the("INPUT COUNTRY").located(By.id("input-payment-country"));
    public static final Target LABEL_COUNTRY =  Target.the("LABEL SELECT COUNTRY").located(By.xpath("//*[@id='input-payment-country']/option[69]"));
    public static final Target INPUT_STATE =  Target.the("INPUT STATE").located(By.id("input-payment-zone"));
    public static final Target LABEL_STATE =  Target.the("LABEL SELECT STATE").located(By.xpath("//*[@id='input-payment-zone']/option[13]"));
    public static final Target BUTTON_CONTINUE_TWO =  Target.the("BUTTON CONTINUE GUEST").located(By.id("button-guest"));
    public static final Target BUTTON_CONTINUE_THREE =  Target.the("BUTTON SHIPPING METHOD").located(By.id("button-shipping-method"));
    public static final Target CHECK_TERMS =  Target.the("CHECK TERMS AND CONDITIONS").located(By.xpath("//*[@id='collapse-payment-method']/div/div[3]/div/input[1]"));
    public static final Target BUTTON_CONTINUE_FOUR =  Target.the("BUTTON SHIPPING METHOD").located(By.id("button-payment-method"));
    public static final Target BUTTON_CONFIRM_ORDER =  Target.the("BUTTON CONFIRM ORDER").located(By.id("button-confirm"));
    public static final Target TXT_SUCCESS =  Target.the("Your order has been placed!").located(By.xpath("//*[@id='content']/h1"));

}
