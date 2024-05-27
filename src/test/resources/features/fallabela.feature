Feature: Realizar compras en la pafina web de fallabela
  Yo como usuario de la pagina de Fallabela
  Quiero seleccionar algunos productos
  Para validar el valor total

  Scenario: Seleccionar articulos deportivos
    Given el usuario ingrese a las categorias
    When el usuario selecciona los articulos deportivos
      | nombre | apellido | direccion    | apatamneto | pais     |
      | ana    | jimenez  | cll 35 # 2-3 | antioquia  | colombia |
    Then validamos el valor total