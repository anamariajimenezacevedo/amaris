package com.fallabela.task;

import com.fallabela.models.User;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static com.fallabela.utils.constants.errosMessage.IMPOSIBLE_INSTANCIAR;


public class UserTasks {

    private UserTasks() {
        throw new RuntimeException(IMPOSIBLE_INSTANCIAR.getMensaje());
    }

    public static Performable consultarUsuarioId(int id) {
        return Task.where("{0} fetches the user with id #id",
                Get.resource("/users/{id}")
                        .with( request -> request.pathParam("id", id))
        );
    }

    public static Performable eliminarUsuarioId(int id) {
        return Task.where("{0} fetches the user with id #id",
                Delete.from("/users/{id}")
                        .with( request -> request.pathParam("id", id))
        );
    }

    public static Performable listaTodosUsuarios() {
        return Task.where("{0} fetches all users",
                Get.resource("/user").with(request -> request.header("app-id","66512f46d2c0f8b7a8ed8b1d")
                )
        );
    }

    public static Performable agregarUsuario(String firstName, String lastName, String email) {
        User newUser = new User(firstName, lastName, email);
        return Task.where("{0} fetches the user with id #id",
                Post.to("/user/create")
                        .with(request -> request.header("app-id","66512f46d2c0f8b7a8ed8b1d").header("Content-Type", "application/json")
                                .body(newUser)
                        )

        );

    }

}

