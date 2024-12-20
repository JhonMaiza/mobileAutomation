package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.ProductScreen;
import org.junit.Assert;

public class LoginSteps {
    LoginScreen loginScreen;
    ProductScreen productScreen;

    public void login(String user, String password){
        loginScreen.enterUser(user);
        loginScreen.enterPassword(password);
        loginScreen.clickLogin();
    }

    public void loginSuccess(){
        Assert.assertTrue("Visibilidad de titulo products", productScreen.isProductDisplayed());
    }

    public void getPage() {

    }

    public void validateError(String error) {
        Assert.assertTrue("NO se mostró el erro", loginScreen.isErrorDisplayed());
        Assert.assertEquals("Mensaje de error", error, loginScreen.getErrorText());
    }
}
