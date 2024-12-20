package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement txtUserName;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement txtPasword;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnLogin;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Sorry, this user has been locked out.\"]")
    private WebElement lblError;

    public void clickLogin() {
        btnLogin.click();
    }

    public void enterPassword(String password) {
        txtPasword.sendKeys(password);
    }

    public void enterUser(String user) {
        txtUserName.sendKeys(user);
    }

    public boolean isErrorDisplayed() {

        return lblError.isEnabled();
    }

    public String getErrorText() {
        waitFor(ExpectedConditions.visibilityOf(lblError));
        return lblError.getText();
    }
}
