Feature: Página inicial
  Como usuario web
  Quiero navegar en PhpTravels
  And Hacer una reserva de viaje en la pagina

  @Prueba
Scenario: Como usuario de la web, quiero navegar por la página Acerca de nosotros de PHPTravels
  Given El usuario esta en la home Page
  When Selcciono un tour
  And Selecciono una fecha
  Then Todo salio bien