package com.fallabela.questions;

import com.fallabela.models.User;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Question;

import java.util.List;

import static com.fallabela.utils.constants.errosMessage.IMPOSIBLE_INSTANCIAR;

public class UserQuestions {

    private UserQuestions() {
        throw new RuntimeException(IMPOSIBLE_INSTANCIAR.getMensaje());
    }

    public static Question<List<User>> allTheExpectedUsers() {
        return actor -> SerenityRest.lastResponse()
                .jsonPath()
                .getList("data", User.class);
    }

    public static Question<String> theExpectedUser() {
        return actor -> SerenityRest.lastResponse()
                .jsonPath()
                .getString("id");
    }
}
