package com.wappiApp.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;


import java.io.File;

public class UpDateProfile {

    public static final Target CLICK_UPDATE_PROFILE = Target
            .the("Enter click in the profile")
            .located(By.xpath("//a[normalize-space()='Información personal']"));

    public static final By UPDATE_PHOTO = By.xpath("//input[@id='image']");

    public static final Target NAME_PROFILE = Target
            .the("Enter the name")
            .located(By.xpath("//input[@id='name']"));

    public static final Target LAST_NAME_PROFILE = Target
            .the("Enter the last name")
            .located(By.xpath("//input[@id='lastName']"));

    public static final Target DATE_PROFILE = Target
            .the("Enter the Date")
            .located(By.xpath("//input[@id='bornDate']"));

    public static final By COUNTRY_PROFILE = By.xpath("(//*[@id='country'])");

    public static final Target SELECT_COUNTRY = Target
            .the("Select the country")
            .located(By.xpath("(//*[@id='country'])option[3]"));

    public static final Target SAVE_PROFILE = Target
            .the("Click in save profile")
            .located(By.id("save-profile"));

    public static final Target CONFIRM_PURCHASE = Target
            .the("The message is visible")
            .located(By.className("confirmation-modal-info"));
}
//*[@class='confirmation-modal-info']
