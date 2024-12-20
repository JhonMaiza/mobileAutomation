@login
Feature: Login Sauce Demo
  @login_success
  Scenario: Login con credenciales validas
    Given que estoy en la aplicación de Swag labs
    When ingreso mis credenciales username "standard_user" y password "secret_sauce"
    Then el inicio de sesión es exitoso

  @login_user_locked
  Scenario: Login con usario bloqueado
    Given que estoy en la aplicación de Swag labs
    When ingreso mis credenciales username "locked_out_user" y password "secret_sauce"
    Then se muesta el mensaje de error "Sorry, this user has been locked out."