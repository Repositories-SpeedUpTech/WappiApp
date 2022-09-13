package com.wappiApp.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;

public class Delivery {

    public static final Target CLICK_REQUEST = Target
            .the("Clicking on request")
            .located(By.xpath("(//*[@class='button success offers-table-block-button'])[1]"));


    public static final Target CONFIRM_REQUEST = Target
            .the("Clicking on confirm")
            .located(By.id("order-confirm"));

    public static final Target GET_COUPON = Target
            .the("Clicking on get coupon")
            .located(By.id("welcome-coupon"));

    //public static final String COPY_COUPON =
            //wd.findElement(By.xpath("(.//*div[@id='customSelect_3']/div/span[@class='selectLabel clear'])").getText());

    public static final By COPY_COUPON = By.xpath("//span[@id='coupon-code']");

    public static final Target CLOSE_WINDOWS = Target
            .the("Clicking close Window")
            .located(By.xpath("(//*[@class='close'])[1]"));

    public static final Target CLICK_IN_THE_HOME = Target
            .the("Click in the home")
            .located(By.xpath("(//li[@class='nav-bar-item'])[1]"));

    public static final Target ENTER_CODE = Target
            .the("Enter code")
            .located(By.xpath(("//*[@class='input ng-untouched ng-pristine ng-valid']")));

}

