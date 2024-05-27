Feature: Agregar un usuario con su informacion
  Yo como usuario, necesito agregar un usuario con su nombre y apellido porque necesito guardar sus datos.

  Scenario: add a new user
    When add a user with first name "Ana" and last name "Maria" and email "andrerd@gmail.com"
    Then response status code is 200
    And the user was saved correctly


