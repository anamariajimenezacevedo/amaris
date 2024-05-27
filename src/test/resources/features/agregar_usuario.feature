Feature: Agregar un usuario con su informacion.
  Yo como usuario, necesito añadir una nueva persona para guardar sus datos.

  Scenario: Agregar nuevo usuario
    When agrega un usuario con nombre "Ana" apellido "Jimenez" correo "anaa@gmail.com"
    Then responda el estado 200
    And el usuario se guarda correctamente