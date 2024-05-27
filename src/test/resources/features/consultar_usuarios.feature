Feature: Listar todos los usuarios
  Yo como usuario, quiero listar todos los usuarios agregados.

  Scenario: Listar todos los usuarios
    When liste todos los usuarios
    Then responda el estado 200
    And todos los usuarios 20 esperados deben de ser listados