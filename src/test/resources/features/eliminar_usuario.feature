Feature: Eliminar usuario con su ID
  Yo como usuario deseo eliminar un usuario con su respectivo ID

  Scenario: Eliminar un usuario ya agregado
    When elimina el usuario con el id "60d0fe4f5311236168a109cb"
    Then responda el estado 200
    And el usuario con nombre "Ana" y apellido "Jimenez" debe ser eliminado