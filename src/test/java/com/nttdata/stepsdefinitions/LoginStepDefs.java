package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.assertj.core.api.Assertions;

public class LoginStepDefs {
    @Steps
    LoginSteps loginSteps;
    @Given("que estoy en la aplicación de Swag labs")
    public void queEstoyEnLaAplicacionDeSwagLabs() {
        loginSteps.getPage();
    }

    @When("ingreso mis credenciales username {string} y password {string}")
    public void ingresoMisCredencialesUsernameYPassword(String username, String password) {
        loginSteps.login(username, password);
    }

    @Then("el inicio de sesión es exitoso")
    public void elInicioDeSesionEsExitoso() {
        loginSteps.loginSuccess();
    }


    @Then("se muesta el mensaje de error {string}")
    public void seMuestaElMensajeDeError(String error) {
        loginSteps.validateError(error);
    }
}
