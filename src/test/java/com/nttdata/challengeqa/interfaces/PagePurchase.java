package com.nttdata.challengeqa.interfaces;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://opencart.abstracta.us/")
public class PagePurchase extends PageObject {

    public static final Target BUTTON_ADD_CART_1 =  Target.the("BUTTON ADD TO CART 1").located(By.xpath("//*[@id='content']/div[2]/div[1]/div/div[3]/button[1]"));
    public static final Target BUTTON_ADD_CART_2 =  Target.the("BUTTON ADD TO CART 2").located(By.xpath("//*[@id='content']/div[2]/div[2]/div/div[3]/button[1]"));
    public static final Target BUTTON_ICON_CART =  Target.the("BUTTON ICON CART").located(By.id("cart"));
    public static final Target BUTTON_VIEW_CART =  Target.the("BUTTON VIEW CART").located(By.xpath("//*[@id='cart']/ul/li[2]/div/p/a[1]/strong"));

}
