@ChallengeQA
Feature: Purchase products as guest

  @Shopping
  Scenario Outline: Realizar compra
    Realizar una compra en modo invitado

    Given El usuario ingresa a la pagina inicial
    When Selecciona los productos a comprar
    Then Se agregan los productos en el icono del carrito
    And Dar click en ver productos
    Then Se deben mostrar los productos seleccionados
    And Dar click en la opcion de pago

    #Ingresar datos del cliente y confirmar compra
    When Debe ingresar <firstname> <lastname> <email> <phone> <address1> <city> <postcode>
    Then Se visualiza el metodo de envio
    And Compra realizada con exito

    Examples:
      | firstname | lastname | email                | phone      | address1 | city | postcode |
      | Antonio   | Aguilar  | waaguilars@gmail.com | 0123456789 | Ecuador  | Loja | 987654   |