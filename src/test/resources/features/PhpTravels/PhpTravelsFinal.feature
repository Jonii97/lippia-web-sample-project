Feature: Página inicial, como usuario web quiero navegar en PhpTravels
And Hacer una reserva de viaje en la pagina

  @Prueba
  Scenario: Como usuario de la web quiero navegar por la página de PHPTravels y realizar una reserva
    Given El usuario esta en la home Page
    When Selecciono un Tour
    And Ingresa una fecha
    Then Click Book



  @Prueba2
  Scenario Outline: Como usuario quiero cargar mis datos personales
    Given El usuario esta en la pagina de carga de datos
    When El usuario ingresa los datos: Nombre <name>, Apellido <lastName>, Email <email>, Confirmacion <confirm>, Numero <number>, Contacto <address>
    And Selecciona un pais
    And Agrega un extra
    And Agrega otro extra
    Then Confirma la reserva

    Examples:
      | name    | lastName | email                  | confirm                | number     | address               |
      | Jonatan | Firmapaz | jonifirmapaz@gmail.com | jonifirmapaz@gmail.com | 3794095040 | prueba.pepe@gmail.com |
