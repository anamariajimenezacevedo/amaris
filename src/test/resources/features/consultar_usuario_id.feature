Feature: Consultar la informacion de un usuario con su ID
  Yo como usuario deseo consultar un usuario con su respectivo ID

  Scenario: Consultar un usuario ya agregado
    When encuentra el usuario con el id "60d0fe4f5311236168a109cb"
    Then responda el estado 200
    And user whit first name "George" and last name "Bluth" should be correct
