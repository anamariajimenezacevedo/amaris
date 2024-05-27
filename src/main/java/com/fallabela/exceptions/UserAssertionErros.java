package com.fallabela.exceptions;

public class UserAssertionErros extends AssertionError {

    public static final String LISTA_INCOMPLETA = "El numero total de los usuarios no es el correcto";
    public static final String USUARIO_NO_ENCONTRADO = "Los datos del usuario no son correctos";
    public static final String ESTADO_NO_CORRECTO = "El estado no es correcto";
    public static final String USUARIO_NO_REGISTRADO = "El usuario no se registro correctmante";
    public static final String USUARIO_NO_ELIMINADO = "El usuario no fue eliminado";


    public UserAssertionErros(String message) {
        super(message);
    }

    public UserAssertionErros(String message, Throwable testErrorException) {
        super(message, testErrorException);
    }

}
