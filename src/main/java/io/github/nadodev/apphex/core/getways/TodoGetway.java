package io.github.nadodev.apphex.core.getways;

import io.github.nadodev.apphex.core.entities.Todo;
import io.github.nadodev.apphex.core.enums.StatusTodoEnum;

import java.util.List;

public interface TodoGetway {
    Todo create(Todo todo);

    Todo findById(Long id);

    List<Todo> listAll();

    Todo changeStatus(StatusTodoEnum status, Long id);

}
