package com.wappiApp.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;

public class Login {

    public static final Target ENTER_USER_NAME = Target
            .the("Enter user name")
            .located(By.id("username"));

    public static final Target ENTER_PASSWORD = Target
            .the("Enter password")
            .located(By.id("password"));

    public static final Target ENTER_LOGIN = Target
            .the("Enter Login")
            .located(By.id("button-login"));

    public static final Target CONFIRM_MESSAGE = Target
            .the("The message is visible")
            .located(By.className("app-title"));


}

